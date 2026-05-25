/**
 * Virtual Speaking Interview System - JavaScript File
 * Beginner-friendly code for interview management and voice recording
 */

// ============================================
// UTILITY FUNCTIONS
// ============================================

/**
 * Get URL query parameter value
 * Example: getQueryParam("name") from URL with ?name=John
 */
function getQueryParam(name) {
    const params = new URLSearchParams(window.location.search);
    return params.get(name);
}

// ============================================
// LOGIN & REGISTRATION FUNCTIONS
// ============================================

/**
 * Validate login form before submission
 */
function validateLoginForm(event) {
    const email = document.getElementById("email").value.trim();
    const password = document.getElementById("password").value.trim();
    const error = document.getElementById("loginError");
    error.textContent = "";

    // Check if email and password are filled
    if (!email || !password) {
        error.textContent = "Please enter both email and password.";
        event.preventDefault();
        return false;
    }

    return true;
}

/**
 * Validate registration form before submission
 */
function validateRegisterForm(event) {
    const name = document.getElementById("name").value.trim();
    const email = document.getElementById("email").value.trim();
    const password = document.getElementById("password").value.trim();
    const error = document.getElementById("registerError");
    error.textContent = "";

    // Check if all fields are filled
    if (!name || !email || !password) {
        error.textContent = "Please fill out all registration fields.";
        event.preventDefault();
        return false;
    }

    if (!isStrongPassword(password)) {
        error.textContent = "Password must be at least 8 characters and include uppercase, lowercase, number, and symbol.";
        event.preventDefault();
        return false;
    }

    return true;
}

function isStrongPassword(password) {
    return password.length >= 8 && /[A-Z]/.test(password) && /[a-z]/.test(password) && /[0-9]/.test(password) && /[^A-Za-z0-9]/.test(password);
}

function getStoredCredentials() {
    return {
        name: localStorage.getItem("registeredName") || "",
        email: localStorage.getItem("registeredEmail") || "",
        password: localStorage.getItem("registeredPassword") || ""
    };
}

function handleLogin(event) {
    event.preventDefault();
    if (!validateLoginForm(event)) {
        return false;
    }

    const email = document.getElementById("email").value.trim().toLowerCase();
    const password = document.getElementById("password").value.trim();
    const stored = getStoredCredentials();
    const isAdmin = email === "admin@gmail.com" && password === "1234";
    const isRegistered = stored.email && stored.password && email === stored.email && password === stored.password;

    if (isAdmin || isRegistered) {
        sessionStorage.setItem("isLoggedIn", "true");
        sessionStorage.setItem("userName", isAdmin ? "Admin" : stored.name);
        sessionStorage.setItem("userEmail", email);
        sessionStorage.setItem("flashMessage", `Welcome back, ${isAdmin ? "Admin" : stored.name}!`);
        window.location.href = "dashboard.html";
        return true;
    }

    const error = document.getElementById("loginError");
    if (error) {
        error.textContent = "Invalid login credentials. Please register or use admin@gmail.com / 1234.";
    }
    return false;
}

function handleRegister(event) {
    event.preventDefault();
    if (!validateRegisterForm(event)) {
        return false;
    }

    const name = document.getElementById("name").value.trim();
    const email = document.getElementById("email").value.trim().toLowerCase();
    const password = document.getElementById("password").value.trim();
    const stored = getStoredCredentials();

    if (stored.email && stored.email === email) {
        const error = document.getElementById("registerError");
        if (error) {
            error.textContent = "This email is already registered. Please login instead.";
        }
        return false;
    }

    localStorage.setItem("registeredName", name);
    localStorage.setItem("registeredEmail", email);
    localStorage.setItem("registeredPassword", password);
    sessionStorage.setItem("isLoggedIn", "true");
    sessionStorage.setItem("userName", name);
    sessionStorage.setItem("userEmail", email);
    sessionStorage.setItem("flashMessage", `Registration complete. Welcome, ${name}!`);

    window.location.href = "dashboard.html";
    return true;
}

