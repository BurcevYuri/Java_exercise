package Yuri.Burcev.SecondLab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Notepad notepad = new Notepad();
        while(true){
            System.out.println("Пожалуйста, введите команду\n Доступные команды: add, remove, writeall, exit");
            String usercomand = scan.nextLine();
            if(usercomand.equalsIgnoreCase("exit")){
                break;
            }
            else if(usercomand.equalsIgnoreCase("add")){
                System.out.println("Пожалуйста, введите текст");
                notepad.addnewitem(scan.nextLine());
            }
            else if (usercomand.equalsIgnoreCase("remove")){
                System.out.println("Пожалуйста, введите индекс эллемента");
                try {
                    notepad.removeitem(scan.nextInt());
                } catch (IndexOutOfBoundsException e){
                    System.out.println("Извините, вы допустили ошибку при вводе индекса и вызвали исключение\n"+ e );
                }
            }
            else if (usercomand.equalsIgnoreCase("writeall")){
                    notepad.writeall();
                }
                else {
                    System.out.println("Извените данная команда не поддерживается");
            }


        }
    }
}
