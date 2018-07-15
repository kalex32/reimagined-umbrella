package Override_DZ1;

public class Account {
    // Создайте класс Account, у которого будет метод дебет, который будет снимать деньги с учетной записи.
    // Убедитесь, что сумма дебетов не превышает баланс счета. Если это так, баланс должен быть оставлен без изменений,
    // и метод должен напечатать сообщение:
    //-Дебит суммы превысил остаток на счете или
    //-Недостаточно средств на счету (как решите сами)
    //В классе AccountTest создать логику дебетования.

    private double balance;

    public Account(double initialBalance){
        if(initialBalance>0.0){
            balance = initialBalance;
        }
    }

    public void credit (double amount){
        balance = balance+amount;
    }

    public  void debit(double amount){
        if (amount>balance) System.out.println("Лучше по пивку и по домам!");
        else balance = balance-amount;
    }

    public double getBalance(){
        return balance;
    }
}