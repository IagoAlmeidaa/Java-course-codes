package arrays;
import java.util.Scanner;

public class VetBasic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o numero de produtos que deseja cadastrar:");
        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Insira o nome do produto %d: ", i );
            String name = sc.nextLine();
            System.out.println("Digite o preço do(a): "+ name);
            double price = sc.nextDouble();
            vect[i] = new Produto(name, price);
        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double media = sum / vect.length;

        System.out.printf("Media de preço = %.2f%n", media);

        sc.close();
    }

}