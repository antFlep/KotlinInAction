package chapter03.strings;

import java.util.ArrayList;

public class StringFunctionTest {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);

        System.out.println(StringFunctions.joinToString(list, ", ", "[", "]"));
    }
}
