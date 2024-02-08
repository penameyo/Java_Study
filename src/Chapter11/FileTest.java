package Chapter11;

public class FileTest {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("file.txt")) {
            fileInputStream.read();
            throw new Exception();        // 강제적으로 예외 발생시킴
        } catch (Exception e) {
            System.out.println("예외 처리 코드가 실행되었습니다.");
        }
    }
}
