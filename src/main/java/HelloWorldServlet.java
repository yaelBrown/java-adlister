import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        // Takes whats in the value of the query string and stores it in a variable
        String name = request.getParameter("name");

        // Performs logic with the variable name
        if (name == null) {
            name = "World!";
        } else if (name.equals("bgates")) {
            response.sendRedirect("https://microsoft.com");
            return;
        }

        // Takes variable of 'name' and sets it as an attribute of "user" to be passed to hello.jsp
        request.setAttribute("user", name);
        request.getRequestDispatcher("/hello.jsp").forward(request, response);

    }
}