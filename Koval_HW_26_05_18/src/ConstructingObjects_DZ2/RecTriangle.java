package ConstructingObjects_DZ2;

public class RecTriangle {

    static double cathetA;
    static double cathetB;

    static double height(RecTriangle triangle) {
        return (cathetA * cathetB) / Math.sqrt(Math.pow(cathetA, 2) + Math.pow(cathetB, 2));
    }
}