function handleForgotPassword(event) {
    event.preventDefault();
    const email = document.getElementById("forgotEmail").value.trim().toLowerCase();
    const newPassword = document.getElementById("newPassword").value.trim();
    const confirmPassword = document.getElementById("confirmPassword").value.trim();
    const message = document.getElementById("forgotMessage");
    const error = document.getElementById("forgotError");
    if (message) {
        message.textContent = "";
    }
    if (error) {
        error.textContent = "";
    }

    const stored = getStoredCredentials();
    if (!email) {
        if (error) {
            error.textContent = "Please enter the email used during registration.";
        }
        return false;
    }

    if (!stored.email || email !== stored.email) {
        if (error) {
            error.textContent = "No account found with that email. Please register first.";
        }
        return false;
    }

    if (!newPassword || !confirmPassword) {
        if (error) {
            error.textContent = "Please enter and confirm your new password.";
        }
        return false;
    }

    if (newPassword !== confirmPassword) {
        if (error) {
            error.textContent = "New password and confirm password must match.";
        }
        return false;
    }

    if (!isStrongPassword(newPassword)) {
        if (error) {
            error.textContent = "Password must be at least 8 characters long and include uppercase, lowercase, number, and symbol.";
        }
        return false;
    }

    localStorage.setItem("registeredPassword", newPassword);
    window.location.href = `reset-success.html?email=${encodeURIComponent(email)}`;
    return true;
}

function showResetSuccessMessage() {
    applyDarkModeFromStorage();
    applyLanguage();
    const email = getQueryParam("email") || "";
    const messageElement = document.getElementById("resetSuccessMessage");
    const countdownElement = document.getElementById("resetCountdown");
    if (messageElement) {
        messageElement.textContent = email
            ? `Password reset successful for ${email}. Redirecting to login...`
            : "Password reset successful. Redirecting to login...";
    }
    let countdown = 5;
    if (countdownElement) {
        countdownElement.textContent = countdown;
    }
    const timer = setInterval(() => {
        countdown -= 1;
        if (countdownElement) {
            countdownElement.textContent = countdown;
        }
        if (countdown <= 0) {
            clearInterval(timer);
            window.location.href = "login.html";
        }
    }, 1000);
}

/**
 * Display error messages from URL query parameters
 */
function displayErrorFromQuery() {
    const error = getQueryParam("error");
    if (!error) {
        return;
    }

    // Show error in login form if present
    const loginError = document.getElementById("loginError");
    if (loginError) {
        loginError.textContent = error;
    }
    
    // Show error in register form if present
    const registerError = document.getElementById("registerError");
    if (registerError) {
        registerError.textContent = error;
    }
}

// ============================================
// DASHBOARD FUNCTIONS
// ============================================

/**
 * Load dashboard and display user name
 */
function loadDashboard() {
    applyDarkModeFromStorage();
    const name = getQueryParam("name") || sessionStorage.getItem("userName");
    if (name) {
        document.getElementById("dashboardName").textContent = name;
        sessionStorage.setItem("userName", name);
        sessionStorage.setItem("isLoggedIn", "true");
    }

    const flashMessage = sessionStorage.getItem("flashMessage");
    if (flashMessage) {
        const messageEl = document.getElementById("dashboardMessage");
        if (messageEl) {
            messageEl.textContent = flashMessage;
            messageEl.style.display = "block";
        }
        sessionStorage.removeItem("flashMessage");
    }

    const savedRole = sessionStorage.getItem("selectedJobRole") || "General";
    selectedJobRole = savedRole;
    const roleSelect = document.getElementById("jobRoleSelect");
    if (roleSelect) {
        roleSelect.value = savedRole;
    }

    const savedDifficulty = getSavedDifficulty();
    const difficultySelect = document.getElementById("difficultySelect");
    if (difficultySelect) {
        difficultySelect.value = savedDifficulty;
    }

    const savedLanguage = getSelectedLanguage();
    const languageSelect = document.getElementById("languageSelect");
    if (languageSelect) {
        languageSelect.value = savedLanguage;
    }

    applyLanguage();
    updateDailyStreak();
    renderBadges();
    renderInterviewHistory();

    if (!name && sessionStorage.getItem("isLoggedIn") !== "true") {
        window.location.href = "login.html";
    }
}

/**
 * Logout user and clear session data
 */
function logoutUser() {
    sessionStorage.removeItem("userName");
    sessionStorage.removeItem("isLoggedIn");
    window.location.href = "login.html";
}

// ============================================
// INTERVIEW QUESTIONS & CONFIGURATION
// ============================================

/**
 * Interview questions for HR and Technical rounds
 */
