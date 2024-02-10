package FeedBack.Day04;

public class SelfStudy04_method05 {
    public static void main(String[] args) {

        String class3Desc = descClass(3, "목아진", "짱구", "철수", "훈이");

        String[] kids = {"짱구", "철수", "훈이"};
        String class3DescByArr = descClass(3, "목아진", kids);
        System.out.println(class3Desc);

    }

    //  💡 ... 연산자 : 해당 위치 뒤로 오는 연산자들을 배열로 묶음
    //  int[] (배열 자체를 받음)과는 다름!
    static double getAverage(int... nums) {
        double result = 0.0;
        for (int num : nums) {
            result += num;
        }
        return result / nums.length;
    }

    //  ⭐️ 다른(정해진) 인자들과 사용시 맨 마지막에 놓을 것
    static String descClass (int classNo, String teacher, String... kids) {
        return "%d반의 담임은 %s 선생님, 원생들은 %s 입니다."
                .formatted(classNo, teacher, String.join(", ", kids));
    }
}
