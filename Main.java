
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
   String name, address;
   
   Scanner sc = new Scanner(System.in);
   
   System.out.print("Name ");
   name = sc.nextLine();
   
   // Output
   System.out.print("My name is " + name);

System.out.print("Address: ");
address = sc.nextLine();

//Output
System.out.print("I live in "+ address);
  }
}
