package zad1;

public class Punkt {
      public int x,y;

      public Punkt (){}



    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX(){
       return x;
    }

    public int getY() {
        return y;
    }

   public void setX(int x){
          this.x=x;
   }

    public void setY(int y) {
        this.y = y;
    }
    void zeruj(){
          this.x=0;
          this.y=0;
}

    void opis(){
        System.out.println("X: "+x+" "+"Y: "+y);

    }

    void przesun(int x, int y){

          this.x=this.x+x;
          this.y=this.y+y;


    }





}
