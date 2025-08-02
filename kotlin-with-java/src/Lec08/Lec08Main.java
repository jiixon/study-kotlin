package Lec08;

public class Lec08Main {
    public static void main(String[] args) {
        //가변인자
        String[] array = new String[]{"A", "B", "C"};
        printAll(array);
        printAll("A", "B", "C");

    }

    public void repeat(String str, int num, boolean useNewLine) {
        for (int i = 1; i <= num; i++) {
            if (useNewLine) {
                System.out.println(str);
            } else {
                System.out.print(str);
            }
        }
    }

    public void repeat(String str, int num) {
        repeat(str, num, true);
    }

    public void repeat(String str) {
        repeat(str, 3, true);
    }

    //같은 타입의 여러 파라미터 받기(가변인자)
    public static void printAll(String... strings) {
        for(String str : strings) {
            System.out.println(str);
        }
    }
}
