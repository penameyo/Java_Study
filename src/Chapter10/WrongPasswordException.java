package Chapter10;

public class WrongPasswordException extends Exception{
    // 생성자
public WrongPasswordException(){

}
    public WrongPasswordException(String message){
        super(message);
    }
}
