/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class S1 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        String n1=req.getParameter("n1");
        String n2=req.getParameter("n2");
        
        
        int nn1=Integer.parseInt(n1);
        int nn2=Integer.parseInt(n2);
        
        int s=nn1+nn2;
        req.setAttribute("sum", s);
        
        RequestDispatcher rd=req.getRequestDispatcher("S2");
        
        rd.forward(req, resp);
        
        
        
    }
    
    
}
