package sec05.chap07;

public final class YalcoChickenDT extends YalcoChicken {
    public YalcoChickenDT(int no, String name) {
        super(no, name);
    }

    //  ⚠️ 불가
    //public void fryChicken () { // 부모클래스가 final 이어서 "염지, 반죽익히기, 튀김" 그대로 해야함
        //System.out.println("염지, 반죽입히기, 미원, 튀김");
    //}

    // 생성자 추가할 것
}
