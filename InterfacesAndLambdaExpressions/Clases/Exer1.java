package InterfacesAndLambdaExpressions.Clases;

import InterfacesAndLambdaExpressions.Interface.Measurable;

public class Exer1 {

    public static void main(String... args){
        Measurable measurable[]={new Employee(1000),new Employee(1500),new Employee(1250)};

        System.out.println(average(measurable));

    }
    static double average(Measurable[] object){
        double sum=0;

        for(Measurable b:object){
            sum+=b.getMeasure();
        }
        return sum/object.length;
    }


}
