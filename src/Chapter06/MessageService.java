package Chapter06;

public class MessageService {
    static final String MESSAGE_FORMAT = "[쌍용정보통신] %s님의 이용약관 개정 메시지 입니다.";

    void send(){
        System.out.println(MESSAGE_FORMAT.formatted("김건혁"));
    }
}
