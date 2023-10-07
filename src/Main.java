import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        LinkedList<String> lista = new LinkedList<>();
        String link, link2;

        Scanner scanner;
        scanner = new Scanner(new File("C:\\Users\\12117434\\Desktop\\LIsta_URL.txt"));
        Scanner ler = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            lista.add(scanner.nextLine());
        }

        Iterator iterator = lista.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\n");
        }

            System.out.println();
            System.out.println("Escreva o link que deseja apagar: ");
            link = ler.next();

        for (String elemento : lista) {
            if(elemento==link){
                lista.remove(link);
            }else {
                System.out.println("Link inexistente");
            }
        }

        System.out.println();
        System.out.println(lista.size());

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\n");
        }

        System.out.println("Digite um link para verificar se o mesmo encontra-se na lista ou não: ");
        link2 = ler.next();

        for (String elemento : lista) {
            if(elemento==link2){
                System.out.println("Link Encontrado");
            }else {
                System.out.println("Link Não Encontrado");
            }
        }
    }
}