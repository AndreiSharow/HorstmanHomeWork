package InterfacesAndLambdaExpressions.Clases;

import java.io.File;
import java.io.FileFilter;

public class Exer11 {

    public static void main(String... args) {


        String str="D:\\Test";
        for (File f:getFiles(str,"")
             ) {
            System.out.println(f.getName());
        }


    }


    public static File[] getFiles(String catalog,String extension){
        if(catalog==null){
            return new File[0];
        }
        if(catalog.isEmpty()){
            return new File[0];
        }
        File files[]=new  File(catalog).listFiles(e->e.getName().endsWith(extension));


        return files;
    }






}
