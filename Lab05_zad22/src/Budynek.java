import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Budynek {

    String nazwa;
    LocalDate rokBudowy;
    int liczbaPieter;



    Budynek(){}
    Budynek(String nazwa, LocalDate rokBudowy, int liczbaPieter){
        this.nazwa=nazwa;
        this.rokBudowy=rokBudowy;
        this.liczbaPieter=liczbaPieter;

    }

    public String getNazwa() {
        return nazwa;
    }

    public LocalDate getRokBudowy() {
        return rokBudowy;
    }

    public int getLiczbaPieter() {
        return liczbaPieter;
    }



    public void getInfo(){
        System.out.println("Nazwa: "+this.nazwa);
        System.out.println("Liczba pięter: "+this.liczbaPieter);
        System.out.println("Rok budowy: "+ this.rokBudowy);

    }

public int getAge(){

        LocalDate actualDate=LocalDate.now();
        Period roznica=Period.between(this.rokBudowy,actualDate);
        int wiekBudynku=roznica.getYears();
        return wiekBudynku;





}




    }


















