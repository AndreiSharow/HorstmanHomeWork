package Elementary;

import java.util.Scanner;

public class Exer13 {
   private int magickConst=0;
   private boolean result=true;
   private int check=0;
   private Scanner scanner=new Scanner(System.in);
   private String str="";
   private  int mas[][];


    public Exer13(){
        setMassive();
        if(checkRows()){
            System.out.println("This is MAGIC BOX");
        }else {
            System.out.println("This is not MAGIC BOX");
        }


    }

    private boolean checkDiag(){
        int d1=0;
        int d2=0;

        for(int i=0; i<mas.length;i++){
            d1+=mas[i][i];
            d2+=mas[i][mas.length-1-i];
        }
        if(d1==magickConst & d2==magickConst){
            return true;
        }else {
            return false;
        }



    }






    private  boolean checkColumns() {

        for (int i = 0; i < mas.length; i++) {
            int sum = 0;
            for (int b = 0; b < mas[i].length; b++) {
                sum += mas[b][i];
            }
            if(magickConst==sum){
                result=true;
            }else {
                result=false;
            }

        }
        if(result){
            return checkDiag();
        }else {
            return false;
        }


    }

    private boolean checkRows(){
        //rows
        for(int[] i: mas){
            int sum=0;
            for(int b:i){
                sum+=b;
            }

            if(magickConst==sum){
                result=true;
                continue;
            }else {
                result=false;
                break;
            }
        }
        if(result){
            return checkColumns();
        }else {
            return  false;
        }

    }




    private void setMassive(){

         System.out.println("Please enter size:");
         mas=new int[scanner.nextInt()][scanner.nextInt()];
        scanner=null;
        System.out.println("Write number: ");
        do{
            scanner=new Scanner(System.in);
            str=scanner.nextLine();

            String stringMassive[]=str.split(" ");

            if(str.isEmpty()){
                break;
            }
            for(int i=0;i<stringMassive.length;i++ ){
                mas[check][i]=Integer.parseInt(stringMassive[i]);
            }
            check++;

        }while(!str.isEmpty());

        //set magic constant
        for(int[] i: mas){
            for(int b:i){
                magickConst+=b;
            }
            break;
        }


    }




}
