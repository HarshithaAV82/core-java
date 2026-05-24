package interview;

import java.io.IOException;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * DashboardServlet - Handles dashboard access control
 * Simple servlet to verify user is logged in before accessing dashboard
 */
public class DashboardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get existing session (don't create new one)
        HttpSession session = request.getSession(false);
        
        // Check if session exists and user email is stored (meaning user is logged in)
        if (session == null || session.getAttribute("userEmail") == null) {
            // User is not logged in, redirect to login page
            response.sendRedirect("../web/login.html");
            return;
        }

        // Get user name from session
        String userName = (String) session.getAttribute("userName");
        
        // Use default name if not found
        if (userName == null || userName.isEmpty()) {
            userName = "Candidate";
        }

        // Redirect to dashboard HTML page with user name parameter
        response.sendRedirect("../web/dashboard.html?name=" + URLEncoder.encode(userName, "UTF-8"));
    }
}
