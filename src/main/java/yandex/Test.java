package yandex;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        System.out.println(isLongPressedName("alex","aaleex"));
  //      System.out.println(isLongPressedName("saeed","ssaaedd"));
    //    System.out.println(isLongPressedName("leelee","lleeelee"));
        System.out.println(isLongPressedName("vtkgn","vttkgnn"));
        System.out.println(isLongPressedName("alex","aaleexa"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        if(typed.length() < name.length())
            return false;
        int type = typed.length();
        int nm = name.length();
        char prev = '0' ;
        int l1 = 0;
        int l2 = 0;
        while (true)
        {
            if(name.charAt(l1) == typed.charAt(l2))
            {

                l1 ++;
                prev = typed.charAt(l2);
                l2 ++;
            }else{
                if(prev =='0')
                    break;
                else if(prev == typed.charAt(l2))
                    l2++;
                else
                    break;
            }
            if(l1 == nm && l2 == type)
                break;
        }
        System.out.println(l1 + " " + l2);
        return (l1 == nm && l2 == type);
    }
}