const INTERVIEW_QUESTIONS = {
    HR: [
        "Tell me about yourself.",
        "What are your strengths?",
        "Why should we hire you?",
        "How do you handle stress?",
        "Where do you see yourself in 5 years?",
        "Describe a challenging situation and how you resolved it.",
        "What is your biggest weakness and how do you manage it?",
        "How do you prioritize tasks under tight deadlines?",
        "How do you handle feedback from supervisors?",
        "Give an example of a time you worked well in a team.",
        "Why are you interested in this company?",
        "What motivates you at work?",
        "How do you manage work-life balance?",
        "Describe a leadership experience that you are proud of.",
        "How do you stay current with industry trends?"
    ],
    Technical: [
        "Explain object-oriented programming.",
        "What is the difference between array and ArrayList?",
        "What are the four pillars of OOPS?",
        "Explain the concept of inheritance.",
        "What is polymorphism?",
        "Describe how a hash table works.",
        "What is the difference between synchronous and asynchronous code?",
        "Explain RESTful APIs.",
        "What is a database index and why is it useful?",
        "Describe a time complexity of O(n log n).",
        "What is the difference between HTTP and HTTPS?",
        "Explain the concept of recursion with an example.",
        "What is a design pattern and why would you use one?",
        "How does version control help software development?",
        "Describe a situation where you debugged a complex issue."
    ]
};

const DIFFICULTY_TIMERS = {
    Easy: 90,
    Medium: 60,
    Hard: 45
};

const INTERVIEW_TIPS = {
    HR: {
        Easy: "Start with a positive introduction and connect your skills to the role.",
        Medium: "Use structured answers such as STAR (Situation, Task, Action, Result).",
        Hard: "Be concise, use examples, and demonstrate confidence under pressure."
    },
    Technical: {
        Easy: "Explain concepts in plain language and walk through examples.",
        Medium: "Describe your solution step-by-step and mention edge cases.",
        Hard: "Highlight tradeoffs, performance, and how you debugged the problem."
    }
};

const LANGUAGE_OPTIONS = {
    en: "English",
    es: "Español",
    hi: "हिन्दी"
};

const LANGUAGE_RESOURCES = {
    en: {
        title: "Virtual Interview System",
        welcome: "Welcome,",
        chooseInterviewText: "Choose the interview type below.",
        selectJobRole: "Select Job Role",
        difficultyLevel: "Difficulty Level",
        hrInterview: "HR Interview",
        technicalInterview: "Technical Interview",
        logout: "Logout",
        interviewHistory: "Interview History",
        dailyStreak: "Daily Streak",
        badges: "Badges",
        language: "Language",
        interviewTip: "Interview Tip",
        startRecording: "Start Recording",
        stopRecording: "Stop Recording",
        nextQuestion: "Next Question",
        submitHR: "Submit HR Interview",
        submitTechnical: "Submit Technical Interview",
        backToDashboard: "Back to Dashboard",
        transcriptLabel: "Live Transcript",
        noTranscript: "Transcript will appear here when speech recognition is active."
    },
    es: {
        title: "Sistema de Entrevistas Virtual",
        welcome: "Bienvenido,",
        chooseInterviewText: "Elige el tipo de entrevista a continuación.",
        selectJobRole: "Seleccionar puesto",
        difficultyLevel: "Nivel de dificultad",
        hrInterview: "Entrevista RRHH",
        technicalInterview: "Entrevista Técnica",
        logout: "Cerrar sesión",
        interviewHistory: "Historial de entrevistas",
        dailyStreak: "Racha diaria",
        badges: "Insignias",
        language: "Idioma",
        interviewTip: "Consejo de entrevista",
        startRecording: "Iniciar grabación",
        stopRecording: "Detener grabación",
        nextQuestion: "Siguiente pregunta",
        submitHR: "Enviar entrevista RRHH",
        submitTechnical: "Enviar entrevista técnica",
        backToDashboard: "Volver al tablero",
        transcriptLabel: "Transcripción en vivo",
        noTranscript: "La transcripción aparecerá aquí cuando el reconocimiento de voz esté activo."
    },
    hi: {
        title: "वर्चुअल इंटरव्यू सिस्टम",
        welcome: "स्वागत है,",
        chooseInterviewText: "नीचे इंटरव्यू प्रकार चुनें।",
        selectJobRole: "जॉब रोल चुनें",
        difficultyLevel: "कठिनाई स्तर",
        hrInterview: "एचआर इंटरव्यू",
        technicalInterview: "तकनीकी इंटरव्यू",
        logout: "लॉग आउट",
        interviewHistory: "इंटरव्यू इतिहास",
        dailyStreak: "दैनिक स्ट्रीक",
        badges: "बैज",
        language: "भाषा",
        interviewTip: "इंटरव्यू टिप",
        startRecording: "रिकॉर्डिंग शुरू करें",
        stopRecording: "रिकॉर्डिंग रोकें",
        nextQuestion: "अगला प्रश्न",
        submitHR: "एचआर इंटरव्यू सबमिट करें",
        submitTechnical: "तकनीकी इंटरव्यू सबमिट करें",
        backToDashboard: "डैशबोर्ड पर वापस जाएं",
        transcriptLabel: "लाइव ट्रांसक्रिप्शन",
        noTranscript: "जब स्पीच रिकॉग्निशन सक्रिय होगा तो ट्रांसक्रिप्शन यहाँ दिखाई देगा।"
    }
};

