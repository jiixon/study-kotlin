package Lec04;

public class Lec04Main {
    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(2_000L);
        JavaMoney money2 = new JavaMoney(1_000L);
        JavaMoney money3 = money2;
        JavaMoney money4 = new JavaMoney(1_000L);

        System.out.println(money2 == money3); //true
        System.out.println(money2 == money4); //false
        System.out.println(money2.equals(money4)); //true(오버라이딩)


        if(money1.compareTo(money2) > 0){
            System.out.println("Money1이 Money2보다 금액이 큽니다");
        }

        JavaMoney money5 = new JavaMoney(1_000L);
        JavaMoney money6 = new JavaMoney(2_000L);
        System.out.println(money5.plus(money6));
    }
}
