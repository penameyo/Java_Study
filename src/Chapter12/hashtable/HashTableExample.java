package Chapter12.hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        map.put("taeyuniya12", "rladbs12!@");
        map.put("kkunh97", "rjsgur12!@");
        map.put("dlawhdfbf12", "rornf713!@");
        map.put("qkrwlstjd", "qkrwls12!@");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("아이디와 비밀번호를 입력해주세요");
            System.out.println("아이디: ");
            String id = scanner.nextLine();        // 키보드로 입력한 아이디를 읽는다

            System.out.println("비밀번호: ");
            String password = scanner.nextLine();
            System.out.println();

            if (map.containsKey(id)) {
                if (map.get(id).equals(password)) {
                    System.out.println("로그인이 되었습니다");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다!");
                }
            } else {
                System.out.println("입력하신 아이디가 존재하지 않습니다!\n");
            }
        }


    }
}

