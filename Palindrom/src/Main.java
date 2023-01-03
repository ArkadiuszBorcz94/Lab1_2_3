import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Podaj zdanie spradzmy czy podane zdanie jest palindromem");

        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()){

            String sentence=scanner.nextLine();
            if (sentence.equals("Koniec")){
                break;
            }

            boolean isPalindrome =true;
            for (int i=0;i<sentence.length()/2;i++){
                char currentChar=sentence.charAt(i);
                char otherChar= sentence.charAt(sentence.length()-i-1);
                if(currentChar!=otherChar){
                    isPalindrome=false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("Przekazane zdanie: [" + sentence + " ]jest palindromem.");

            }else {
                System.out.println("Przekazane zdanie: ["+sentence + " ] nie jest palindromem.");

            }
            System.out.println("Podaj kolejne zdanie ");


        }
        System.out.println("Koniec działania programu");

    }
}