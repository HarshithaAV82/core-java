package interview;

import java.io.IOException;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * LoginServlet - Handles user login functionality
 * Simple beginner-friendly servlet for authentication
 */
public class LoginServlet extends HttpServlet {
    // Hardcoded credentials for demo (in real app, use database)
    private static final String ADMIN_EMAIL = "admin@gmail.com";
    private static final String ADMIN_PASSWORD = "1234";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get email and password from HTML form
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Check if credentials match (simple validation)
        if (ADMIN_EMAIL.equals(email) && ADMIN_PASSWORD.equals(password)) {
            // Create a session to store user info
            HttpSession session = request.getSession();
            session.setAttribute("userEmail", email);
            session.setAttribute("userName", "Admin");
            session.setMaxInactiveInterval(30 * 60); // 30 minutes timeout
            
            // Redirect to dashboard after successful login
            response.sendRedirect("../web/dashboard.html?name=" + URLEncoder.encode("Admin", "UTF-8"));
        } else {
            // Redirect back to login with error message
            response.sendRedirect("../web/login.html?error=" + URLEncoder.encode("Invalid Login", "UTF-8"));
        }
    }
}
