package com.TechRafi.AbstractClass;

public abstract class Shape{
    public abstract void RectangleArea(int l,int w);
    public abstract void CircleArea(int r);
    public abstract void SquareArea(int a);
}
class Area extends Shape{
    @Override
    public void RectangleArea(int l, int w) {

    }
    @Override
    public void CircleArea(int r) {

    }
    @Override
    public void SquareArea(int a) {

    }
    public static void main(String[] args) {
        Area a= new Area();
        a.RectangleArea(5,6);
        a.CircleArea(4);
        a.SquareArea(5);
    }
}
