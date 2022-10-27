public class Main {
    public static void main(String[] args) {
        int initialBalance = 150; // Начальный баланс
        int refillAmount = 1250; // Сумма пополнения
        int bonus = refillAmount > 1000 ? (refillAmount/100) : 0;
        int balance = initialBalance +  refillAmount + bonus;
        System.out.println("Итоговый счет = " + balance);

        
        System.out.println("Бонус = " + bonus );
    }
}
