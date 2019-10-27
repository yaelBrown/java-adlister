package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String passwordConfirmation = request.getParameter("confirm_password");

        // validate input
        boolean inputHasErrors = username.isEmpty()
            || email.isEmpty()
            || password.isEmpty()
            || (! password.equals(passwordConfirmation));

        if (inputHasErrors) {
            response.sendRedirect("/register");
            return;
        }

        // Encrypt password
        password = BCrypt.hashpw(password, BCrypt.gensalt());

        // create and save a new user
        User user = new User(username, email, password);
        DaoFactory.getUsersDao().insert(user);
        response.sendRedirect("/login");
    }

    // Used to test hash of password.
    protected static void pwTest() {
        String username = "usr";
        String email = "email@email.com";
        String password = "testpw";
        String passwordConfirmation = "testpw";

        // Encrypt password
        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
        password = hash;

        System.out.println(password); // $2a$10$MABIbQXeRIoJ.k7w357Ji.nk/mT/SdrWIiKeKGtIQlGtNEttA9xZm

    }

    public static void main(String[] args) {

        pwTest();

    }


}
