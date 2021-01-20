package InterfacesAndLambdaExpressions.Clases;

import InterfacesAndLambdaExpressions.Interface.*;



public class Exer5 {



    public static void main(String... args){

        //part 1 static
        int sequence=intSequence.constant(1);
        int check=0;
        while(true){
            System.out.print(intSequence.constant(5));
            if(check==7){
                break;
            }
            check++;
        }

        System.out.println("");

        //part2 lambda
        intSequenceExer5 sequenceExer5=(e)->e;
        int check2=0;
        while(true){
            System.out.print(sequenceExer5.constant(4));
            if(check2==7){
                break;
            }
            check2++;
        }




    }



}
