import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void checkYear(int year) {
        if (year > 1584) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год — високосный год");
            } else {
                System.out.println(year + " год — невисокосный год");
            }
        } else {
            System.out.println("В " + year + " году ещё не вёлся отсчёт високосного года");
        }
    }
    public static void checkOSAndYear(int clientOS1, int deviceYear ) {
        if (deviceYear < 2015 && clientOS1 == 0) {
            if (clientOS1 == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if(deviceYear >= 2015 && clientOS1 == 0)
                System.out.println("Установите  версию приложения для iOS по ссылке");
        } else if (deviceYear < 2015 && clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (deviceYear >= 2015 && clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void finalDeliveryTime(int deliveryDistance, int deliveryDays) {
        if (deliveryDistance <= 100) {
            if (deliveryDistance > 0 && deliveryDistance < 20) {
                System.out.println("Потребуется дней: " + deliveryDays);
            } else if (deliveryDistance <= 60) {
                System.out.println("Потребуется дней: " + (deliveryDays + 1));
            } else if (deliveryDistance <= 100) {
                System.out.println("Потребуется дней: " + (deliveryDays + 2));
            }
        } else {
            System.out.println("Доставка невозможна");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание №1");
        int currentYear = LocalDate.now().getYear();
        checkYear(currentYear);

        System.out.println("Задание №2");
        int clientOS1 = 1; // переменную года устройства взял из currentYear в задании №1, которое определило текущий год
        checkOSAndYear(clientOS1, currentYear);

        System.out.println("Задание №3");
        int deliveryDistance = 91;
        int deliveryDays = 1;
        finalDeliveryTime(deliveryDistance, deliveryDays);
    }
}