let currentInterviewQuestions = [];
let speechRecognition = null;
let recognitionActive = false;

// ============================================
// INTERVIEW RECORDING VARIABLES
// ============================================

let currentInterviewType = "";        // HR or Technical
let currentQuestionIndex = 0;          // Current question number
let mediaRecorder = null;              // MediaRecorder object
let recordedChunks = [];               // Array to store audio chunks
let questionTimer = null;              // Timer interval for each question
let timeRemaining = 60;                // Remaining seconds for current question
let questionTimeLimit = 60;            // Time limit per question
let recordStartTime = 0;               // Timestamp when recording starts
let questionScores = [];               // Scores for individual answers
let selectedJobRole = "General";      // Currently selected job role
let selectedDifficulty = "Medium";    // Difficulty setting

// ============================================
// INTERVIEW PAGE FUNCTIONS
// ============================================

function getSavedDifficulty() {
    return localStorage.getItem("selectedDifficulty") || "Medium";
}

function saveDifficulty(value) {
    selectedDifficulty = value;
    localStorage.setItem("selectedDifficulty", value);
    const difficultyUnderline = document.getElementById("selectedDifficultyText");
    if (difficultyUnderline) {
        difficultyUnderline.textContent = value;
    }
}

function getCurrentTimeLimit() {
    return DIFFICULTY_TIMERS[getSavedDifficulty()] || 60;
}

function getInterviewTip() {
    return INTERVIEW_TIPS[currentInterviewType]?.[getSavedDifficulty()] || "Stay calm and keep your answer structured.";
}

function getSelectedLanguage() {
    return localStorage.getItem("selectedLanguage") || "en";
}

function saveLanguage(value) {
    localStorage.setItem("selectedLanguage", value);
    applyLanguage();
}

function applyLanguage() {
    const lang = getSelectedLanguage();
    const resources = LANGUAGE_RESOURCES[lang] || LANGUAGE_RESOURCES.en;
    document.title = resources.title;
    document.querySelectorAll("[data-i18n]").forEach((el) => {
        const key = el.dataset.i18n;
        if (key && resources[key]) {
            el.textContent = resources[key];
        }
    });
    const languageSelect = document.getElementById("languageSelect");
    if (languageSelect) {
        languageSelect.value = lang;
    }
    const transcriptText = document.getElementById("transcriptText");
    if (transcriptText && !transcriptText.textContent.trim()) {
        transcriptText.textContent = resources.noTranscript;
    }
}

function getSpeechRecognitionLanguage() {
    const lang = getSelectedLanguage();
    if (lang === "es") return "es-ES";
    if (lang === "hi") return "hi-IN";
    return "en-US";
}

function hasSpeechRecognition() {
    return !!(window.SpeechRecognition || window.webkitSpeechRecognition);
}

function startSpeechRecognition() {
    const transcriptText = document.getElementById("transcriptText");
    if (!hasSpeechRecognition()) {
        if (transcriptText) {
            transcriptText.textContent = LANGUAGE_RESOURCES[getSelectedLanguage()].noTranscript;
        }
        return;
    }
    if (recognitionActive) {
        return;
    }

    const Recognition = window.SpeechRecognition || window.webkitSpeechRecognition;
    speechRecognition = new Recognition();
    speechRecognition.continuous = true;
    speechRecognition.interimResults = true;
    speechRecognition.lang = getSpeechRecognitionLanguage();
    speechRecognition.onresult = function(event) {
        const transcript = Array.from(event.results).map(result => result[0].transcript).join(" ").trim();
        if (transcriptText) {
            transcriptText.textContent = transcript || LANGUAGE_RESOURCES[getSelectedLanguage()].noTranscript;
        }
    };
    speechRecognition.onerror = function() {
        if (transcriptText) {
            transcriptText.textContent = LANGUAGE_RESOURCES[getSelectedLanguage()].noTranscript;
        }
    };
    speechRecognition.onend = function() {
        recognitionActive = false;
    };
    recognitionActive = true;
    speechRecognition.start();
}

