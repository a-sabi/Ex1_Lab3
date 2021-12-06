import java.util.regex.*;
import java.util.Scanner;
public class Ex1_Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в формате dd/mm/yyyy: ");
        String date = sc.next();
        Pattern p = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Matcher m = p.matcher(date);
        if (!m.matches()) {
            System.out.println("Строчка не является датой!");
        }
        else {
            String[] mas = date.split("/");
            int day = Integer.parseInt(mas[0]);
            int month = Integer.parseInt(mas[1]);
            int year = Integer.parseInt(mas[2]);
            if (!(year >= 1900 && year <= 9999)) {
               System.out.println("Неправильно введен год!");
            }
            else if (!(month >= 1 && month <= 12)) {
                System.out.println("Неправильно введен месяц!");
            }
            else {
                boolean y = false;
                switch(month) {
                    case 1: y = day <= 31;
                    case 2: y = day <= 28;
                    case 3: y = day <= 31;
                    case 4: y = day <= 30;
                    case 5: y = day <= 31;
                    case 6: y = day <= 30;
                    case 7: y = day <= 31;
                    case 8: y = day <= 31;
                    case 9: y = day <= 30;
                    case 10: y = day <= 31;
                    case 11: y = day <= 30;
                    case 12: y = day <= 31;
                }
                if (day <= 1 || !y) {
                    System.out.println("Неправильно введен день!");
                }
                else {
                    System.out.println("Дата введена верно!");
                }
            }
        }
    }
}
