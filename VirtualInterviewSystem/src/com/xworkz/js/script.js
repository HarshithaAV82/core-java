const AUTH_ADMIN_EMAIL = "admin@gmail.com";
const AUTH_ADMIN_PASSWORD = "1234";
const INTERVIEW_QUESTIONS = {
    HR: [
        "Tell me about yourself.",
        "What are your strengths?",
        "Why should we hire you?"
    ],
    Technical: [
        "Explain your favorite programming project.",
        "What is object-oriented programming?",
        "How do you handle errors in code?"
    ]
};

let currentInterviewType = "";
let currentQuestionIndex = 0;
let mediaRecorder = null;
let recordedChunks = [];
let currentAudioUrl = "";

function normalizeEmail(email) {
    return email.trim().toLowerCase();
}

function isLoggedIn() {
    return sessionStorage.getItem("isLoggedIn") === "true";
}

function getRegisteredUser() {
    const email = sessionStorage.getItem("registeredEmail");
    const name = sessionStorage.getItem("registeredName");
    return email ? { email, name } : null;
}

function redirectIfLoggedIn() {
    if (isLoggedIn()) {
        window.location.href = "dashboard.html";
    }
}

function redirectIfLoggedOut() {
    if (!isLoggedIn()) {
        window.location.href = "login.html";
    }
}

function setCurrentUser(email) {
    sessionStorage.setItem("currentUser", normalizeEmail(email));
}

function loginCheck() {
    const emailInput = document.getElementById("email").value;
    const password = document.getElementById("password").value.trim();
    const message = document.getElementById("message");

    const email = normalizeEmail(emailInput);
    const storedUser = getRegisteredUser();
    const storedEmail = storedUser ? normalizeEmail(storedUser.email) : null;
    const storedPassword = sessionStorage.getItem("registeredPassword");

    const validAdmin = email === normalizeEmail(AUTH_ADMIN_EMAIL) && password === AUTH_ADMIN_PASSWORD;
    const validRegistered = storedEmail && storedPassword && email === storedEmail && password === storedPassword;

    if (validAdmin || validRegistered) {
        sessionStorage.setItem("isLoggedIn", "true");
        setCurrentUser(email);
        window.location.href = "dashboard.html";
        return false;
    }

    message.textContent = "Invalid login. Use admin@gmail.com / 1234 or your registered account.";
    return false;
}

function registerCheck() {
    const name = document.getElementById("name").value.trim();
    const emailInput = document.getElementById("email").value;
    const password = document.getElementById("password").value.trim();
    const message = document.getElementById("message");

    const email = normalizeEmail(emailInput);
    if (name && email && password) {
        sessionStorage.setItem("registeredName", name);
        sessionStorage.setItem("registeredEmail", email);
        sessionStorage.setItem("registeredPassword", password);
        sessionStorage.setItem("isLoggedIn", "true");
        setCurrentUser(email);
        window.location.href = "dashboard.html";
        return false;
    }

    message.textContent = "Please fill out all fields to register.";
    return false;
}

function logout() {
    sessionStorage.removeItem("isLoggedIn");
    sessionStorage.removeItem("currentUser");
    window.location.href = "login.html";
}

function getWelcomeName() {
    const registeredUser = getRegisteredUser();
    if (registeredUser && registeredUser.name) {
        return registeredUser.name;
    }
    return "Candidate";
}

function initDashboard() {
    redirectIfLoggedOut();
    const welcome = document.getElementById("welcomeName");
    if (welcome) {
        welcome.textContent = getWelcomeName();
    }
}

function initInterview(type) {
    redirectIfLoggedOut();
    currentInterviewType = type;
    currentQuestionIndex = 0;
    recordedChunks = [];
    currentAudioUrl = "";

    document.getElementById("finishButton").disabled = true;
    document.getElementById("stopButton").disabled = true;
    document.getElementById("nextButton").disabled = true;
    document.getElementById("audioPlayback").style.display = "none";
    document.getElementById("audioPlayback").src = "";

    showInterviewQuestion();
}

function showInterviewQuestion() {
    const questions = INTERVIEW_QUESTIONS[currentInterviewType];
    const questionText = document.getElementById("questionText");
    const statusText = document.getElementById("statusText");

    if (!questions || questions.length === 0) {
        questionText.textContent = "No questions available.";
        return;
    }

    questionText.textContent = `Question ${currentQuestionIndex + 1} of ${questions.length}: ${questions[currentQuestionIndex]}`;
    statusText.textContent = "Press Start Recording to answer in your voice.";
}

function startRecording() {
    const recordButton = document.getElementById("recordButton");
    const stopButton = document.getElementById("stopButton");
    const statusText = document.getElementById("statusText");

    if (!navigator.mediaDevices || !navigator.mediaDevices.getUserMedia) {
        statusText.textContent = "Audio recording is not supported by this browser.";
        return;
    }

    navigator.mediaDevices.getUserMedia({ audio: true }).then((stream) => {
        recordedChunks = [];
        mediaRecorder = new MediaRecorder(stream);

        mediaRecorder.ondataavailable = (event) => {
            if (event.data.size > 0) {
                recordedChunks.push(event.data);
            }
        };

        mediaRecorder.onstop = () => {
            const audioBlob = new Blob(recordedChunks, { type: "audio/webm" });
            currentAudioUrl = URL.createObjectURL(audioBlob);
            const audioPlayback = document.getElementById("audioPlayback");
            audioPlayback.src = currentAudioUrl;
            audioPlayback.style.display = "block";
            document.getElementById("nextButton").disabled = false;
            statusText.textContent = "Recording complete. Replay your answer or go to the next question.";
            stopButton.disabled = true;
            recordButton.disabled = false;
            stream.getTracks().forEach((track) => track.stop());
        };

        mediaRecorder.start();
        statusText.textContent = "Recording... speak your answer now.";
        recordButton.disabled = true;
        stopButton.disabled = false;
    }).catch((error) => {
        statusText.textContent = "Microphone access was denied or unavailable.";
        console.error(error);
    });
}

function stopRecording() {
    if (mediaRecorder && mediaRecorder.state === "recording") {
        mediaRecorder.stop();
    }
}

function nextQuestion() {
    const questions = INTERVIEW_QUESTIONS[currentInterviewType];
    currentQuestionIndex += 1;

    if (currentQuestionIndex >= questions.length) {
        document.getElementById("questionText").textContent = "All questions finished.";
        document.getElementById("statusText").textContent = "You can submit your interview now.";
        document.getElementById("recordButton").disabled = true;
        document.getElementById("stopButton").disabled = true;
        document.getElementById("nextButton").disabled = true;
        document.getElementById("finishButton").disabled = false;
        return;
    }

    const audioPlayback = document.getElementById("audioPlayback");
    audioPlayback.style.display = "none";
    audioPlayback.src = "";
    document.getElementById("nextButton").disabled = true;
    document.getElementById("finishButton").disabled = true;
    document.getElementById("recordButton").disabled = false;
    document.getElementById("stopButton").disabled = true;

    showInterviewQuestion();
}

function finishInterview(type) {
    sessionStorage.setItem("lastInterviewType", type);
    window.location.href = "result.html";
    return false;
}

function loadResult() {
    redirectIfLoggedOut();
    const type = sessionStorage.getItem("lastInterviewType");
    const message = document.getElementById("resultMessage");

    if (!type) {
        message.textContent = "No interview was selected. Please return to the dashboard.";
        return;
    }

    message.textContent = `Your ${type} interview is complete. Good job!`;
    sessionStorage.removeItem("lastInterviewType");
}
