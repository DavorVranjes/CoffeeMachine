import java.util.Scanner;

public class CoffeeMachine {

    static int money = 550;
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int disposableCups = 9;


    public static void main(String[] args) {

        printStatus();

        System.out.print("Write action (buy, fill, take): ");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        System.out.println();

        if (action.equals("buy")) {
            System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
            int input = scanner.nextInt();
            System.out.println();
            if (input == 1) {
                water = water - 250;
                beans = beans - 16;
                money = money + 4;
                disposableCups = disposableCups - 1;
                printStatus();
            } else if (input == 2) {
                water = water - 350;
                milk = milk - 75;
                beans = beans - 20;
                money = money + 7;
                disposableCups = disposableCups - 1;
                printStatus();
            } else if (input == 3) {
                water = water - 200;
                milk = milk - 100;
                beans = beans - 12;
                money = money + 6;
                disposableCups = disposableCups - 1;
                printStatus();
            }


        } else if (action.equals("fill")){
            System.out.print("Write how many ml of water do you want to add: ");
            int addWater = water + scanner.nextInt();
            System.out.println();
            System.out.print("Write how many ml of milk do you want to add: ");
            int addMilk = milk + scanner.nextInt();
            System.out.println();
            System.out.print("Write how many grams of coffee beans do you want to add: ");
            int addBeans = beans + scanner.nextInt();
            System.out.println();
            System.out.print("Write how many disposable cups of coffee do you want to add: ");
            int addDisCups = disposableCups + scanner.nextInt();
            System.out.println();
            printStatus();

        } else if (action.equals("take")){
            System.out.println("I gave you $" + money);
            int moneyAfter = money - 550;
            printStatus();
        }
    }

    private static void printStatus() {
        System.out.println("The coffee machine has:");
        System.out.println( water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");
    }
}