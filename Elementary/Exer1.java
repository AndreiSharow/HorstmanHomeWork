package Elementary;

import java.util.Scanner;
import java.util.stream.Stream;

public class Exer1 {


            public Exer1(){
                result();
            }

            private void result(){
                System.out.print("Enter your number: ");
                Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();
                System.out.println(Integer.toString(number,2));
                System.out.println(Integer.toString(number,8));
                System.out.println(Integer.toString(number,16));
                System.out.println("Hex float-point: " + Double.toHexString(number));
            }






}
