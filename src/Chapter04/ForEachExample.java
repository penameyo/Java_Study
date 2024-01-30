package Chapter04;

public class ForEachExample {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};
        //자료형 변수명!
        for(int arr : array){
            System.out.println(arr);
        }

        String[] numbers = {"태윤","진성","건혁","종률"};
        for (String element : numbers){
            System.out.println(element);
        }
    }
}
