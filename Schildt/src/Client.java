public class Client implements CallBack {
    // реализовать интерфейс Callbak
    public void callback(int p){
        System.out.println ("Метод callback(), вызываемый со значением " +p);
    }
    void nonIfaceMeth(){
        System.out.println ("В классах, реализующих интерфейсы, "+"могут определятся и другие члены." );
    }
}
