package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {
        if (monthNumber > 12 || monthNumber < 1)
            throw new MyException(String.format("monthNumber %s is invalid, month number should be between 1..12", monthNumber));

        monthNumber = monthNumber == 12 ? 0 : monthNumber;
        int seasonNumber = monthNumber / 3;

        switch (seasonNumber) {
            case 0:
                return "зима";
            case 1:
                return "весна";
            case 2:
                return "лето";
            case 3:
                return "осень";
        }

        return "";
    }

}