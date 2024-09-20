import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DeleteText {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("delete.txt"));
        PrintWriter output = new PrintWriter(new File("outputDelete.txt"));
        int cnt = 0;
        while (cin.hasNext()){

            String s = cin.nextLine();
            // System.out.println(s);
            if(cnt % 2 == 0) {
                if (s.charAt(0) == '\"') {
//                    System.out.println(s.substring(1, s.lastIndexOf("\"")));
                    output.println('\'' + s.substring(1, s.lastIndexOf("\"")) + "\',");
                } else {
                    output.println('\'' + s + "\',");
                    System.out.println(s);
                }
            }
            cnt ++;
        }
        output.close();
    }
}
