package questao2;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {

        int[][] matriz = new int[40][40];
        int cod = 0;
        String produto;

        for(int linhas=0;linhas<40;linhas++) {
            for (int cols = 0; cols < 40; cols++) {

                System.out.println("Escreva qual é o produto que deve ser incluidos na estante");

                Scanner ler = new Scanner(System.in);
                produto = ler.next();

                switch (produto) {
                    case 1:
                        produto = "xampu";
                        cod = 1;
                        break;

                    case 2:
                        produto = "condicionador";
                        cod = 2;
                        break;

                    case 3:
                        produto = "hidratante";
                        cod = 3;
                        break;

                    case 4:
                        produto = "tintura";
                        cod = 4;
                        break;

                    case 5:
                        produto = "demaquilante";
                        cod = 5;
                        break;

                    case 6:
                        produto = "vazio";
                        cod = 0;
                        break;
                }

                matriz[linhas][cols] = cod;
            }
        } //não consegui pensar na logica de quantidade...

    }
}
