package zad1;

public class Main {
    public static void main(String[] args) {

        Punkt p1=new Punkt(5,4);
        Punkt p2=new Punkt(0,4);
        Punkt p3=new Punkt(2,1);


        Figura f1=new Figura();
        Prostokat pros1=new Prostokat(2,3);
        Trojkat t1=new Trojkat(5,2);

       // p1.zeruj();
     //  p1.opis();
     //  p1.przesun(1,1);
     //  p1.opis();
     //  System.out.println( pros1.getPowierzchnia());
     //  System.out.println(f1.opis());

     Okrag o1=new Okrag(new Punkt(4,5),4);

     System.out.println( o1.getPromien());

          o1.wSrodku(new Punkt(4,5));

      //  Prostokat pros2=new Prostokat(0,0,"Czarny");
        //    pros2.przesunProstokat(3,5);
      //  System.out.println(pros2.punkt.x+" "+pros2.punkt.y);


        Kwadrat kw1=new Kwadrat(4,5,"Zielony");
        kw1.opis();



    }




}