function stopSpeechRecognition() {
    if (speechRecognition && recognitionActive) {
        speechRecognition.stop();
        recognitionActive = false;
    }
}

function clearTranscript() {
    const transcriptText = document.getElementById("transcriptText");
    if (transcriptText) {
        transcriptText.textContent = LANGUAGE_RESOURCES[getSelectedLanguage()].noTranscript;
    }
}

function shuffleArray(array) {
    const copy = array.slice();
    for (let i = copy.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [copy[i], copy[j]] = [copy[j], copy[i]];
    }
    return copy;
}

function getRandomInterviewQuestions(type, count = 5) {
    const questions = INTERVIEW_QUESTIONS[type] || [];
    if (!questions.length) {
        return [];
    }
    const shuffled = shuffleArray(questions);
    return shuffled.slice(0, Math.min(count, shuffled.length));
}

function updateDailyStreak() {
    const today = new Date();
    const todayKey = today.toISOString().slice(0, 10);
    const yesterdayKey = new Date(today.getTime() - 86400000).toISOString().slice(0, 10);
    const lastDate = localStorage.getItem("lastStreakDate");
    let streak = parseInt(localStorage.getItem("dailyStreak") || "0", 10) || 0;

    if (lastDate === todayKey) {
        // already counted today
    } else if (lastDate === yesterdayKey) {
        streak += 1;
        localStorage.setItem("dailyStreak", streak.toString());
        localStorage.setItem("lastStreakDate", todayKey);
    } else {
        streak = 1;
        localStorage.setItem("dailyStreak", "1");
        localStorage.setItem("lastStreakDate", todayKey);
    }

    const streakCount = document.getElementById("streakCount");
    if (streakCount) {
        streakCount.textContent = `${streak} day${streak === 1 ? "" : "s"}`;
    }
}

function getInterviewHistory() {
    try {
        return JSON.parse(localStorage.getItem("interviewHistory") || "[]");
    } catch (error) {
        return [];
    }
}

function addInterviewHistory(entry) {
    const history = getInterviewHistory();
    history.unshift(entry);
    localStorage.setItem("interviewHistory", JSON.stringify(history.slice(0, 20)));
    renderInterviewHistory();
    renderBadges();
}

function renderInterviewHistory() {
    const historyList = document.getElementById("historyList");
    if (!historyList) {
        return;
    }

    const interviewHistory = getInterviewHistory();
    if (!interviewHistory.length) {
        historyList.innerHTML = "<div class='text-muted'>No interviews completed yet.</div>";
        return;
    }

    historyList.innerHTML = interviewHistory.map(entry => {
        return `
            <div class="list-group-item p-3 mb-2">
                <div class="d-flex justify-content-between align-items-start mb-2">
                    <div>
                        <strong>${entry.interviewType}</strong>
                        <div class="small text-muted">${entry.jobRole} • ${entry.difficulty}</div>
                        <div class="small text-muted">${formatDate(entry.timestamp)}</div>
                    </div>
                    <span class="badge bg-success rounded-pill">${entry.score}/100</span>
                </div>
                <p class="mb-0">${entry.questions} questions completed</p>
            </div>
        `;
    }).join("");
}

function renderBadges() {
    const badgeList = document.getElementById("badgeList");
    if (!badgeList) {
        return;
    }

    const history = getInterviewHistory();
    const streak = parseInt(localStorage.getItem("dailyStreak") || "0", 10) || 0;

    const badges = [];
    if (history.length >= 1) {
        badges.push("First Interview");
    }
    if (history.some(entry => entry.score >= 85)) {
        badges.push("Ace Interview");
    }
    if (history.length >= 5) {
        badges.push("Interview Pro");
    }
    if (streak >= 3) {
        badges.push("3-Day Streak");
    }

    badgeList.innerHTML = badges.length
        ? badges.map(label => `<span class="badge bg-primary">${label}</span>`).join(" ")
        : "<span class='text-muted'>No badges earned yet.</span>";
}

function formatDate(timestamp) {
    const date = new Date(timestamp);
    return date.toLocaleDateString() + " " + date.toLocaleTimeString();
}

