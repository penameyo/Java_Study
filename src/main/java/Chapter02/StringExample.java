package Chapter02;

public class StringExample {
    public static void main(String[] args) {
        String a = "Hello World!"; // 문자열의 순서는 0부터 11까지! (H가 1번째는 아님!)
        System.out.println(a.indexOf("!")); // !는 몇번째 요소인가?
        System.out.println(a.contains("World")); // world가 a에 포함되었는지?
        System.out.println(a.replaceAll("World!", "taeyuniya!"));
        System.out.println(a.substring(1, 5)); // 1번째 부터 5번째 까지 출력
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());

        String findChar = "Whats your hobby?";
        System.out.println(findChar.charAt(6)); // 문자열의 6번째의 특정 문자 리턴

        String b = "HelloJava";
        String[] result = a.split("J");
        for (int i = 0; i<result.length; i++){
            System.out.println(result);
        }

        String result2 = "hello";
        System.out.println(result2.concat("!")); //문자열 + 추가 문자

        String 김태윤 = String.format("%s의 나이는 %s세 입니다.", "김태윤",28);
        System.out.println(김태윤);

        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append("World!");
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder(); //문자열을 추가, 변경(연산)
        builder.append("Hello");
        builder.append("World!");
        System.out.println(builder);
    }
}
