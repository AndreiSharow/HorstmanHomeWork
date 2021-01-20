package Elementary;

import java.util.Arrays;
import java.util.Random;

public class Exer9 {

      private   StringBuilder builder=new StringBuilder();
      private  Random random=new Random();
      private int length;



      public Exer9(){
          length=random.nextInt(15);

          for(int i=0;i<length;i++){

              if(random.nextInt(2)==0){
                  builder.append(random.nextInt(127));
              }else {
                  builder.append((char)random.nextInt(127));
              }
          }

          String str=builder.toString();
          long l=0;
          for(char c: str.toCharArray()){
              l+=c;
          }

          System.out.println(Long.toString(l,36));

      }


    @Override
    public String toString() {
        return builder.toString();
    }
}
