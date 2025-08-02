package Lec13;

public class JavaHouse {
    private String address;
    private LivingRoom livingRoom;

    public JavaHouse(String address) {
        this.address = address;
        this.livingRoom = new LivingRoom(10);
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public static class LivingRoom { //static 권장
        private double area;

        public LivingRoom(double area) {
            this.area = area;
        }

//        public String getAddress() {
//            return JavaHouse.this.address;
//            //바깥 클래스인 JavaHouse를 바로 참조해서 field 가져옴
//        }
    }

}

