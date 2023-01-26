package zad1;

public class Kwadrat extends Prostokat {


    Kwadrat(float wys, float szer, String kolor) {
        super(wys, szer, kolor);

    }

    float getWys(){
        return (float) wys;
    }
    float getSzer(){
        return (float) szer;
    }

    String getKol(){
        return kolor;
    }

    void setWys(){
        this.wys=wys;
    }
    void setSzer(){
        this.szer=szer;
    }
    void setKol(){
        this.kolor=kolor;
    }









}
