//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int amount = 100; // начальный счет клиента
        int topUp = 1300; //сумма пополнения
        int total = amount + topUp;

        int bonus;
        if (topUp > 1000) {
            bonus = topUp / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Бонус " + bonus);
        System.out.println("Счет " + total);
    }
}