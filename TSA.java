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
       prism1.CSA = 500;
       prism1.LSA = 400;
       System.out.println("The Total surface area is "+ prism1.calcTSA()+ "unit square");
       Prism prism2 = new Prism();
       prism2.CSA = 100;
       prism2.LSA = 200;
       System.out.println("The Total surface area is "+ prism2.calcTSA()+ "unit square");
   }
}

