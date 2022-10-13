package Triangulo_OOP;
import java.util.Scanner;

class program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("entre com o numero de lados do Triangulo X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("entre com o numero de lados do Triangulo Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        //System.out.println();

        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Area do triangulo Y: %.4f%n", areaY);
        // System.out.println();

        if (areaX > areaY) {
            System.out.println("Area maior do x");
        } else {
            System.out.println("Area maior do y");
        }

        sc.close();

    }
}
