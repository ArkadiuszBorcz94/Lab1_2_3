import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Budynek b1=new Budynek("Blok",LocalDate.parse("1994-05-12"), 2);
        Budynek b2=new Budynek("Domek", LocalDate.now(), 6);




        b1.getInfo();
        b2.getInfo();
        System.out.println("Wiek budynku wynosi: "+ b1.getAge());






    }


}