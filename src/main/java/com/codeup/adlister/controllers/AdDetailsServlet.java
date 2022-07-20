package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AdDetailsServlet", value = "/details")
public class AdDetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            if (request.getSession().getAttribute("user") == null) {
                response.sendRedirect("/login");
                return;
            }
        request.getRequestDispatcher("/WEB-INF/adDetails.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String user_id = request.getParameter("user_id");
        String title = request.getParameter("title");
        String park_name = request.getParameter("park_name");
        String description = request.getParameter("description");
        String elevation = request.getParameter("elevation");
        String hike_distance = request.getParameter("hike_distance");
        String max_occupancy = request.getParameter("max_occupancy");

        if (title.isEmpty()
        ||park_name.isEmpty()
        ||description.isEmpty()
        ||elevation.isEmpty()
        ||hike_distance.isEmpty()
        ||max_occupancy.isEmpty()){
            response.sendRedirect("/details");

        }

        if (DaoFactory.getUsersDao().findByUsername(user_id) != null) {
            request.getSession().setAttribute("error", "Username already exists");
            response.sendRedirect("/details");
        }else {
            request.getSession().removeAttribute("error");
            response.sendRedirect("/details");
        }

    }
}
