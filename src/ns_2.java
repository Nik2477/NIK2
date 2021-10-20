public class ns_2 {
    public static void main(String[] args) {
        int a = 0; // Начальное значение диапазона - "от"
        int b = 1000000000; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        System.out.println("1-ое случайное число: " + random_number1);

        int random_number2 = a + (int) (Math.random() * b); // Генерация 2-го числа
        System.out.println("2-ое случайное число: " + random_number2);

        int random_number3 = a + (int) (Math.random() * b); // Генерация 3-го числа
        System.out.println("3-е случайное число: " + random_number3);

        int random_number4 = a + (int) (Math.random() * b); // Генерация 3-го числа
        System.out.println("4-ое случайное число: " + random_number4);

        int random_number5 = a + (int) (Math.random() * b); // Генерация 3-го числа
        System.out.println("5-ое случайное число: " + random_number5);
    }
}
