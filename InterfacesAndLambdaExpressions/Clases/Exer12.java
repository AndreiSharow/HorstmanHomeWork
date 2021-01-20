package InterfacesAndLambdaExpressions.Clases;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Exer12 {

    public static void main(String... args) {

        File files[]=new  File("D:\\Test").listFiles(e->e.getName().endsWith(""));



        sort(files);

        for (File f:files
        ) {
            System.out.println(f.getName());
        }

    }

    private static void sort(File[] files) {

        Arrays.sort(files, Comparator.comparing(File::isFile).thenComparing(File::getPath));


    }



}
