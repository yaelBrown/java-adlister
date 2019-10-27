package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.MySQLUsersDao;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ads/create.jsp")
            .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // User has to be logged in to post ad's
        if (request.getSession().getAttribute("user") != null) {
            Ad ad = new Ad(
                    // Find the logged in username and get the id of that username.
                    DaoFactory.getUsersDao().findByUsername((String) request.getSession().getAttribute("user")).getId(),
                    request.getParameter("title"),
                    request.getParameter("description")
            );
            DaoFactory.getAdsDao().insert(ad);
            response.sendRedirect("/ads");
        }

    }
}
