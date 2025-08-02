package Lec12;

public class JavaMoveableMain {
    public static void main(String[] args) {
        moveSomething(new Moveable() {
            @Override
            public void move() {
                System.out.println("움직인다");
            }

            @Override
            public void fly() {
                System.out.println("난다");
            }
        });
    }

    private static void moveSomething(Moveable moveable){
        moveable.move();
        moveable.fly();
    }

}
