package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        System.out.println(2 + 2);
        System.out.println(2 * 2);
        System.out.println(2 / 2);
        System.out.println(2 - 2);

        System.out.println(1 / 2);
        System.out.println(1.0 / 2);
        System.out.println(1 / 2.0);
        System.out.println(1.0 / 2.0);

        System.out.println("2" + "2"); // конкатенация
        System.out.println(2 + "2"); // число всегда преобразовывается в строку, затем просиходит конкатенация, выражение = 22

    }
}
