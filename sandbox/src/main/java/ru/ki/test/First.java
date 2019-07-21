package ru.ki.test;

import static java.lang.System.*;

public class First {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("admin");
    double len = 5;
    out.println("Площадь квадрата со стосроной " + len + " ровняется " + area(len) );
    double a = 4;
    double b = 6;
    out.println("Площадь со стосронами " + a + " и " + b + " = " + area(a, b));
  }
  public static void  hello (String somebody){
    out.println("Hello " + somebody + "!");
  }
  public static double area(double l){
   return l*l;
  }
  public static double area (double a, double b){
    return a*b;
  }
}