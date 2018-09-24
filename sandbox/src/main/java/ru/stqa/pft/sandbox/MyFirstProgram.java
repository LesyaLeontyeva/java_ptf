package ru.stqa.pft.sandbox;


public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("User");
        hello("Olesya");

        double l = 5;
        System.out.println("Площать квадрата со стороной " + l + " = " + area(l));

        double a = 4;
        double b = 8;
        System.out.println(("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a,b)));

//        System.out.println(2 + 2);
//        System.out.println(2 * 2);
//        System.out.println(2 / 2);
//        System.out.println(2 - 2);
//
//        System.out.println(1 / 2);
//        System.out.println(1.0 / 2);
//        System.out.println(1 / 2.0);
//        System.out.println(1.0 / 2.0);
//
//        System.out.println("2" + "2"); // конкатенация
//        System.out.println(2 + "2"); // число всегда преобразовывается в строку, затем просиходит конкатенация, выражение = 22
//        double w = 8.0;
//        double s = w * w;
//        System.out.println("Площадь квадрата со стороной " + w + " = " + s);


    }

    public static void hello(String somebody){
        System.out.println("Hello," + somebody + "!");
    }

    public static double area(double len){
        return len*len;
    }

    public static double area(double a, double b){
        return a*b;
    }
}
