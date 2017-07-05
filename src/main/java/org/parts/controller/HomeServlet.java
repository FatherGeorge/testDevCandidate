package org.parts.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.parts.service.PartsService;
import org.parts.service.Dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
}
