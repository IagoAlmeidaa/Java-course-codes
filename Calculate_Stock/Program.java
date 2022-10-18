package Calculate_Stock;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cal_Product Cal_Product = new Cal_Product();
        System.out.println("Enter Product data: ");
        System.out.print("Name: ");
        Cal_Product.name = sc.nextLine();
        System.out.print("Price: ");
        Cal_Product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        Cal_Product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("roduct data: " + Cal_Product);

        System.out.println();
        System.out.print("Enter the number of Products to be added in stock: ");
        int quantity = sc.nextInt();
        Cal_Product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + Cal_Product);

        System.out.println();
        System.out.print("Enter the number of Products to be removed from stock: ");
        quantity = sc.nextInt();
        Cal_Product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + Cal_Product);

        sc.close();
    }
}
