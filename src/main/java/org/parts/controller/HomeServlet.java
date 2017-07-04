package org.parts.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.parts.service.PartsService;
import org.parts.service.Dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

//@WebServlet(urlPatterns = "/home.htm")
@Controller
@RequestMapping(value = "/")
public class HomeServlet {/*extends HttpServlet {*/

    @Autowired
    private PartsService service;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView mainPage() {
        return new ModelAndView("home");
    }

    @RequestMapping(method = RequestMethod.POST)
    public void mainPageFiltered(HttpServletRequest request, HttpServletResponse response) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String json = "";
        if (reader != null) {
            json = reader.readLine();
        }

        ObjectMapper mapper = new ObjectMapper();

        Dto dto = mapper.readValue(json, Dto.class);

        response.setContentType("application/json");
        mapper.writeValue(response.getOutputStream(), service.getArrangedParts(dto));
    }

/*    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

        //response.getWriter().write(json);
        //request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);

    }*/

}
