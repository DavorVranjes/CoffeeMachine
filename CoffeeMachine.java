import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        int money = 550;
        int water = 400;
        int milk = 540;
        int beans = 120;
        int disposableCups = 9;


        System.out.println("The coffee machine has:");
        System.out.println( water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");

        System.out.print("Write action (buy, fill, take): ");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        System.out.println();

        if (action.equals("buy")) {
            System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
            int input = scanner.nextInt();
            System.out.println();
            if (input == 1) {
                int waterAfter = water - 250;
                int beansAfter = beans - 16;
                int moneyAfter = money + 4;
                int disCupsAfter = disposableCups - 1;
                System.out.println("The coffee machine has:");
                System.out.println( waterAfter + " ml of water");
                System.out.println(milk + " ml of milk");
                System.out.println(beansAfter + " g of coffee beans");
                System.out.println(disCupsAfter + " disposable cups");
                System.out.println("$" + moneyAfter + " of money");
            } else if (input == 2) {
                int waterAfter = water - 350;
                int milkAfter = milk - 75;
                int beansAfter = beans - 20;
                int moneyAfter = money + 7;
                int disCupsAfter = disposableCups - 1;
                System.out.println("The coffee machine has:");
                System.out.println( waterAfter + " ml of water");
                System.out.println(milkAfter + " ml of milk");
                System.out.println(beansAfter + " g of coffee beans");
                System.out.println(disCupsAfter + " disposable cups");
                System.out.println("$" + moneyAfter + " of money");
            } else if (input == 3) {
                int waterAfter = water - 200;
                int milkAfter = milk - 100;
                int beansAfter = beans - 12;
                int moneyAfter = money + 6;
                int disCupsAfter = disposableCups - 1;
                System.out.println("The coffee machine has:");
                System.out.println( waterAfter + " ml of water");
                System.out.println(milkAfter + " ml of milk");
                System.out.println(beansAfter + " g of coffee beans");
                System.out.println(disCupsAfter + " disposable cups");
                System.out.println("$" + moneyAfter + " of money");
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
            System.out.println("The coffee machine has:");
            System.out.println(addWater + " ml of water");
            System.out.println(addMilk + " ml of milk");
            System.out.println(addBeans + " g of coffee beans");
            System.out.println(addDisCups + " disposable cups");
            System.out.println("$" + money + " of money");

        } else if (action.equals("take")){
            System.out.println("I gave you $" + money);
            int moneyAfter = money - 550;
            System.out.println("The coffee machine has:");
            System.out.println(water + " of water");
            System.out.println(milk + " of milk");
            System.out.println(beans + " of beans");
            System.out.println(disposableCups + " of disposable cups");
            System.out.println(moneyAfter + " money");
        }
    }
}