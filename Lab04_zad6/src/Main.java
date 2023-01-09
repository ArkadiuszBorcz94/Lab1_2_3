import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Wpisz 5 liczb do obliczenia ich silnii: ");

        Integer[] numbers=new Integer[5];

        for (int i=0;i<5;i++){
            numbers[i] = scan.nextInt();

       }

        System.out.println("Oto elementy tablicy: "+Arrays.toString(numbers));

        for (int num:numbers){

            int factorial=1;

            for(int i=1;i<=num;i++){
                factorial*=i;
                System.out.println(i);
            }
            System.out.println(num+"!= "+ factorial);

        }












    }
}