function loadInterviewPage(type) {
    applyDarkModeFromStorage();
    // Check if user is logged in
    if (sessionStorage.getItem("isLoggedIn") !== "true") {
        window.location.href = "login.html";
        return;
    }

    // Set current interview type and reset variables
    currentInterviewType = type;
    currentQuestionIndex = 0;
    recordedChunks = [];
    questionScores = [];
    selectedJobRole = sessionStorage.getItem("selectedJobRole") || "General";
    selectedDifficulty = getSavedDifficulty();
    questionTimeLimit = getCurrentTimeLimit();
    timeRemaining = questionTimeLimit;
    currentInterviewQuestions = getRandomInterviewQuestions(type, 7);

    const roleText = document.getElementById("selectedRoleText");
    if (roleText) {
        roleText.textContent = selectedJobRole;
    }

    const difficultyText = document.getElementById("selectedDifficultyText");
    if (difficultyText) {
        difficultyText.textContent = selectedDifficulty;
    }

    const languageSelect = document.getElementById("languageSelect");
    if (languageSelect) {
        languageSelect.value = getSelectedLanguage();
    }
    applyLanguage();
    clearTranscript();
    
    // Reset UI elements
    const audioPlayback = document.getElementById("audioPlayback");
    if (audioPlayback) {
        audioPlayback.style.display = "none";
        audioPlayback.src = "";
    }
    document.getElementById("stopButton").disabled = true;
    document.getElementById("nextButton").disabled = true;
    document.getElementById("submitButton").disabled = true;
    document.getElementById("startButton").disabled = false;
    const scoreDisplay = document.getElementById("speakingScoreDisplay");
    if (scoreDisplay) {
        scoreDisplay.textContent = "Score: 0/100";
    }
    const timerDisplay = document.getElementById("timerDisplay");
    if (timerDisplay) {
        timerDisplay.textContent = `Time left: ${questionTimeLimit}s`;
    }
    
    // Show first question
    showInterviewQuestion();
}

/**
 * Display current interview question
 */
function showInterviewQuestion() {
    const questionText = document.getElementById("questionText");
    const recordStatus = document.getElementById("recordStatus");
    const questions = currentInterviewQuestions.length ? currentInterviewQuestions : INTERVIEW_QUESTIONS[currentInterviewType];

    // Check if questions are available
    if (!questions || questions.length === 0) {
        questionText.textContent = "No questions are available.";
        return;
    }

    clearTranscript();

    // Display question with progress indicator
    questionText.textContent = `Question ${currentQuestionIndex + 1} of ${questions.length}: ${questions[currentQuestionIndex]}`;
    recordStatus.textContent = "Click 'Start Recording' to speak your answer.";
    updateProgressBar();

    const tipsText = document.getElementById("tipsText");
    if (tipsText) {
        tipsText.textContent = getInterviewTip();
    }
}


// ============================================
// VOICE RECORDING FUNCTIONS
// ============================================

/**
 * Start recording audio from microphone
 */
function startRecording() {
    const recordStatus = document.getElementById("recordStatus");
    const startButton = document.getElementById("startButton");
    const stopButton = document.getElementById("stopButton");

    // Check browser support for MediaRecorder API
    if (!navigator.mediaDevices || !navigator.mediaDevices.getUserMedia) {
        recordStatus.textContent = "Audio recording is not supported in your browser. Please use Chrome, Firefox, or Edge.";
        return;
    }

    // Request microphone access
    navigator.mediaDevices.getUserMedia({ audio: true })
        .then(function(stream) {
            // Clear previous recordings
            recordedChunks = [];
            recordStartTime = Date.now();
            startTimer();
            
            // Create MediaRecorder object
            mediaRecorder = new MediaRecorder(stream);
            startSpeechRecognition();

            // Collect audio data when available
            mediaRecorder.ondataavailable = function(event) {
                if (event.data.size > 0) {
                    recordedChunks.push(event.data);
                }
            };

            // Handle recording completion
            mediaRecorder.onstop = function() {
                // Create audio blob from recorded chunks
                const audioBlob = new Blob(recordedChunks, { type: "audio/webm" });
                const audioUrl = URL.createObjectURL(audioBlob);
                
                // Set audio player source
                const audioPlayback = document.getElementById("audioPlayback");
                audioPlayback.src = audioUrl;
                audioPlayback.style.display = "block";
                
                // Enable next button and disable stop button
                document.getElementById("nextButton").disabled = false;
                recordStatus.textContent = "Recording complete! You can play it back and then continue.";
                stopButton.disabled = true;
                startButton.disabled = false;
                
                // Stop microphone access
                stream.getTracks().forEach(function(track) {
                    track.stop();
                });

                // Calculate speaking score
                const durationSeconds = Math.max(1, Math.round((Date.now() - recordStartTime) / 1000));
                const score = calculateSpeakingScore(durationSeconds);
                questionScores[currentQuestionIndex] = score;
                document.getElementById("speakingScoreDisplay").textContent = `Score: ${score}/100`;
            };

            // Start recording
            mediaRecorder.start();
            recordStatus.textContent = "Recording in progress... Speak now.";
            startButton.disabled = true;
            stopButton.disabled = false;
        })
        .catch(function(error) {
            recordStatus.textContent = "Unable to access microphone. Please check browser permissions.";
            console.error("Microphone error:", error);
        });
}


