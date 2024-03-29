package sec09.chap02;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Runnable dogButtonFunc = () -> System.out.println("멍멍");
        Runnable catButtonFunc = () -> System.out.println("야옹");
        Runnable cowButtonFunc = () -> System.out.println("음메");

        dogButtonFunc.run();
        catButtonFunc.run();
        cowButtonFunc.run();

        System.out.println("\n- - - - -\n");

        Button dogButton = new Button("강아지");
        dogButton.setOnClickListener(dogButtonFunc);

        Button catButton = new Button("고양이");
        catButton.setOnClickListener(() -> {
            System.out.println("- - - - -");
            System.out.println(catButton.getText() + " 울음소리: 야옹야옹");
            System.out.println("- - - - -");
        });

        dogButton.onClick();
        catButton.onClick();

        Supplier<String> appName = () -> "얄코오피스";
        Supplier<Double> rand0to10 = () -> Math.random() * 10;
        Supplier<Boolean> randTF = () -> Math.random() > 0.5;

        String supp1 = appName.get();
        Double supp2 = rand0to10.get();
        Boolean supp3 = randTF.get();



        System.out.println("\n- - - - -\n");

        Consumer<Integer> sayOddEven = i -> System.out.printf(
                "%d은 %c수입니다.%n", i, "짝홀".charAt(i % 2)
        );

        Consumer<Button> clickButton = b -> b.onClick();

        BiConsumer<Button, Integer> clickButtonNTimes = (b, n) -> {
            for (int i = 0; i < n; i++) { b.onClick(); }
        };

        sayOddEven.accept(3);
        sayOddEven.accept(4);
        clickButton.accept(catButton);
        clickButtonNTimes.accept(dogButton, 5);

        System.out.println("\n- - - - -\n");

        Function<Integer, Boolean> isOdd = i -> i % 2 == 1;
        Function<String, Button> getButton = s -> new Button(s);



    }
}
