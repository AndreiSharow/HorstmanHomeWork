package Elementary;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Exer3 {


    public Exer3(){
        result();
    }

    private void result(){
        Scanner scanner=new Scanner(System.in);
        int value[]=new int[3];
        for(int i=0;i<value.length;i++){
            System.out.print("Enter your number: ");
            value[i]=scanner.nextInt();
        }

        if(value[0]>value[1]){
            System.out.println(value[0]);
        }else if(value[1]>value[2]){
            System.out.println(value[1]);
        }else {
            System.out.println(value[2]);
        }
        System.out.println("MATH.MAX: "+Math.max(Math.max(value[0],value[1]),value[2]));
        System.out.println("Double.MAX:"+Math.nextUp(Double.MAX_VALUE));
        System.out.println("Double.MIN:"+Math.nextUp(Double.MIN_VALUE));

    }



}
