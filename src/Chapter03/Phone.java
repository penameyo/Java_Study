package Chapter03;

public class Phone {
    public static void main(String[] args) {
        int CAMERA = 1;                     //0 0 0 1 CAMERA : 1
        int WIFI = 1 << 2;                  //0 0 1 0 WIFI : 2
        int FLASH_LIGHT = 1 << 3;           //0 1 0 0 FLASH LIGHT : 3
        int SO_CARD = 1 << 4;               //1 0 0 0 SO CARD : 4

        int phone1 = CAMERA;
        int phone2 = CAMERA | WIFI;
        int phone3 = CAMERA | WIFI | FLASH_LIGHT | SO_CARD;

        // 0이면 지원하지 않는 것
        boolean p1HasCamera = (phone1 & CAMERA) > 0;

        boolean p2HasCamera = (phone2 & CAMERA) > 0;
        boolean p2HasWifi = (phone2 & WIFI) > 0;

        boolean p3HasCamera = (phone3 & CAMERA) > 0;
    }
}
