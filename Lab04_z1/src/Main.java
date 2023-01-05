import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand =new Random();



       int [] array;
       array=new int[10];
        double sumaArray=0;
        double sredniaArray=0, sredniaArrayEach=0;
        double suma=0;

        //pętla FOR zliczająca sumę elementów tablicy

        for (int i = 0; i <array.length ; i++) {
            Integer losNumber=rand.nextInt(100);
            array[i]=losNumber;
            System.out.println("["+i+"] Element tablicy: "+ array[i]);
            sumaArray+=array[i];
        }

        System.out.println("Suma elementów tablicy: "+ sumaArray);
        System.out.println("Średnia za pomocą FOR: "+(sredniaArray=sumaArray/array.length));


        //PĘTLA FOR EACH


        for (int element:array) {
            System.out.println("PĘTLA FOR EATCH: "+element);
            suma+=element;

        }


        System.out.println("Suma elementów FOR EACH: "+ suma);
        System.out.println("Średnia za pomocą FOR EACH: "+(sredniaArrayEach=suma/array.length));

    }
    }
