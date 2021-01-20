package InterfacesAndLambdaExpressions.Clases;
import InterfacesAndLambdaExpressions.Clases.Greeter;

public class Exer8 {


    public static void main(String... args) {
        Greeter greeter1 = new Greeter(5, "Andrei");
        Greeter greeter2 = new Greeter(5, "KODSWORD");

        greeter1.run();
        greeter2.run();


    }
}
