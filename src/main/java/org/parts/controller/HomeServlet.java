package org.parts.controller;

import org.parts.service.PartsService;
import org.parts.service.PartsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/home.htm")
public class HomeServlet extends HttpServlet {

    private PartsService service = new PartsServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("someParts", service.getAllParts());
        request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);

    }
}
