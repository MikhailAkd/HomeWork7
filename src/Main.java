public class Main {
    public static void main(String[] args) {

        //Задача 1

        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();

        //Задача 2

        String fullNameCaps = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameCaps);
        System.out.println();

        //Задача 3

        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}