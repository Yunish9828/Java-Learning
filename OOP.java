// class Rectangle{
//      int length;
//      int breadth;
//      int calcArea(){
//         return length * breadth;
//      }
// }
// class OOP{
//     public static void main(String[] args) {
//         Rectangle rect1 = new Rectangle();
//         rect1.length = 5;
//         rect1.breadth = 4;
//         System.out.println("The Area is: "+ rect1.calcArea());
//         Rectangle rect3 = new Rectangle();
//         rect3.length = 1;
//         rect3.breadth = 2;
//         System.out.println("The Area is: "+ rect3.calcArea());
//     }
// }

class Rectangle{
    int length;
    int breadth;
    int calcPerimeter(){
       return 2*(length + breadth);
    }
}
class oop_perimeter{
   public static void main(String[] args) {
       Rectangle rect1 = new Rectangle();
       rect1.length = 5;
       rect1.breadth = 4;
       System.out.println("The perimeter is: "+ rect1.calcPerimeter());
       Rectangle rect2 = new Rectangle();
       rect2.length = 1;
       rect2.breadth = 2;
       System.out.println("The perimeter is: "+ rect2.calcPerimeter());
   }
}

