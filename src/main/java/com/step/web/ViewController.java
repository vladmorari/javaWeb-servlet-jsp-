package com.step.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HESOYAM
 */
public class ViewController extends HttpServlet {

    AddObjects obj = new AddObjects();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        session.setAttribute("list1", obj.getObjList());
        
        session.setAttribute("exemplu", "abcd");
        
        resp.sendRedirect("view.jsp");
    }

}
