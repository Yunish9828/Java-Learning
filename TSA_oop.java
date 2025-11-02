import java.util.Scanner;
class Prism{
    int CSA;
    int LSA;
    int calcTSA(){
       return 2*CSA + LSA;
    }
}
class TSA{
   public static void main(String[] args) {
       Prism prism1 = new Prism();
       Scanner input = new Scanner(System.in);
       System.out.println("Enter CSA: ");
       System.out.println("Enter LSA: ");
       System.out.println("The Total surface area is "+ prism1.calcTSA()+ "unit square");
       Prism prism2 = new Prism();
       System.out.println("Enter CSA: ");
       System.out.println("Enter LSA: ");
       System.out.println("The Total surface area is "+ prism2.calcTSA()+ "unit square");
   }
}

