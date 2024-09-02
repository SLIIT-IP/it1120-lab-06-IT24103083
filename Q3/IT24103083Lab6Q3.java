import java.util.Scanner;
  public class IT24103083Lab6Q3{
    public static void main(String[] args)
    {
      Scanner scanner=new Scanner(System.in);
      int  sumofSquares=0;
      int count=0;
     
      while (true) {
            System.out.print("Enter a positive integers (-99 to stop): ");
            int number = scanner.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println(" Enter a  number:");
                continue;
            }

            sumofSquares += number * number;
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt((double) sumofSquares / count);
            System.out.println("Root Mean Square (RMS): " + rms);
        } else {
            System.out.println("The Root Mean Square(RMS) is:");
     
      }
   }
}
