import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        int n=0;
        int counter=0;
        int sumUjemne=0;
        int sumDodatnie=0;
        Scanner scanner=new Scanner(System.in);             //tworzenie obiektu scanner klasy Scanner

        System.out.println("Wpisz 10 liczb rzeczywistych ");


        while(n<10){

            Integer liczba=scanner.nextInt();
            System.out.println("Wpisana liczba to: " +liczba);
            n++;
            counter++;
            if (liczba>0){                                      //warunek segregacji  liczb dodatnich i ujemnych
                sumDodatnie+=liczba;
            }else {
                sumUjemne+=liczba;

            }


        }

        System.out.println("Zostało wpisanych: [" +counter+ "] liczb");
        System.out.println("Suma liczb dodatcnich: [" +sumDodatnie+ "]");
        System.out.println("Suma liczb ujemnych: [" +sumUjemne+ "]");
        System.out.println("KONIEC DZIALANIA PROGRAMU");




    }
}