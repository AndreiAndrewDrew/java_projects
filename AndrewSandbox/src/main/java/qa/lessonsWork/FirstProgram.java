package qa.lessonsWork;

public class FirstProgram {

  public static void main(String[] args) {
    System.out.println("Hello Andrew, World!!!");

    Square s = new Square(4.58);//iam dat la obiect valoare cu ajutorul coonstructului
    Rectangle r = new Rectangle(5.34, 3.23);

    System.out.println("Aria patratului cu latura de " + s.lat + " = " + s.ariapatrat());

    System.out.println("Aria dreptunghiului cu lungimea = " + r.lung + " si latimea = "
            + r.lats + " este = " + r.ariadreptunghi());


  }

}