// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int check = 300;
        int replenishmentAmount = 1200;

        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }
        int checkBefore = check + replenishmentAmount + bonus;

        System.out.println("Счет: " + checkBefore);
        System.out.println("Бонус: " + bonus);
    }
}