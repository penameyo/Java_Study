package Chapter06.DailyQuiz;

public class Item {
    int id;
    String name;
    int price;

    Item(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void print(){
        System.out.println(String.format("id: %s, name: %s, price: %s"
                +id, name, price)); //공통적으로 사용하는 메서드
    }
}
