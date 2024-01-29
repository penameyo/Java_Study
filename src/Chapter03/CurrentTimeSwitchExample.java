package Chapter03;

import Chapter01.FirstMain;

public class CurrentTimeSwitchExample {
    public static void main(String[] args) {

     String firstTime =args[0];
     int time = Integer.parseInt(firstTime);

        switch (time) {
            case 8:
                System.out.println("출근합니다");
                break;
            case 9:
                System.out.println("회의를 합니다");
                break;
            case 10:
                System.out.println("업무를 합니다");
                break;
            default:
                System.out.println("점심 먹을 준비 합니다");
        }
    }
}