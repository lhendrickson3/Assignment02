/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author User
 */
public class CircleAreaCalcualtion {
    private double area;
    
    public double getArea(double radius){
        area = 3.14 * (radius * radius);
        return area;
    }
}
