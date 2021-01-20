package Elementary;

import java.util.Scanner;

public class Exer10 {

    public Exer10(){
        Scanner scanner=new Scanner(System.in);
        String stroka=scanner.nextLine();
        int code[]=stroka.codePoints().toArray();

        for(int i=0; i<code.length;i++){
            if(code[i]>127){
                System.out.println((char)code[i]);
            }
        }

    }



}
