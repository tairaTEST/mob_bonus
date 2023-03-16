public class Main {
    public static void main(String[] args) {


        int startAmount = 400; // изначальная сумма на счёте
        int amount = 1200;// сумма пополнения
        int part = 100; // количество рублей для начисления одного бонуса/рубля
        if (amount > 1000) {
            System.out.println("Итоговый бонус: " + (amount / part));
            System.out.println("Итоговый счёт: " + (startAmount + amount + (amount / part)));
        } else {
            System.out.println("Итоговый бонус = " + 0);
            System.out.println("Итоговый счёт: " + (startAmount + amount));
        }


    }
}
