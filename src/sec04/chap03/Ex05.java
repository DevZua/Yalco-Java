package sec04.chap03;

public class Ex05 {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            //  💡 continue : 한 루프만 건너뜀
            if (i % 3 == 0) continue;

            //  💡 break : 반복문 전체를 종료
            if (i == 10) break;

            System.out.println(i);
        }

        System.out.println("\n- - - - -\n");

        String str = "호";

        //  ⭐️ 무한루프 탈출에 사용 가능
        for (;;) { // 다음 강의 while을 더 많이 사용
            str += "롤";
            System.out.println(str);
            if (str.length() == 100) break;
        }

        str += "로";
        System.out.println(str);
    }
}
