package Chapter11;

import ToSolving.Bufferd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        String filePath =
                System.getProperty("user.dir") + "C:/Users/박종호/Desktop/Study/Java_Study";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            System.out.println(br.readLine());

            br.close();
        } catch (IOException e) {
            System.out.println("이건 아닌듯?");

        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("이건 아닌듯 싶어요?");

                }
            }
        }

    }
}
