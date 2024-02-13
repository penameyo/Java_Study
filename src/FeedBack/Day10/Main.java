package FeedBack.Day10;
interface Movable {
    void move();
}

interface Jumpable {
    void jump();
}

class Player implements Movable, Jumpable{
    private String name = "골드";

    public Player(){
    }

    public Player(String name){
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(name + "이(가) 움직입니다.");
    }

    @Override
    public void jump() {
        System.out.println(name + "이(가) 점프합니다.");
    }
}
abstract class Pokemon {
    private String name;
    private int level;
    private int exp = 0;
    private int hp;

    public Pokemon(int level){
        this.level = level;
        this.hp = level * 20;
    }

    public Pokemon(String name, int level){
        this.name = name;
        this.level = level;
        this.hp = level * 20;
    }

    public void expUp(int exp){
        this.exp += exp;
        while (this.exp >= 100) {
            this.exp -= 100;
            levelUp();
        }
    }

    public void levelUp(){
        level++;
        hp = level * 20;
        System.out.println(name + "이(가) 레벨업을 하여 " + level + "레벨이 되었습니다");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public int getHp() {
        return hp;
    }
}

class Pikachu extends Pokemon implements Movable, Jumpable {

    public Pikachu(int level) {
        super(level);
        this.setName("피카츄");
    }

    public Pikachu(String name, int level) {
        super(name, level);
    }

    public void move() {
        System.out.println(this.getName() + "이(가) 움직입니다.");
    }

    public void jump() {
        System.out.println(this.getName() + "이(가) 점프합니다.");
    }
}

class Squirtle extends Pokemon implements Movable, Jumpable{

    public Squirtle(int level) {
        super(level);
        this.setName("꼬부기");
    }

    public Squirtle(String name, int level) {
        super(name, level);
    }

    public void move() {
        System.out.println(this.getName() + "이(가) 움직입니다.");
    }

    public void jump() {
        System.out.println(this.getName() + "이(가) 점프합니다.");
    }
}

class Charmander extends Pokemon implements Movable, Jumpable{

    public Charmander(int level) {
        super(level);
        this.setName("파이리");
    }

    public Charmander(String name, int level) {
        super(name, level);
    }

    public void move() {
        System.out.println(this.getName() + "이(가) 움직입니다.");
    }

    public void jump() {
        System.out.println(this.getName() + "이(가) 점프합니다.");
    }
}

class Lapras extends Pokemon implements Movable{

    public Lapras(int level) {
        super(level);
        this.setName("라프라스");
    }

    public Lapras(String name, int level) {
        super(name, level);
    }

    public void move() {
        System.out.println(this.getName() + "이(가) 움직입니다.");
    }
}

class Metapod extends Pokemon {

    public Metapod(int level) {
        super(level);
        this.setName("단데기");
    }

    public Metapod(String name, int level) {
        super(name, level);
    }
}

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Lapras lapras = new Lapras(5);
        player.jump();
        lapras.move();
    }
}