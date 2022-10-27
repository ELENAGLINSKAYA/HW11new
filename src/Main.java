import java.time.LocalDate;

public class Main {
    public static void isLeapYearCount(int year) {
        boolean leapYaerCount = (year > 1584 &&
                ((year % 400 == 0) ||
                        (year %4 == 0 && year % 100 != 0)));
        if (leapYaerCount)
            System.out.println("Год" + year + "високосный");

        else
            System.out.println("Год " + year + " не високосный");
    }
    public static void isDeviceAge(int yearOS, int oS){
        int currentyear = LocalDate.now().getYear();
        if (oS==0 && yearOS<=currentyear) {
            System.out.println("Уствновите версию  обычную приложения iOS по ссылке");
        }else if (oS==0 && yearOS > currentyear ){
            System.out.println("Установите lite версию приложения  для iOS по ссылке");
        } else if (oS==1 && yearOS <=currentyear) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else if (oS==1 && yearOS> currentyear) {
            System.out.println("Установите  lite версию приложения для Android по ссылке");

        }
    }
    public static void isDeliveryDay( int distance){
        int day = 1;
        int dayNew = ++day;
        int dayNew1 =++dayNew;

        if (distance <= 20) {
            System.out.println("Срок доставки 1 день");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Срок доставки" + dayNew + "дня");
        } else if (distance > 60 && distance < 100) {
            System.out.println("Потребуется на доставку " + dayNew1 + " дня");
        }}
    public static void main(String[]args) {
        System.out.println("Hello world!");

        System.out.println("Задача 1");
        int yaer  = 2021;
        isLeapYearCount(yaer);

        System.out.println();
        System.out.println("Задание 2");
        int yaerOS = 2022;
        int OS = 1;
        isDeviceAge(yaerOS ,OS);

        System.out.println();
        System.out.println("Задание 3");
        int distance = 90;
        isDeliveryDay(distance);

    }}
