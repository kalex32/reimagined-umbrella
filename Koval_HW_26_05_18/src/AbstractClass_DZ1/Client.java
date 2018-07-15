package AbstractClass_DZ1;

class Client implements Callback {
    @Override
    public void callBack(int param) {
        System.out.println("Реализация метода callBack(), вызываемого со значением "+param);
    }

    void anotherMethod(){
        System.out.println("В классах, реализующих интерфейсы, могут определяться и другие члены. ");
    }
}
