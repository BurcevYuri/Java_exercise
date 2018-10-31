package Yuri.Burcev.ThirdLab;

import java.util.ArrayList;
import java.util.Arrays;



public class Main {

    public static <T> ArrayList<T> toarraylist(T[] array){
        return new ArrayList<T>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        String [] stringarray = new String[7];
        ArrayList<String> ourstringlist;
        for(int i = 0; i < stringarray.length; i++) {
            stringarray[i] = ("element " + i);
        }
        ourstringlist = toarraylist(stringarray);
        for(int i = 0; i < ourstringlist.size(); i++) {
            System.out.println(ourstringlist.get(i));
        }

        Integer [] intarray = new Integer[7];
        ArrayList<Integer> ourintlist;
        for(int i = 0; i < intarray.length; i++) {
            intarray[i] = i;
        }
        ourintlist = toarraylist(intarray);
        for(int i = 0; i < ourintlist.size(); i++) {
            System.out.println(ourintlist.get(i));
        }

            Double [] doublearray = new Double[7];
        ArrayList<Double> ourdoublelist;
        for(int i = 0; i <doublearray.length; i++) {
            doublearray[i] = (i * 0.1);
        }
        ourdoublelist = toarraylist(doublearray);
        for(int i = 0; i < ourdoublelist.size(); i++) {
            System.out.println(ourdoublelist.get(i));
        }
        }
}
