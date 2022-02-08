
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends  HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        
        out.print("<h1> welcome to MyServlet</h2>");
        String name=req.getParameter("userName");
        String pass=req.getParameter("userPass");
        String email=req.getParameter("userMail");
        String gender=req.getParameter("userGender");
        String course=req.getParameter("userCourse");
         String chechBox=req.getParameter("condition");
        
        //out.println(name+"\n"+pass+"\n"+email+"\n"+gender+"\n"+course+"\n"+chechBox);
        if (chechBox!=null) {
            
        
        if (chechBox.equals("checked")) {
            
        out.println("<h1>User Name : "+name+"  </h1>");
        out.println("<h1>User Password : "+pass+"  </h1>");
        out.println("<h1>User Email : "+email+"  </h1>"); 
        out.println("<h1>User Gender : "+gender+"  </h1>");
        out.println("<h1>User Course : "+course+"  </h1>");   
      //out.println("<h1>User Checkbox : "+chechBox+"  </h1>");
      
      {     
      
      
      
//       RequestDispatcher rd2=req.getRequestDispatcher("/RegisterServlet");
//            rd2.include(req, resp);
//            
            
             RequestDispatcher rd=req.getRequestDispatcher("/SuccessServlet");
      rd.forward(req, resp);
              
      }
        }}
        else {
            out.println("<h1>Terms and coditions not accepted</h1>");
            
            RequestDispatcher rd=req.getRequestDispatcher("index.html");
            rd.include(req, resp);
        }
        
        
        }
    
    
}
