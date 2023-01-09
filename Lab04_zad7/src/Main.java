import java.util.Arrays;


public class Main {
    public static void main(String[] args) {




            String[] array1=new String[]{"1","2","3","4","5"};

            String[] array2=new String[]{"1","2","3","4","5"};


           for (int i=0;i<5;i++){

               if (array1[i]==array2[i]){
                   System.out.println("["+i+"] elementy tablicy są takie same");
               }
               else {
                   System.out.println("tablice nie są takie same!!!");
                   break;
               }
               if (i== array1.length-1){
                   System.out.println("TABLICE SĄ TAKIE SAME");
               }

               }



    }
    }





