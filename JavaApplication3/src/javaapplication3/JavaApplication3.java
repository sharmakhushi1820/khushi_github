package javaapplication3;
import java.io.*;
import java.util.*;
public class JavaApplication3  {
    static void Insert()
    {
        System.out.println("This is Insert Funcion");
    }
    static void Update()
    {
        System.out.println("This is Update Funcion");
    }
    static void Deletion()
    {
        System.out.println("This is Deletion Funcion");
    }
    static void Rename()
    {
        File f1 = new File("C:\\Users\\KHUSHI\\Desktop\\file");
        File f2 = new File("C:\\Users\\KHUSHI\\Desktop\\file1");
        if (f1.exists())
        {
            f1.renameTo(f2);
            System.out.println("File Updated");
        }
        
        else
        {
            System.out.println("File Not Found");
        }
    }
    public static void main(String[] args) {
        System.out.println("What operation do you want to perform?");
        System.out.println("Press 1 for Insert\nPress 2 for Update\nPress 3 for Deletion\nPress 4 for Rename");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        
        switch (input) {
            case 1 -> Insert();
            case 2 -> Update();
            case 3 -> Deletion();
            case 4 -> Rename();
            default -> System.out.println("Wrong Input");
        }
    }
}
       
    
    

