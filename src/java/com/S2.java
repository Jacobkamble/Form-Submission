/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jacob
 */
public class S2 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        
        int nn1=Integer.parseInt(req.getParameter("n1"));
        
        int nn2=Integer.parseInt(req.getParameter("n2"));
        
        int sum=(int) req.getAttribute("sum");
        
        int p=nn1*nn2;
        
        out.println("<h1>sum is "+sum+"</h1>");
        out.println("<h1>product is "+p+"</h1>");
        
        
    }
    
   
    
}
