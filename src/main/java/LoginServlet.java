import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // Taking parameters and setting them as variables.
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Define session variable and setting currently logged in user as key: user
        HttpSession session = request.getSession();
        session.setAttribute("user", username);

        // Setting session attributes to variables
        session.setAttribute("username", username);
        session.setAttribute("password", password);

        // Validating login attempt to be admin
        boolean validAttempt = username.equals("admin") && password.equals("password");

        // Performing logic
        if (validAttempt) {
            response.sendRedirect("/profile");
        } else {
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            response.sendRedirect("/login");
        }
    }
}