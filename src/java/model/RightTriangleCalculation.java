/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class RightTriangleCalculation {
    private double sideC;
    
    public double getSideC(double sideA, double sideB){
       sideC = Math.sqrt(Math.pow(sideA,2) + Math.pow(sideB,2));
       return sideC;
    }
}