/**
 * Stop recording audio
 */
function stopRecording() {
    if (mediaRecorder && mediaRecorder.state === "recording") {
        mediaRecorder.stop();
    }
    stopSpeechRecognition();
    clearInterval(questionTimer);
    const timerDisplay = document.getElementById("timerDisplay");
    if (timerDisplay) {
        timerDisplay.textContent = "Recording paused.";
    }
}

function startTimer() {
    clearInterval(questionTimer);
    timeRemaining = questionTimeLimit;
    const timerDisplay = document.getElementById("timerDisplay");
    if (timerDisplay) {
        timerDisplay.textContent = `Time left: ${timeRemaining}s`;
    }

    questionTimer = setInterval(function() {
        timeRemaining -= 1;
        if (timerDisplay) {
            timerDisplay.textContent = `Time left: ${timeRemaining}s`;
        }

        if (timeRemaining <= 0) {
            clearInterval(questionTimer);
            const recordStatus = document.getElementById("recordStatus");
            if (recordStatus) {
                recordStatus.textContent = "Time's up! Recording stopped automatically.";
            }
            stopRecording();
        }
    }, 1000);
}

function calculateSpeakingScore(durationSeconds) {
    const durationBonus = Math.min(30, Math.floor(durationSeconds * 2));
    const randomBonus = Math.floor(Math.random() * 11);
    const score = Math.min(100, 60 + durationBonus + randomBonus);
    return score;
}

/**
 * Move to next interview question
 */
function nextQuestion() {
    currentQuestionIndex += 1;
    const questions = currentInterviewQuestions.length ? currentInterviewQuestions : INTERVIEW_QUESTIONS[currentInterviewType] || [];

    // Check if all questions are completed
    if (currentQuestionIndex >= questions.length) {
        document.getElementById("questionText").textContent = "All questions completed!";
        document.getElementById("recordStatus").textContent = "Press 'Submit' to finish the interview.";
        document.getElementById("startButton").disabled = true;
        document.getElementById("stopButton").disabled = true;
        document.getElementById("nextButton").disabled = true;
        document.getElementById("submitButton").disabled = false;
        return;
    }

    // Reset UI for next question
    document.getElementById("audioPlayback").style.display = "none";
    document.getElementById("audioPlayback").src = "";
    document.getElementById("nextButton").disabled = true;
    document.getElementById("stopButton").disabled = true;
    document.getElementById("startButton").disabled = false;
    document.getElementById("submitButton").disabled = true;
    
    // Show next question
    showInterviewQuestion();
}

/**
 * Submit interview and go to result page
 */
function submitInterview(type) {
    const averageScore = questionScores.length ? Math.round(questionScores.reduce((acc, score) => acc + score, 0) / questionScores.length) : 0;
    sessionStorage.setItem("interviewType", type);
    sessionStorage.setItem("selectedJobRole", selectedJobRole);
    sessionStorage.setItem("selectedDifficulty", getSavedDifficulty());
    sessionStorage.setItem("speakingScore", averageScore.toString());
    sessionStorage.setItem("completedQuestions", questionScores.length.toString());
    addInterviewHistory({
        interviewType: type,
        jobRole: selectedJobRole,
        difficulty: getSavedDifficulty(),
        score: averageScore,
        questions: questionScores.length,
        timestamp: Date.now()
    });
    window.location.href = "result.html";
}

function updateProgressBar() {
    const questions = currentInterviewQuestions.length ? currentInterviewQuestions : INTERVIEW_QUESTIONS[currentInterviewType] || [];
    const progressBar = document.getElementById("progressBar");
    if (!progressBar || questions.length === 0) {
        return;
    }
    const percent = Math.round(((currentQuestionIndex + 1) / questions.length) * 100);
    progressBar.style.width = `${percent}%`;
    progressBar.setAttribute("aria-valuenow", percent);
    progressBar.textContent = `${percent}%`;
}

