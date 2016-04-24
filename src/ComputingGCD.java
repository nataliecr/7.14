import java.util.Scanner;

public class ComputingGCD {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int[] values = new int[5];
    System.out.print("Enter five numbers: ");
    for (int i = 0; i < 5; i++)
      values[i] = input.nextInt();  
    
    //System.out.println(gcd(108, 30));
    System.out.println("The gcd is " + gcd(values));
  } // main  
  
  public static int gcd(int... numbers){
   int gcd = commondivisor(numbers[0], numbers[1]);;
   for (int i = 1; i < (numbers.length-2); i++){   
     gcd = commondivisor(gcd, numbers[i+2]);
   } // for i
   
   return gcd;
  } // gcd
  
  public static int commondivisor(int n1, int n2){
    int temp;
    
    while (n2 != 0){
      temp = n2;
      n2 = n1 % n2;
      n1 = temp;
    } // while
    
    return n1;
  } // gcd
} // class ComputingGCD
