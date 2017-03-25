package com.kosta.example.web;

import com.kosta.example.model.myModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

/**
 * Created by papa on 24.03.2017.
 */
public class MyControler extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String c=req.getParameter("vopros");
    myModel model=new myModel();
        ResultSet list= null;
        try {
            list = model.getResult(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("jsp",list);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("result.jsp");
        requestDispatcher.forward(req,resp);
    }
}
