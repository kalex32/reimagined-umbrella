package AbstractClass_DZ1;

class ErrorMsg {
    final int OUTERR=0;
    final int INERR=1;
    final int DISCERR=2;
    final int INDEXERR=3;

    String[] msg = {
            "Ошибки вывода",
            "Ошибки ввода",
            "Остутствует место на диске",
            "Выход индекса за границы диапазона"
    };

    String getErrorMsg(int i){
        if (i>=0&i<msg.length){
            return msg[i];
        }
        return "Несуществующий код ошибки";
    }
}
