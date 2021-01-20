package Elementary;

import java.util.Scanner;

public class Exer7 {

    public Exer7(){
        System.out.println("Enter your text: ");
        Scanner scanner=new Scanner(System.in);
        String stroka=scanner.nextLine();
        String massive[]=stroka.split(" ");
        for(int i=0; i<massive.length;i++){
            System.out.println(massive[i]);
        }


    }

}
