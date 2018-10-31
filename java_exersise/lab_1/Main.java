package Yuri.Burcev.FirstLab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int UserDataInput()
        {   int userdata;
            try{
                System.out.println("пожалуйста, введите число");
                Scanner scan = new Scanner(System.in);
                userdata = scan.nextInt();
            }

        catch(InputMismatchException e)
        {
            System.out.println("Извините, вы ввели не число.\n" + e + "\nВы возвращены к моменту допущения ошибки");
            return UserDataInput();
        }
        return userdata;
        }

    public static void main(String[] args) {
        Matrix myMatrix = new Matrix(UserDataInput());
        myMatrix.MatrixFilling();
        myMatrix.matrixoutput();
    }
}
