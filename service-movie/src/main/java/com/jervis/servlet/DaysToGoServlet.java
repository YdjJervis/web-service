package com.jervis.servlet;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DaysToGoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/plain");
//        resp.getWriter().println(new DateUtils().daysToNewYear() + " to go in 2014. Learn Gradle now!");
    }
}