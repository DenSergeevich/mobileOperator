public class Main {
    public static void main(String[] args) {
        int initialBalance = 150; // Начальный баланс
        int refillAmount = 1250; // Сумма пополнения
        int balance = initialBalance +  refillAmount;
        System.out.println("Итоговый счет = " + balance);

        if (refillAmount > 1000) {
            int bonus = refillAmount / 100;
            System.out.println("Бонус = " + bonus);

        }
    }
}
