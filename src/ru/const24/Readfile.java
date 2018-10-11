package ru.const24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Readfile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Yuliya\\Desktop\\2018-09-27.txt");
        Scanner sc = null;




        try {

            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                //.trim() осуществляет обрезание пробелов
                String[] arraylist = line.split(",");
                String unitUSD = arraylist[0];
                String unitRUB = arraylist[1];
                String unitEUR = arraylist[2];
                System.out.println(Arrays.toString(arraylist)); //печать строки в стандартный вывод
                System.out.println(unitRUB);
            }


        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            sc.close();
        }

    }
}
