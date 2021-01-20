package Elementary;

import java.util.Scanner;

public class Exer6 {

    int value1;
    int value2;
    final long DEFFAULT=2147483648l;

    public Exer6(){
        System.out.println("Enter your text: ");
        insertShort();
        getDifference();
        getMinus();
        getMultiplu();
        getSumma();


    }



    private void insertShort(){
        Scanner scanner=new Scanner(System.in);


        value1=(int)(scanner.nextLong()-DEFFAULT);
        value2=(int)(scanner.nextLong()-DEFFAULT);
    }

    private long returnValue(int val){
        return val+DEFFAULT;
    }

    public void getSumma(){
        System.out.println("summa: "+(returnValue(value1)+returnValue(value2)));
    }

    public void getDifference(){
        System.out.println("devide: "+(returnValue(value1)/returnValue(value2)));
    }
    public void getMinus(){
        System.out.println("minus: "+(returnValue(value1)-returnValue(value2)));
    }

    public void getMultiplu(){
        System.out.println("multiplu: "+(returnValue(value1)*returnValue(value2)));
    }


}
