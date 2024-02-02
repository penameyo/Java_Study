package Chapter06.DailyQuiz;

public class ItemManage {



    public static void main(String[] args) {
        Book book = new Book(1, "김태윤은 158", 12000, "김태윤", "아람출판");
        book.print();

        Album album = new Album(2, "임종률", 13000);
        album.print();

        Movie movie = new Movie(3, "내 이름은 김거녁", 14000, "박진성", "김건혁");
        movie.print();
    }
}
