import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczby do tablicy: ");

        Integer[] array1=new Integer[8];
            for (int i=0;i<8;i++){
            array1[i]=scan.nextInt();

            }

        System.out.println("Wpisana tablica to: "+Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Tablica posortowana rosnąco: "+Arrays.toString(array1));








    }
    }
