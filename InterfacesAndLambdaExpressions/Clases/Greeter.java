package InterfacesAndLambdaExpressions.Clases;

public class Greeter implements Runnable {
    private int n;
    private String target;
    private Thread thread=Thread.currentThread();



    public Greeter(int n, String target){
        this.n=n;
        this.target=target;
    }



    @Override
    public void run() {
        if(n<0){
            return;
        }

        for(int i=0; i<n;i++){
            System.out.println("Hello "+target+": THREAD:"+thread.getName());


        }


    }


}
