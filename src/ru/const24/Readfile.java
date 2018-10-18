package ru.const24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Readfile {

    private double unitUSD;
    private double unitRUB;
    private double unitEUR;

    public void read(String path) {
        File file = new File(path);
        Scanner sc = null;

        try {

            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                //.trim() осуществляет обрезание пробелов
                String[] arraylist = line.split(",");
                this.unitUSD = Double.parseDouble(arraylist[0].trim());
                this.unitRUB = Double.parseDouble(arraylist[1].trim());
                this.unitEUR = Double.parseDouble(arraylist[2].trim());
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

    public double getUnitUSD() {
        return unitUSD;
    }

    public double getUnitRUB() {
        return unitRUB;
    }

    public double getUnitEUR() {
        return unitEUR;
    }
}
