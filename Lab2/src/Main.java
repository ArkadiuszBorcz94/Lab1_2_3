import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {




Scanner scanner =new Scanner(System.in);


            int srednia=0;
            int counter=0;
        System.out.println("Podaj ilość studentów: ");
        Integer n =scanner.nextInt();
        System.out.println("Ilość studentów: "+ n);
        int suma=0;
        while(counter<n){

            System.out.println("Podaj ocene : ");
            Integer punkty =scanner.nextInt();
            counter++;
            suma+=punkty;
        }

        System.out.println("Suma ocen to: " + suma);
        System.out.println("Srednia ocen to: "+getSrednia(suma,n));

    }
//metoda do obliczenia sredniej
    public static int getSrednia(int s,int ilosc) {
    return s/ilosc;
    }


}