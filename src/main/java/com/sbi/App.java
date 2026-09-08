package com.sbi;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class App extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println(
            "<html>" +
            "<body>" +
            "<h1>Hello from SBI Project</h1>" +
            "<h2>Jenkins + Maven + Tomcat</h2>" +
            "</body>" +
            "</html>"
        );
    }
}
