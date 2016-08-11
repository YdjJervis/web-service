package com.jervis.servlet;


import java.io.IOException;

public class DaysToGoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println(new DateUtils().daysToNewYear() + " to go in 2014. Learn Gradle now!");
    }
}