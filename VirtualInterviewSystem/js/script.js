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

    // Check password length
    if (password.length < 4) {
        error.textContent = "Password must be at least 4 characters long.";
        event.preventDefault();
        return false;
    }

    return true;
}

/**
 * Display error messages from URL query parameters
 */
function displayErrorFromQuery() {
    const error = getQueryParam(\"error\");
    if (!error) {
        return;
    }

    // Show error in login form if present
    const loginError = document.getElementById(\"loginError\");
    if (loginError) {
        loginError.textContent = error;
    }
    
    // Show error in register form if present
    const registerError = document.getElementById(\"registerError\");
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
    const name = getQueryParam(\"name\") || sessionStorage.getItem(\"userName\");
    if (name) {
        document.getElementById(\"dashboardName\").textContent = name;
        sessionStorage.setItem(\"userName\", name);
        sessionStorage.setItem(\"isLoggedIn\", \"true\");
        return;
    }

    // Check if user is logged in, redirect if not
    if (sessionStorage.getItem(\"isLoggedIn\") !== \"true\") {
        window.location.href = \"login.html\";
    }
}

/**
 * Logout user and clear session data
 */
function logoutUser() {
    sessionStorage.removeItem(\"userName\");
    sessionStorage.removeItem(\"isLoggedIn\");
    window.location.href = \"login.html\";
}

// ============================================
// INTERVIEW QUESTIONS & CONFIGURATION
// ============================================

/**
 * Interview questions for HR and Technical rounds
 */
const INTERVIEW_QUESTIONS = {
    HR: [
        \"Tell me about yourself.\",
        \"What are your strengths?\",
        \"Why should we hire you?\",
        \"How do you handle stress?\",
        \"Where do you see yourself in 5 years?\"
    ],
    Technical: [
        \"Explain object-oriented programming.\",
        \"What is the difference between array and ArrayList?\",
        \"What are the four pillars of OOPS?\",
        \"Explain the concept of inheritance.\",
        \"What is polymorphism?\"
    ]
};

// ============================================
// INTERVIEW RECORDING VARIABLES
// ============================================

let currentInterviewType = \"\";        // HR or Technical
let currentQuestionIndex = 0;          // Current question number
let mediaRecorder = null;              // MediaRecorder object
let recordedChunks = [];               // Array to store audio chunks

// ============================================
// INTERVIEW PAGE FUNCTIONS
// ============================================

/**
 * Initialize interview page with selected type
 */
function loadInterviewPage(type) {
    // Check if user is logged in
    if (sessionStorage.getItem(\"isLoggedIn\") !== \"true\") {
        window.location.href = \"login.html\";
        return;
    }

    // Set current interview type and reset variables
    currentInterviewType = type;
    currentQuestionIndex = 0;
    recordedChunks = [];
    
    // Reset UI elements
    document.getElementById("audioPlayback").style.display = "none";
    document.getElementById("audioPlayback").src = "";
    document.getElementById("stopButton").disabled = true;
    document.getElementById("nextButton").disabled = true;
    document.getElementById("submitButton").disabled = true;
    
    // Show first question
    showInterviewQuestion();
}

/**
 * Display current interview question
 */
function showInterviewQuestion() {
    const questionText = document.getElementById("questionText");
    const recordStatus = document.getElementById("recordStatus");
    const questions = INTERVIEW_QUESTIONS[currentInterviewType];

    // Check if questions are available
    if (!questions || questions.length === 0) {
        questionText.textContent = "No questions are available.";
        return;
    }

    // Display question with progress indicator
    questionText.textContent = `Question ${currentQuestionIndex + 1} of ${questions.length}: ${questions[currentQuestionIndex]}`;
    recordStatus.textContent = "Click 'Start Recording' to speak your answer.";
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
            
            // Create MediaRecorder object
            mediaRecorder = new MediaRecorder(stream);

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
}

/**
 * Move to next interview question
 */
function nextQuestion() {
    currentQuestionIndex += 1;
    const questions = INTERVIEW_QUESTIONS[currentInterviewType];

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
    // Store interview type in session
    sessionStorage.setItem("interviewType\", type);
    // Redirect to result page
    window.location.href = \"result.html\";
}

/**
 * Show result message on result page
 */
function showResultMessage() {
    // Check if user is logged in
    const stored = sessionStorage.getItem(\"isLoggedIn\");
    if (stored !== \"true\") {
        window.location.href = \"login.html\";
    }
}
