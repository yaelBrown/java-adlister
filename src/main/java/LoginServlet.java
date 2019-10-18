import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("GET request was made");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, World!</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("post was ran");

        try {
            String usr = request.getParameter("username");
            System.out.println("username = " + usr);
            String pw = request.getParameter("password");
            System.out.println("password = " + pw);

            if (usr.equalsIgnoreCase("admin") && pw.equalsIgnoreCase("password")) {
                response.sendRedirect(request.getContextPath() + "/profile.jsp");
            }

        } catch (Error e) {
            e.printStackTrace();
        } finally {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h1>Hello, World!</h1>");
        }

    }

}
