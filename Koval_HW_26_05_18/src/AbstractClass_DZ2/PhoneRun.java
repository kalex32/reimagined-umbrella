package AbstractClass_DZ2;

public class PhoneRun {
    public static void main(String[] args) {
        SmartPhone redmiNote5 = new XiaomiRedmiNote5("Android", 5.99, 2,3,32,4000,
                12, "Xiaomi","RedMi Note 5");

        System.out.println(redmiNote5.goodsInfo(redmiNote5));
    }
}
