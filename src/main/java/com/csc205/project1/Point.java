package com.csc205.project1;

/*
 * CSC205
 * Fall 2022
 * Alexis Arce
 */

public class Point {

    public double x;
    public double y;

    public Point() {
         this.x = 0;
         this.y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2){
        return Math.sqrt(Math.pow((p2.x - x), 2) + Math.pow((p2.y - y), 2));
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setPoint(double new_x, double new_y){
        this.x = new_x;
        this.y = new_y;
    }

    public void shiftX(double n){
        this.x += n;
    }

    public void shiftY(double n){
        this.y += n;
    }

    public void rotate(double angle){
        this.x = (x * (Math.cos(angle))) - (y * (Math.sin(angle)));
        this.y = (x * (Math.sin(angle))) + (y * (Math.cos(angle)));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("x = ")
                .append(x);
        sb.append(", y = ")
                .append(y);
        sb.append('}');
        return sb.toString();
    }
}
