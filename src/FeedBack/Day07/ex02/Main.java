package FeedBack.Day07.ex02;

import FeedBack.Day07.ex01.SmartPhone;

public class Main {
    public static void main(String[] args) {
        //  ⭐️ 다른 패키지에서 사용하면 상단에 임포트되어야 함 (IDE 안내)
        SmartPhone smartPhone = new SmartPhone();

        //String pb = smartPhone.powerButton; // ⚠️ 불가
        String ss = smartPhone.sdCardSlot;
    }
}
