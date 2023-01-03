import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        int counter=0;
        int sumUjemne=0;
        int sumDodatnie=0;
        int sumParzyste=0;
        Scanner scanner=new Scanner(System.in);             //tworzenie obiektu scanner klasy Scanner


        System.out.println("Wpisz ile liczb ma byc w ciągu");
          Integer n=scanner.nextInt();
        System.out.println("Wpisz [" +n +"] liczb rzeczywistych ");


        while(counter<n){

            Integer liczba=scanner.nextInt();
            System.out.println("Wpisana liczba to: " +liczba);
            counter++;


            if (liczba>0){                                      //warunek segregacji  liczb dodatnich i ujemnych
                sumDodatnie+=liczba;
            }else {
                sumUjemne+=liczba;
            }

            if (liczba%2==0){                                    //warunek segregacji  liczb parzystych
                sumParzyste+=liczba;
            }




        }

        System.out.println("Zostało wpisanych: [" +counter+ "] liczb");
        System.out.println("Suma liczb dodatcnich: [" +sumDodatnie+ "]");
        System.out.println("Suma liczb ujemnych: [" +sumUjemne+ "]");
        System.out.println("Suma liczb parzystych: [" +sumParzyste+ "]");
        System.out.println("KONIEC DZIALANIA PROGRAMU");




    }
}