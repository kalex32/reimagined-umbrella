package AbstractClass_DZ1;

public class Run {
    public static void main(String[] args) {
        Callback callback = new Client();
        callback.callBack(10);
        ((Client) callback).anotherMethod();
    }
}
