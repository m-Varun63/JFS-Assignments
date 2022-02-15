package com.company.Assignments.Assignment2;

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
        return("Rectangle Created");
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
        return ("Line created");
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
        return ("Cube creaed");
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) {}
}