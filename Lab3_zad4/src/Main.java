import com.sun.source.tree.WhileLoopTree;

import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        int counter=0;
        Scanner scanner=new Scanner(System.in);             //tworzenie obiektu scanner klasy Scanner
        Random rand =new Random();

        System.out.println("Wpisz ile liczb ma byc w ciągu");
        Integer n=scanner.nextInt();

        while(counter<n){

            Integer los= rand.nextInt(55)-10;                                  //  Losowanie liczb dp zmienne los odbywa się po wywołaniu którejś z metod obiektu rand
            System.out.println("Wylosowana liczba z zakresu(-10,45) to:[" +los+ "]");
            counter++;

        }
        System.out.println("KONIEC DZIALANIA PROGRAMU");


    }
}
