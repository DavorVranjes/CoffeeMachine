package src;

import java.util.Scanner;

public class ConsoleMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine(550, 400, 540, 120, 9);
        String action = "";

        do {
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            action = scanner.next();

            switch (action) {
                case "buy":
                    buy(machine);
                    break;

                case "fill":
                    fill(machine);
                    break;

                case "remaining":
                    machine.remaining();
                    break;

                case "take":
                    take(machine);
                    break;

                case "exit":
                    break;
                default:
                    System.out.println("Wrong choice");

            }

        } while (!action.equals("exit"));
    }

    private static void buy(CoffeeMachine machine) {
        CoffeeCup cup;
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:, back - to main menu:  ");
        String choice = scanner.next();
        switch (choice) {
            case "1":
                cup = new CoffeeCup("espresso", 16, 250, 0, 4);
                break;
            case "2":
                cup = new CoffeeCup("latte", 20, 350, 75, 7);
                break;
            case "3":
                cup = new CoffeeCup("cappuccino", 12, 200, 100, 6);
                break;
            case "back":
                return;
            default:
                System.out.println("Wrong choice");
                return;
        }
        if (!machine.enoughResources(cup)) {
            System.out.println("Sorry, not enough " + machine.whatIsMissing(cup) + "!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            machine.makeCoffee(cup);
        }
    }

    public static void fill(CoffeeMachine machine) {
        System.out.print("Write how many ml of water do you want to add: ");
        machine.setWaterCurrent(machine.getWaterCurrent() + scanner.nextInt());
        System.out.print("Write how many ml of milk do you want to add: ");
        machine.setMilkCurrent(machine.getMilkCurrent() + scanner.nextInt());
        System.out.print("Write how many grams of coffee beans do you want to add: ");
        machine.setBeansCurrent(machine.getBeansCurrent() + scanner.nextInt());
        System.out.print("Write how many disposable cups of coffee do you want to add: ");
        machine.setDisposableCupsCurrent(machine.getDisposableCupsCurrent() + scanner.nextInt());
        scanner.nextLine();

    }

    public static void take(CoffeeMachine machine) {
        System.out.println("I gave you $" + machine.getMoneyCurrent() + " of money");
        machine.setMoneyCurrent(0);
    }

}
