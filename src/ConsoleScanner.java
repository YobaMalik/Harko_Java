import java.util.Scanner;

public class ConsoleScanner {

    public void scan(){
        Task task = new Task();
        int incValue = 0;

        System.out.println("1 - проверка числа больше 7");
        System.out.println("2 - проверка имени Вячеслав");
        System.out.println("3 - проверка элементов массива на кратность 3");
        System.out.println("0 - выход из программы");

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext()) {
            incValue = scanner.nextInt();
        }
        switch (incValue) {
            case 1:
                System.out.print("Введите число: ");
                task.checkNumber(scanner.nextDouble());
                scan();
                break;

            case 2:
                System.out.print("Введите имя: ");
                task.checkName(scanner.next());
                scan();
                break;

            case 3:
                System.out.print("Введите элементы массива через пробел. (Пример массива: 1 2 3 4 5): ");
                task.checkMultiple(scanner);
                scan();
                break;

            case 0:
                break;
        }
    }

}

