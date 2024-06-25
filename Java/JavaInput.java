import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaInput {
   public static void main(String[] args) throws Exception{
      BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));

      // System.out.println("Enter name");
      // // for reading string
      // String name = buffread.readLine();
      // System.out.println(name);

      // the methods in BufferedReader is readLine()
      // note: you just need to parse the data for integer and double data type 

      // // for integer
      int integer = Integer.parseInt(buffread.readLine());

      // // for double
      // double doub = Double.parseDouble(buffread.readLine());

      System.out.println(integer);
      // System.out.println(doub);



      // using scanner
      Scanner input = new Scanner(System.in);

      String name = input.next();

      //the methods in Scanner is
      // next, nextInt, nextDouble, nextLine

      System.out.println(name);

      input.close();




   }
}
