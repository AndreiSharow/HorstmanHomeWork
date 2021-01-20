package InterfacesAndLambdaExpressions.Interface;

public interface intSequence {


    void show();


     static intSequence of(int... values){
        return new intSequence() {
            @Override
            public void show() {
                for(int i:values ){
                    System.out.print(i+" ");
                }
            }
        };
     }

     static int  constant(int i){
         while(true){
             return i;
         }
     }








}