function saveJobRole(role) {
    selectedJobRole = role;
    sessionStorage.setItem("selectedJobRole", role);
}

function applyDarkModeFromStorage() {
    const enabled = localStorage.getItem("darkMode") === "enabled";
    document.body.classList.toggle("dark-mode", enabled);
    const toggle = document.getElementById("darkModeToggle");
    if (toggle) {
        toggle.textContent = enabled ? "Light Mode" : "Dark Mode";
    }
}

function toggleDarkMode() {
    const enabled = !document.body.classList.contains("dark-mode");
    document.body.classList.toggle("dark-mode", enabled);
    localStorage.setItem("darkMode", enabled ? "enabled" : "disabled");
    const toggle = document.getElementById("darkModeToggle");
    if (toggle) {
        toggle.textContent = enabled ? "Light Mode" : "Dark Mode";
    }
}

/**
 * Show result message on result page
 */
function showResultMessage() {
    applyDarkModeFromStorage();
    const stored = sessionStorage.getItem("isLoggedIn");
    if (stored !== "true") {
        window.location.href = "login.html";
        return;
    }
    const interviewType = sessionStorage.getItem("interviewType") || "Interview";
    const selectedRole = sessionStorage.getItem("selectedJobRole") || "General";
    const selectedDifficulty = sessionStorage.getItem("selectedDifficulty") || "Medium";
    const speakingScore = sessionStorage.getItem("speakingScore") || "0";
    const completedQuestions = sessionStorage.getItem("completedQuestions") || "0";
    const userName = sessionStorage.getItem("userName") || "Candidate";

    const resultDetails = document.getElementById("resultDetails");
    if (resultDetails) {
        resultDetails.innerHTML = `
            <p class="mb-2"><strong>Interview Type:</strong> ${interviewType}</p>
            <p class="mb-2"><strong>Job Role:</strong> ${selectedRole}</p>
            <p class="mb-2"><strong>Difficulty Level:</strong> ${selectedDifficulty}</p>
            <p class="mb-2"><strong>Completed Questions:</strong> ${completedQuestions}</p>
            <p class="mb-0"><strong>Speaking Score:</strong> ${speakingScore}/100</p>
        `;
    }

    const feedbackMessage = document.getElementById("feedbackMessage");
    if (feedbackMessage) {
        const numericScore = parseInt(speakingScore, 10) || 0;
        let feedback = "Great effort! Keep practicing to improve your confidence and clarity.";
        if (numericScore >= 85) {
            feedback = "Excellent performance! Your answers were clear and confident.";
        } else if (numericScore >= 65) {
            feedback = "Good job! Work on adding a few more strong examples and polishing your delivery.";
        } else {
            feedback = "Focus on structuring your answers and speaking a bit more slowly and clearly.";
        }
        feedbackMessage.textContent = feedback;
    }

    const certificateName = document.getElementById("certificateName");
    const certificateInterviewType = document.getElementById("certificateInterviewType");
    const certificateScore = document.getElementById("certificateScore");
    const certificateDate = document.getElementById("certificateDate");
    if (certificateName) {
        certificateName.textContent = userName;
    }
    if (certificateInterviewType) {
        certificateInterviewType.textContent = `${interviewType} (${selectedDifficulty})`;
    }
    if (certificateScore) {
        certificateScore.textContent = speakingScore;
    }
    if (certificateDate) {
        certificateDate.textContent = formatDate(Date.now());
    }
}

function printCertificate() {
    const certificateCard = document.getElementById("certificateCard");
    if (!certificateCard) {
        return;
    }
    const printWindow = window.open("", "Print Certificate", "width=800,height=600");
    if (!printWindow) {
        return;
    }
    printWindow.document.write(`
        <html>
            <head>
                <title>Interview Certificate</title>
                <style>
                    body { font-family: Arial, sans-serif; padding: 30px; }
                    .certificate { border: 6px solid #667eea; padding: 40px; text-align: center; }
                    h1 { margin-bottom: 20px; color: #333; }
                    p { margin: 10px 0; }
                </style>
            </head>
            <body>
                <div class="certificate">
                    ${certificateCard.innerHTML}
                </div>
            </body>
        </html>
    `);
    printWindow.document.close();
    printWindow.focus();
    printWindow.print();
    printWindow.close();
}

