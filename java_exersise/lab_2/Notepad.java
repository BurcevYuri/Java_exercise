package Yuri.Burcev.SecondLab;

import java.util.ArrayList;

public class Notepad {
    ArrayList<NotepadRecord> notepaddata = new ArrayList<>();

    public void addnewitem(String str){
        notepaddata.add(new NotepadRecord(str));
    }

    public void writeall(){
        for (NotepadRecord record : notepaddata) System.out.println("- " + record.getRecord());
    }

    public void removeitem(int index) throws IndexOutOfBoundsException
    {
        notepaddata.remove(index);
    }
}
