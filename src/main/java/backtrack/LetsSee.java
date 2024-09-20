package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetsSee
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("test");
        list.add("shu");
        list.add("buu");
        for(int i = 0 ; i < list.size();i ++){
            list.remove(i);
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}
