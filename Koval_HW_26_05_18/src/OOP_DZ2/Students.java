package OOP_DZ2;

import java.util.Random;

public class Students {
    // В двумерном массиве хранится информация о количестве студентов в той или иной группе каждого курса института
    // с первого по пятый (в первой строке – информация о группах первого курса, во второй – второго и т.д.)
    // На каждом курсе имеется 8 групп. Определить среднее число студентов в одной группе.
    // (Сделаете вы с методом или без – решать Вам, в первую очередь это задачи на повторение)

    static int averageStudents(int[][] institute) {
        int sum = 0;
        for (int i = 0; i < institute.length; i++) {
            for (int j = 0; j < institute[i].length; j++) {
                sum = sum + institute[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[][] stud = new int[5][8];
        for (int i = 0; i < stud.length; i++) {
            for (int j = 0; j < stud[i].length; j++) {
                stud[i][j] = random.nextInt(35);
                System.out.print(stud[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Среднее число студентов в одной группе института: " + averageStudents(stud) / 40 + " человек.");
    }
}
