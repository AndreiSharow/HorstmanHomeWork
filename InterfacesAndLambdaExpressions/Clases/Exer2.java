package InterfacesAndLambdaExpressions.Clases;

import InterfacesAndLambdaExpressions.Interface.Measurable;

public class Exer2 {



    public static void main(String... arg){

        Measurable measurable[]={new Employee(1000,"Smith"),new Employee(1500,"Neo"),new Employee(1250,"Morphios")};

        System.out.println(largest(measurable));


    }


    static Measurable largest(Measurable[] object){
        Employee employee=(Employee)object[0];
        double max=employee.getMeasure();
        String name=employee.getName();

        for(Measurable m:object){
            if(m.getMeasure()>max){
                max=m.getMeasure();
                name=((Employee)m).getName();
            }
        }
        return new Employee(max,name);

    }
}
