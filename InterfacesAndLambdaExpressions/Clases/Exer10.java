package InterfacesAndLambdaExpressions.Clases;

import java.io.File;
import java.io.FileFilter;

public class Exer10 {

    public static void main(String... args) {


        String str="C:\\Program Files";
        for (File f:getDicetionLinkMethod(str)
             ) {
            System.out.println(f.getName());
        }

    }





    public static File[] getDicetionLinkMethod(String directory){

        if(!check(directory)){
            return new File[0];
        }

        File  file=new File(directory);

        File files[]=file.listFiles(File::isDirectory);
        if(files==null){
            return new File[0];
        }
        return files;
    }

    public static File[] getDicetionLambda(String directory){

        if(!check(directory)){
            return new File[0];
        }

        File  file=new File(directory);
        File files[]=file.listFiles(e->e.isDirectory());

        if(files==null){
            return new File[0];
        }
        return files;
    }

    public static File[] getDicetionInnerClass(String directory){

        if(!check(directory)){
            return new File[0];
        }

        File  file=new File(directory);
        File files[]=file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory();
            }
        });

        if(files==null){
            return new File[0];
        }
        return files;
    }





    public static boolean check(String directory){
        if(directory==null){
            return false;
        }
        if(directory.isEmpty()){
            return false;
        }
        return true;

    }
}
