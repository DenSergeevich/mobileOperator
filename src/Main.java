public class Main {
    public static void main(String[] args) {
        int initialBalance = 150; // Начальный баланс
        int refillAmount = 1250; // Сумма пополнения
        int balance = initialBalance +  refillAmount;
        System.out.println("Итоговый счет = " + balance);

        int bonus = refillAmount > 1000 ? (refillAmount/100) : 0;
        System.out.println("Бонус = " + bonus );
    }
}
