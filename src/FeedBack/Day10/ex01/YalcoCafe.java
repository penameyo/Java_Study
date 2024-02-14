package FeedBack.Day10.ex01;

public class YalcoCafe extends YalcoGroup {
    public static String getCreed () {
        return CREED.formatted("원두향은");
    }
    protected static int lastNo = 0;

    private boolean isTakeout;

    public YalcoCafe(String name, boolean isTakeout) {
        super(++lastNo, name);
        this.isTakeout = isTakeout;
    }

    @Override
    public void takeOrder() {
        System.out.printf("얄코커피 %s 커피를 주문해주세요%n",super.intro());
    }
    //  💡 반드시 구현 - 제거해 볼 것

}
