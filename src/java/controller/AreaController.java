/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CircleAreaCalcualtion;
import model.RectangleCalculation;
import model.RightTriangleCalculation;

/**
 *
 * @author User
 */
@WebServlet(name = "AreaController", urlPatterns = {"/AreaController"})
public class AreaController extends HttpServlet {
    private static final String RESULT_PAGE = "results.jsp";

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 //       processRequest(request, response);
        response.setContentType("text/html");
//            double height = 0.00;
//            double width = 0.00;
            String h = request.getParameter("height");
            String w = request.getParameter("width");
            String r = request.getParameter("radius");
            String a = request.getParameter("sidea");
            String b = request.getParameter("sideb");
            
            double height = Double.parseDouble(h);
            double width = Double.parseDouble(w);
            double radius = Double.parseDouble(r);
            double sideA = Double.parseDouble(a);
            double sideB = Double.parseDouble(b);
            
            RectangleCalculation rc = new RectangleCalculation();
            double results = rc.getArea(height, width);
            CircleAreaCalcualtion ca = new CircleAreaCalcualtion();
            double resultsTwo = ca.getArea(radius);
            RightTriangleCalculation rt = new RightTriangleCalculation();
            double resultsThree = rt.getSideC(sideA, sideB);
            
            request.setAttribute("results", results);
            request.setAttribute("resultsTwo", resultsTwo);
            request.setAttribute("resultsThree", resultsThree);
            
            RequestDispatcher view =
                request.getRequestDispatcher(RESULT_PAGE);
            view.forward(request, response);
            
            
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
