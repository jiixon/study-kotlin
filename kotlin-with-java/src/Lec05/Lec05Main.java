package Lec05;

public class Lec05Main {
    public static void main(String[] args) {

    }

    private String getPassOrFail(int score){
        if (score >= 50) {
            return "P";
        } else {
            return "F";
        }
    }

    private String getGrade(int score){
        if (score >= 90){
            return "A";
        } else if (score >= 80){
            return "B";
        } else if (score >= 70){
            return "C";
        } else {
            return "D";
        }
    }

    private String getGradeWithSwitch(int score){
        switch (score / 10){
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            default:
                return "D";
        }
    }

    private void validateScoreIsNotNegative(int score) {
        if (score < 0) {
            throw new IllegalArgumentException(String.format("%s는 0보다 작을수 없습니다.", score));
        }
    }
}
