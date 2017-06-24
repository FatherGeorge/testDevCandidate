package org.parts.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.parts.service.PartsService;
import org.parts.service.PartsServiceImpl;
import org.parts.service.Dto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@WebServlet(urlPatterns = "/home.htm")
public class HomeServlet extends HttpServlet {

    private PartsService service = new PartsServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.setAttribute("someParts", service.getAllParts());

        BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String json = "";
        if (reader != null) {
            json = reader.readLine();
        }

        ObjectMapper mapper = new ObjectMapper();

        Dto dto = mapper.readValue(json, Dto.class);

        response.setContentType("application/json");
        mapper.writeValue(response.getOutputStream(), service.getArrangedParts(dto));

        //request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);

    }
}
