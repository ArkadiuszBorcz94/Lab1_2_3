public class Main {
    public static void main(String[] args) {


            Gatunek g1=new Gatunek("Lądowy","ssak",10,24,"Koń");
            Gatunek g2=new Gatunek("Lądowy","ssak",10,24,"Koza");
            Gatunek g3=new Gatunek();


            g1.getFullname();
            System.out.println(g1.getChromosom());
            g1.getInfo();
            System.out.println("=====================================");
            g2.getInfo();
            System.out.println("=====================================");
            g3=g1.cloneObject();
            g3.getInfo();




    }
}