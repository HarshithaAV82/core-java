package interview;

import java.io.IOException;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * RegisterServlet - Handles user registration functionality
 * Simple beginner-friendly servlet for new user registration
 */
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get registration data from HTML form
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Validate that all fields are filled
        if (name == null || name.isEmpty() || email == null || email.isEmpty()
                || password == null || password.isEmpty()) {
            // If any field is empty, show error
            response.sendRedirect("../web/register.html?error=" + URLEncoder.encode("Please fill all fields", "UTF-8"));
            return;
        }

        // Validate password length (at least 4 characters)
        if (password.length() < 4) {
            response.sendRedirect("../web/register.html?error=" + URLEncoder.encode("Password must be at least 4 characters", "UTF-8"));
            return;
        }

        // Create a session and store user information
        HttpSession session = request.getSession();
        session.setAttribute("userName", name);
        session.setAttribute("userEmail", email);
        session.setAttribute("userPassword", password);
        session.setMaxInactiveInterval(30 * 60); // 30 minutes timeout
        
        // Redirect to dashboard after successful registration
        response.sendRedirect("../web/dashboard.html?name=" + URLEncoder.encode(name, "UTF-8"));
    }
}
