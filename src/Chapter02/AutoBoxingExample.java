package Chapter02;

import java.util.ArrayList;

public class AutoBoxingExample {
    public static void main(String[] args) {
        /* 오토박싱 */ // int -> Integer
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        System.out.println("arrayList = " + arrayList);

        /*ArrayList<Integer> arrayList1 = null;
        System.out.println(arrayList1.size());*/ //NullPointerException 오류가 출력됩니다

        int index = 11;
        Integer number = index;

        //오토박싱
        long startTimeMs = System.currentTimeMillis();
        Long sum = 0L;
        for (int i = 0; i < 1000000; i++) ;
        {
            sum = sum + 1;
        }
        System.out.println("실행시간 = " + (System.currentTimeMillis() - startTimeMs) + "ms");

        //primitive 단순연산
        long startTimeMs2 = System.currentTimeMillis();
        long sum2 = 0L;
        for (int i = 0; i < 1000000; i++) {
            sum2 = sum2 + 1;
        }
        System.out.println("실행 시간: " + (System.currentTimeMillis() - startTimeMs2) + "ms");

        String str = "12345";
        int intValue = Integer.parseInt(str);
        Integer integerValue = Integer.valueOf(str);
        System.out.println(intValue);
        System.out.println(integerValue);
    }
}

