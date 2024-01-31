package Chapter04;

public class LambMarket {

    static final int LAMB_SKEWERS_PRICE = 12000;
    static final int DRINK_PRICE = 2000;

    public static void main(String[] args) {
        System.out.println(LambMarket.solution(10, 3));
    }

    public static int solution(int n, int k) {

        int service = n / 10;
        int answer = (n * LAMB_SKEWERS_PRICE) + (k * DRINK_PRICE) - (service * DRINK_PRICE);
        return answer;
    }
}

