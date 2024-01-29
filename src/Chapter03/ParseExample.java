package Chapter03;

public class ParseExample {
    public static void main(String[] args) {
        String abc = "7564";

        int intValue = Integer.parseInt(abc); //primitive 타입
        long longValue = Long.parseLong(abc);


        Integer integerValue = Integer.valueOf(abc); //wrapper 타입


        String str;
        Object nullValue = null;

        str = nullValue.toString(); //NullPointException 발생
        str = String.valueOf(str);
    }
}
