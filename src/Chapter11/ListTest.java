package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        java.util.List<String> list = new ArrayList<>();
        ListTest.add("페퍼로니피자");
        ListTest.add("콤비네이션피자");
        ListTest.add("시카고피자");
        ListTest.add("하와이안피자");
        ListTest.remove("하와이안피자");
        for (int i=0; i<list.length(); i++){
            System.out.println(list);
        }

        String[] str = new String[]{"elements11", "elements2", "elements3"};
    }

    private static void add(String elements) {
    }
}
