package dev.lopez.servlets;

import dev.lopez.Daos.EmployeeRepo;
import dev.lopez.Daos.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");//Set character set of request
        response.setContentType("text/html;charset=utf-8");//Set character set of response

        //1. Get the username and password values from the front page
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");

        //2. Create the object of the implementation class and call the login() method
        //If the database is found, it will return true; if it is not found, it will return false

        UserDaoImpl repo = new UserDaoImpl();
        boolean isSuccess = repo.login(userName, passWord);

        if(isSuccess){
            //Used for corresponding customer, success is true -- > login succeeded
            response.getWriter().write("Login successfully");
        }else{
            response.getWriter().write("Login failed");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

