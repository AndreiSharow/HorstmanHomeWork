package InterfacesAndLambdaExpressions.Clases;

public class Exer13 {

    public static void main(String[] args) {


    }




    public static Runnable getRunnable(Runnable[] runnables){
            return ()->{
            for(int i=0;i<runnables.length;i++) {
                 runnables[i].run();
            }
            };
        }


    }





