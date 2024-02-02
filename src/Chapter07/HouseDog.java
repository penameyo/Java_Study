package Chapter07;

public class HouseDog extends Dog{
    void sleep(int hour){
        System.out.println(this.name + " Zzz... " + hour + " hours");
    }

    int sleep(double hour){
        return 0;
    }
        public static void main(String[] args) {
            HouseDog houseDog = new HouseDog();
            houseDog.setName("청장이");
            houseDog.sleep(1.2);
            houseDog.sleep(3);
    }
}
