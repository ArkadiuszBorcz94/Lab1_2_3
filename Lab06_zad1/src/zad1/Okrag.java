package zad1;


public class Okrag {

    Punkt srodek;
    double promien;

    Okrag(){}

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    double getPowierzchnia() {
        return Math.pow(promien, 2);

    }

    double getSrednica() {
        return promien * 2;
    }

    void setSrednica(double p) {
        this.promien = p;
    }

    double getPromien() {
        return promien;
    }

    void wSrodku(Punkt p) {

        if (Math.pow((p.x - srodek.x), 2) + Math.pow(p.y - srodek.y, 2) <= Math.pow(promien, 2)) {
            System.out.println("Punkt znajduje się w okręgu");
        }
        else {
            System.out.println("Punkt NIE znajduje się w okręgu");
        }

    }
}