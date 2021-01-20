package Elementary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exer14 {
    private ArrayList<ArrayList<Integer>> list=new ArrayList<>(3);
    private ArrayList<Integer> list1;


            public Exer14(){
                treugol(new Scanner(System.in).nextInt());
            }

    private void treugol(int n){
        for(int i=0; i<=8; i++){
            list.add(new ArrayList<Integer>());
            list1=list.get(i);

            for(int b=0; b<i;b++)
                list1.add(b,i);

            list1.add(0,1);
            list1.set(list1.size()-1,1);

            for(int j=1;j<i;j++){
                list1.set(j,list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
        }

        //System.out.println(list);
        showTreugol();
    }

    private void showTreugol(){
        Iterator<ArrayList<Integer>> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
