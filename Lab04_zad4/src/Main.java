import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] words=new String[5];
        System.out.println("Wpisz 5 słów: ");
        for (int i=0;i<5;i++){
            System.out.println("Podaj słowo: ");
            words[i]=scan.nextLine();

        }



        for (int i=words.length-1; i>=0;i--){
            StringBuilder zmiana=new StringBuilder(words[i]);
            System.out.println(zmiana.reverse());

        }










    }
}