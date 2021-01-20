package InterfacesAndLambdaExpressions.Clases;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exer9  {



            public static void main(String... args) throws InterruptedException {

                Runnable ru=()->{
                  for(int i=0; i<1000;i++){

                  }
                    System.out.println();
                };


                runTogetner(ru,ru,ru);
                runInOrder(ru,ru,ru);


            }

            public static void runTogetner(Runnable... rune) throws InterruptedException {

                for(Runnable r:rune){
                    r.run();



                }



            }
            public static  void runInOrder(Runnable... rune) throws InterruptedException {

                for (Runnable r : rune) {
                    Thread t = new Thread(r);
                    t.start();
                    t.join();


                }


            }
}
