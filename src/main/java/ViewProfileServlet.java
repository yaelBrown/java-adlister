import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession ses = request.getSession();

        if (request.getSession().getAttribute("username") != null && request.getSession().getAttribute("password") != null) {
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
        } else {
            System.out.println("request.getParameter(\"username\") = " + request.getSession().getAttribute("username"));
            System.out.println("request.getParameter(\"password\") = " + request.getSession().getAttribute("password"));
            response.sendRedirect("/login");
        }

    }

}
