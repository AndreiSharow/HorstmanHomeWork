package InterfacesAndLambdaExpressions.Clases;

import InterfacesAndLambdaExpressions.Interface.Measurable;

import java.util.Objects;

public class Employee implements Measurable {
    private double salary;
    private String name;

      public Employee (double salary, String name){
          this.salary=salary;
          this.name=name;
      }

      public Employee(double salary){
          this.salary=salary;
      }

        public String getName(){
          if(!Objects.isNull(name)){
              return name;
          }else {
              return "No name";
          }
        }



        @Override
        public double getMeasure() {
            return this.salary;
        }


        public String toString(){
          return "["+salary+","+this.getName()+"]";
        }
}
