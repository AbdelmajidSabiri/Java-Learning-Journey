import java.util.Scanner;

public class WhileLoop {

 public static void main(String[] args) {
  

  Scanner scanner = new Scanner(System.in);
  String name = "";
  
  // check if name is empty
  while(name.isBlank()) {
   System.out.print("Enter your name: ");
   name = scanner.nextLine();
  }
  
  System.out.println("Hello "+name);
  scanner.close();
 }
}