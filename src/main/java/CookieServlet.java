import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

// Can map multiple url's to WebServlet annotation. 
// WS({"/cookie", "cookie-monster", "/"})
@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        handleRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        handleRequest(request, response);
    }

    protected void handleRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String paramName = "name";
        String paramValue = req.getParameter(paramName);

        if (paramValue == null) {
            out.println("<h1>Eat cookie, nom nom!</h1>");
        } else {
            out.println("<h1>" + paramValue + " ate cookie, nom nom!</h1>");
        }
    }

}
