package Recursividade;

import java.util.Scanner;

public class RecursivoFatorial {
    public  void main(String[] args) {
        RecursivoFatorial r = new RecursivoFatorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o numero para usar fatorial:");
        int resposta = sc.nextInt();
        int resp = r.fatorial(resposta);
        System.out.printf(" do Valor %d é = %d", resposta, resp);
        sc.close();
    }

    public int fatorial(int x) {
        if (x == 0) {
         return (1);
        }else{
            System.out.println("valor do fatorial decrementado: " + x);
            return x * fatorial(x - 1);
        }
    }
}
