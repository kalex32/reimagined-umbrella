package AbstractClass_DZ1;

class RunnerFinal {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();
        System.err.println(err.getErrorMsg(err.OUTERR));
        System.err.println(err.getErrorMsg(err.DISCERR));
    }
}
