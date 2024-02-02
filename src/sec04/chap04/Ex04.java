package sec04.chap04;

public class Ex04 {
    public static void main(String[] args) {
        final int LINE_WIDTH = 5;

        int lineWidth = LINE_WIDTH;

        while (lineWidth > 0) {
            int starsToPrint = lineWidth--;
            while (starsToPrint-- > 0) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
