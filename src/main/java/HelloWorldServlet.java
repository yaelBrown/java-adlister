import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

// @WebServlet("/ceres") - Could rewrite annotation like this
@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Doing response.setContentType("text/json") - would be for setting up an api
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, World!</h1>");
    }

}