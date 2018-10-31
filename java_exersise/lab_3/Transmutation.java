package Yuri.Burcev.ThirdLab;

import java.util.ArrayList;
import java.util.Arrays;

public class Transmutation {
    public static <T> ArrayList<T> toarraylist(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }
}