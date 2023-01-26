package zad1;
class Prostokat extends Figura  {
	double wys=0, szer=0;
	
	Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
			
	}
	Prostokat(float wys, float szer, String kolor)
	{

		this.kolor=kolor;

	}


    double getPowierzchnia() {
        return (szer * wys);
    }


	void przesunProstokat(float x, float y){
		this.punkt.x= (int) (this.punkt.x+x);
		this.punkt.y= (int) (this.punkt.y+y);


	}


    
}