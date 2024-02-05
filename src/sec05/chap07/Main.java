package sec05.chap07;

public class Main {
    public static void main(String[] args) {
        String ycCreed = YalcoChicken.CREED;
        // YalcoChicken.CREED = "우리의 튀김옷은 바삭하다"; // ⚠️ final 로 설정했기에 수정 불가

        final YalcoChicken store1 = new YalcoChicken(3, "판교");

        //  ⚠️  내용 바꾸는 건 불가 불가
        // store1 = new YalcoChicken(17, "강남");
        //  💡 요소 변경은 가능 -> Yalco Chicken 에 int no, String name
        store1.name = "선릉";
    }
}
