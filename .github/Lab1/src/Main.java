import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("Wpisz pierwszą liczbę: ");
        int first=in.nextInt();
        System.out.println("Wpisz drugą liczbę: ");
        int second=in.nextInt();
        Random losowanie =new Random();     //losowanie liczb- obiekt losowanie klasy Random
        int bok1=losowanie.nextInt(first)+second;  //losowanie przedziału od x do y tutaj first do second
        int bok2=losowanie.nextInt(first)+second;
        int podstawa=losowanie.nextInt(first)+second;


        //deklaracje metod
        zad1();
        zad2(first,second);
        zad3(first);
        zad4(first);
        System.out.println(zad5(first,3));
        System.out.println(zad6(first));
        System.out.println(zad7(bok1, bok2, podstawa));

    }


     static void zad1() {
        int a=10;
        System.out.println("Imie: Arek");
        System.out.println("Wiek: 28");
    }

    static void zad2(int a, int b){

            System.out.println("Pierwsza liczba to: "+a);
            System.out.println("Druga liczba to: "+b);
}
        static void zad3(int a){
          System.out.println(a%2==0);

    }

        static void zad4(int a){
                System.out.println((a%3==0)&&(a%5==0));
        }

    static double zad5(double a,double b){
        return pow(a, b);

    }
        static double zad6(int a){
            return sqrt(a);
        }
        static boolean zad7(int a, int b, int c){

           return ((pow(a,2)+pow(b,2)==pow(c,2)));


        }



}