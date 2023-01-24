public class Gatunek {
        String rodzaj,gatunek,opis;
        int liczbaChromosomowX,chromosomy2N;

        Gatunek(){}

        Gatunek(String rodzaj,String gatunek,int liczbaChromosomowX,int chromosomy2N,String opis){
            this.rodzaj=rodzaj;
            this.gatunek=gatunek;
            this.liczbaChromosomowX=liczbaChromosomowX;
            this.chromosomy2N=chromosomy2N;
            this.opis=opis;
        }

        public void getFullname(){

            System.out.println(rodzaj+" "+gatunek);

        }

        public int getChromosom(){

            return this.chromosomy2N/2;

        }

        public void getInfo(){
            System.out.println("Rodzaj: "+this.rodzaj);
            System.out.println("Gatunek: "+this.gatunek);
            System.out.println("Liczba Chromosomów X: "+this.liczbaChromosomowX);
            System.out.println("Liczba Chromosomów 2N: "+this.chromosomy2N);
            System.out.println("Opis: "+this.opis);

        }


        public Gatunek cloneObject(){

            return new Gatunek( this.rodzaj,this.gatunek,this.liczbaChromosomowX,this.chromosomy2N,this.opis);


        }

}
