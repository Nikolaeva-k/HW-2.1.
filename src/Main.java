//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int amount = 100; // начальный счет клиента
        int top_up = 1300; //сумма пополнения
        int total = amount + top_up;

        int bonus;
        if (top_up >1000) {
            bonus = top_up / 100;
        } else {
            bonus =0;
        }
        System.out.println("Бонус " +bonus);
        System.out.println("Счет " +total);
        }
    }