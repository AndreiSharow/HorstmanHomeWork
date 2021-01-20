package Elementary;

import java.math.BigInteger;

public class Exer5 {
    private BigInteger big;

    public Exer5(){
        big=new BigInteger("1");
        System.out.println(big);
        for(int i=1;i<1000;i++){
            big=big.multiply(BigInteger.valueOf(i));
        }
        System.out.println(big);
    }


}
