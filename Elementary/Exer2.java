package Elementary;

import java.util.Scanner;

public class Exer2 {

    public Exer2(){
        result();
    }

    private void result(){
        System.out.println("Enter your int: ");
        Scanner scanner=new Scanner(System.in);
        int corner=scanner.nextInt(10);

        corner=corner%360;

        if(corner<0){
            System.out.println(corner+360);
            return;
        }
        System.out.println(corner);
        System.out.println("FloorMod:"+Math.floorMod(corner,360));








    }


}
