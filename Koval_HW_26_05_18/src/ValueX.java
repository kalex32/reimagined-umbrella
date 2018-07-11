public class ValueX {
    // Рассчитать значение x, определив и использовав необходимый метод:

    private static double x1() {
        return (Math.sqrt(6) + 6) / 2 + (Math.sqrt(13) + 13) / 2 + (Math.sqrt(21) + 21) / 2;
    }

    private static double x2() {
        return (5 + Math.sqrt(5)) / (Math.sqrt(7) + 7) + (12 + Math.sqrt(12) / (Math.sqrt(8) + 8)) + (31 + Math.sqrt(31) / (Math.sqrt(2) + 2));
    }

    private static double x3() {
        return (15 + Math.sqrt(8)) / (8 + Math.sqrt(15)) + (6 + Math.sqrt(12)) / (12 + Math.sqrt(6)) + (7 + Math.sqrt(21)) / (21 + Math.sqrt(7));
    }

    private static double x4() {
        return (13 + Math.sqrt(7)) / (7 + Math.sqrt(13)) + (15 + Math.sqrt(12)) / (Math.sqrt(15) + 12) + (Math.sqrt(21) + 32) / (Math.sqrt(32) + 21);
    }

    public static void main(String[] args) {
        System.out.println(x1());
        System.out.println(x2());
        System.out.println(x3());
        System.out.println(x4());
    }
}
