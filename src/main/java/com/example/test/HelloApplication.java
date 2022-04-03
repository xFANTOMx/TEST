import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Main {

    public static void main (String[] args)  {

        System.out.println("Введите ИНН: ");
// ввод ИНН
        Scanner console = new Scanner(System.in);
        String inn = console.next();

        String data = inn.substring(0, inn.length()-5);
        String num = inn.substring(5,9);
        String sex = inn.substring(8,9);

// расчет даты рождения
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE,d MMMM, yyyy");
        Calendar calendar = new GregorianCalendar(1900,Calendar.JANUARY, 0);

        int gg = Integer.parseInt (data);
        calendar.add(Calendar.DATE,+ gg);
        System.out.print ("Дата рождения:");
        System.out.println (dateFormat.format (calendar.getTime()));

// вычисление пола
        int a = Integer.parseInt(sex);

        if (a%2 == 0)
            System.out.println("Пол: Женский");
        else
            System.out.println("Пол: Мужской");

// регистрационный номер
        int b = Integer.parseInt(num);
        System.out.println("Регистрационный номер: " + b);

// Знак зодиака
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);

        if ((day >= 22 && month == 11) || (day <= 20 && month == 0))
            System.out.println("Знак зодиака: Козерог");
        if ((day >= 21 && month == 0) || (day <= 19 && month == 1))
            System.out.println("Знак зодиака: Водолей");
        if ((day >= 20 && month == 1) || (day <= 20 && month == 2))
            System.out.println("Знак зодиака: Рыба");
        if ((day >= 21 && month == 2) || (day <= 20 && month == 3))
            System.out.println("Знак зодиака: Овен");
        if ((day >= 21 && month == 3) || (day <= 21 && month == 4))
            System.out.println("Знак зодиака: Телец");
        if ((day >= 22 && month == 4) || (day <= 21 && month == 5))
            System.out.println("Знак зодиака: Близнецы");
        if ((day >= 22 && month == 5) || (day <= 23 && month == 6))
            System.out.println("Знак зодиака: Рак");
        if ((day >= 24 && month == 6) || (day <= 23 && month == 7))
            System.out.println("Знак зодиака: Лев");
        if ((day >= 24 && month == 7) || (day <= 23 && month == 8))
            System.out.println("Знак зодиака: Дева");
        if ((day >= 24 && month == 8) || (day <= 23 && month == 9))
            System.out.println("Знак зодиака: Весы");
        if ((day >= 24 && month == 9) || (day <= 22 && month == 10))
            System.out.println("Знак зодиака: Скорпион");
        if ((day >= 23 && month == 10) || (day <= 21 && month == 11))
            System.out.println("Знак зодиака: Стрелец");

// расчет высокосного года
        int v = calendar.get(Calendar.YEAR);
        if (v %100==0 && v %400 ==0 )
            System.out.println("Год: Высокосный");
        else if (v % 4 == 0 && v % 100 > 0)
            System.out.println("Год: Высокосный");
        else if (v % 100 == 0)
            System.out.println("Год: Не высокосный");
        else
            System.out.println("Год: Не высокосный");

// Возраст

        Calendar today = Calendar.getInstance();

        int yearNow = today.get(Calendar.YEAR);
        int monthNow = today.get(Calendar.MONTH);
        int dayOfMonthNow = today.get(Calendar.DAY_OF_MONTH);

        int yearBirth = calendar.get(Calendar.YEAR);
        int monthBirth = calendar.get(Calendar.MONTH);
        int dayOfMonthBirth = calendar.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;

        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth)
                    age--;
            } else {
                age--;
            }
            System.out.println("Возраст:" + age);
        }

    }


}
