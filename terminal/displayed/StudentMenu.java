package terminal.displayed;

public class StudentMenu {
    public static void displayMenu(){
        System.out.println("Введите команду и данные студента через пробел.");
        System.out.println("Примеры: /add /student Захаров Николай Владимирович 1998,\n" +
                "         /delete /student Захаров Николай Владимирович 1998");
    }
}