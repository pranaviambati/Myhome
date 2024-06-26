package com.myhome.controller;

import com.myhome.model.Interior;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/home")
public class HomeController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private List<Interior> interiors;

    @Override
    public void init() throws ServletException {
        super.init();
        interiors = new ArrayList<>();
        interiors.add(new Interior("Modern Living Room", "A modern living room with stylish furniture."));
        interiors.add(new Interior("Cozy Bedroom", "A cozy bedroom with warm lighting and a comfortable bed."));
        interiors.add(new Interior("Elegant Kitchen", "An elegant kitchen with state-of-the-art appliances."));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query = request.getParameter("query");
        List<Interior> results = new ArrayList<>();
        if (query != null && !query.isEmpty()) {
            for (Interior interior : interiors) {
                if (interior.getName().toLowerCase().contains(query.toLowerCase())) {
                    results.add(interior);
                }
            }
        } else {
            results = interiors;
        }
        request.setAttribute("interiors", results);
        request.getRequestDispatcher("search.jsp").forward(request, response);
    }
}
