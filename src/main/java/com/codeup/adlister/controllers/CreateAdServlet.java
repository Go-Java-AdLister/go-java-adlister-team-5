package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
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
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/ads/create.jsp")
                .forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User user = (User) request.getSession().getAttribute("user");
        request.setAttribute("errors", false);
        boolean hasErrors =
                request.getParameter("title").isEmpty() || request.getParameter("park_name").isEmpty() || request.getParameter("description").isEmpty() || request.getParameter("elevation").isEmpty() || request.getParameter("hike_distance").isEmpty() || request.getParameter("max_occupancy").isEmpty();

        String currentUser_id = request.getParameter("user_id");
        request.setAttribute("user_id", currentUser_id);

        String currentTitle = request.getParameter("title");
        request.setAttribute("title", currentTitle);

        String currentPark_name = request.getParameter("park_name");
        request.setAttribute("park_name", currentPark_name);

        String currentDescription = request.getParameter("description");
        request.setAttribute("description", currentDescription);

        int currentElevation = Integer.parseInt(request.getParameter("elevation"));
        request.setAttribute("elevation", currentElevation);

        int currentHike_distance = Integer.parseInt(request.getParameter("hike_distance"));
        request.setAttribute("hike_distance", currentHike_distance);

        int currentMax_occupancy = Integer.parseInt(request.getParameter("max_occupancy"));
        request.setAttribute("max_occupancy", currentMax_occupancy);

        String[] select = request.getParameterValues("check");


        if (!hasErrors) {
            Ad ad = new Ad(
                    user.getId(),
//                    request.getParameter("user_id"),
                    request.getParameter("title"),
                    request.getParameter("park_name"),
                    request.getParameter("description"),
                    request.getParameter("elevation"),
                    request.getParameter("hike_distance"),
                    request.getParameter("max_occupancy")
            );
            DaoFactory.getAdsDao().insert(ad);
        }
        response.sendRedirect("/ads");


    }


}

