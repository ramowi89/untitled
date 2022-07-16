public class Lesson1{
    public static void main(String[] args) {
        System.out.println("Hello world");

        //Примитивы
        //нравится ли вам кофе?
        //true - Да, false - нет
        boolean answer = true;
        System.out.println("Нравится ли вам кофе");
        System.out.println(answer);
        //от минус 128 до 128
        byte bt = 127;

        //Больше значений
        short sh = 32000;

        // Диапазон от - 2 147 483 648 до 2 147 483 649
        int number = 2_000_000_000;

        //
        long ln = 8_000_000_000L;

        //ЧИСЛА С ПЛАВАЮЩЕЙ ТОЧКОЙ
        float fl = 3.123456789f;
        System.out.println(fl);

        double db = 3.11232546488989595959;
        System.out.println(db);


        double number1 = 10;
        int number2 = 3;
        double result = number1 / number2;
        double result2 = number1 - number2;
        double result3 = number1 + number2;
        double result4 = number1 * number2;
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);


        //символы
        char ch = 123;
        System.out.println(ch);

        int[] array = new int[5];
        array[0] = 10;
        System.out.println(array[0]);

        char[] arrayChar = new char[5];
        arrayChar[0] ='В';
        arrayChar[1] ='о';
        arrayChar[2] ='д';
        arrayChar[3] ='к';
        arrayChar[4] ='а';
        System.out.println(arrayChar);

        char[] newArray = new char[]{''}

        String  vodka = "водка";
        System.out.println(vodka);
        String forChapaev = " для чапаева";
        //конкатенация
        String resultChapaev = vodka + forChapaev;
        System.out.println(resultChapaev);

        System.out.println("Информация: " + true);




    }

    }

