package ru.ki.test;

import static java.lang.System.*;

public class First {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("admin");
    Square s = new Square(5);
    out.println("Площадь квадрата со стосроной " + s.l + " ровняется " + area(s));
    Rectangle r = new Rectangle(4, 6);
    out.println("Площадь со стосронами " + r.a + " и " + r.b + " = " + area(r));
  }
  public static void  hello (String somebody){
    out.println("Hello " + somebody + "!");
  }
  public static double area(Square s){
   return s.l*s.l;
  }
  public static double area ( Rectangle r){
    return r.a*r.b;
  }
}