package OverrideMethods;

public class ErrMessage {
    String[] messages = {
            "Ошибка ввода",
            "Ошибка вывода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };

    String getErrMessage(int i) {
        if (i >= 0 & i < messages.length) {
            return messages[i];
        } else {
            return "Несуществующий код ошибки";
        }
    }
}

class ErrorMessage {
    public static void main(String[] args) {
        ErrMessage errorMessage = new ErrMessage();
        System.out.println(errorMessage.getErrMessage(2));
        System.out.println(errorMessage.getErrMessage(18));
    }
}
