import java.util.Scanner;
  public class IT24103083Lab6Q2C{
    public static void main(String[] args)
    {
     Scanner value=new Scanner(System.in);
     int []numbers=new int[10];
     int sum=0;

     for(int i=0; i <10;i++) {
         System.out.print("Enter number"+(i+1) + ":");
         numbers[i]=value.nextInt();
         sum+=numbers[i];
     }
     double average=sum/10.0;

     System.out.println("The numbers you entered are:");

     for(int i=0; i <10; i++) {
        System.out.println(numbers[i]);
     }
     System.out.println("sum: "+sum);
     System.out.println("average: "+average);
     
   }
}
