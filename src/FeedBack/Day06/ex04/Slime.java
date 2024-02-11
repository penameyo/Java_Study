package FeedBack.Day06.ex04;

public class Slime {
    double hp = 50;
    int attack = 10;
    double defence = 0.2;

    void attack(Slime enemy) { //다른 슬라임의 인스턴스를 인자로 받음
        enemy.hp -= attack * (1 - enemy.defence);
    }
}
