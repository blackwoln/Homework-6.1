public class Main {
    public static void main(String[] args) {
        task1();//Задача 1,2,3
        task2();//Задача 4

    }

    public static void task1 () {
        System.out.println("Задача 1,2");
        /*
        Задача 1.
        Объявите три массива:

        Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.

        Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986.
        Массив сразу заполните значениями.

        Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите
        способ создания массива: с помощью ключевого слова или сразу заполненный элементами.

         Задача 2.
        Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        В конце строки запятую ставить не надо.

        Задача 3.
        Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        В конце строки запятую ставить не надо.
         */
        // Задача 1
        int[] well = new int [3];
        well[0] = 1;
        well[1] = 2;
        well[2] = 3;


        // Задача 2
        System.out.println("Элементы массива well:");
        for (int i = 0; i < well.length; i++) {
            System.out.print(well[i]);
            if (i != well.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        // Задача 3
        for (int i = well.length - 1; i >= 0; i--) {
            System.out.print(well[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();


        // Задача 1
        double[] two = new double[] {1.57, 7.654, 9.986};


        // Задача 2
        System.out.println("Элементы массива two:");
        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i]);
            if (i != two.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        // Задача 3
        for (int i = two.length - 1; i >= 0; i--) {
            System.out.print(two[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();


        // Задача 1
        int[] three = {45, 234, 56, 75, 235, 86, 45, 97};


        // Задача 2
        System.out.println("Элементы массива three:");
        for (int i = 0; i < three.length; i++) {
            System.out.print(three[i]);
            if (i != three.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        // Задача 3
        for (int i = three.length - 1; i >= 0; i--) {
            System.out.print(three[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

    }

    public static void task2 () {
        System.out.println("Задача 2");
        /*
       Задача 4.
       Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте
       четными (нужно прибавить 1).

       Важно: код должен работать с любым целочисленным массивом, поэтому для решения
       задания используйте циклы.

       Распечатайте результат преобразования в консоль.
         */
        int[] well = new int [3];
        well[0] = 1;
        well[1] = 2;
        well[2] = 3;

        for (int i = 0; i < well.length; i++) {
            if (well[i] % 2 != 0) {
                well[i]++;
            }
        }

        // Выводим преобразованный массив в консоль
        for (int i = 0; i < well.length; i++) {
            System.out.print(well[i]);
            if (i < well.length - 1) {
                System.out.print(", ");
            }
        }
    }

}