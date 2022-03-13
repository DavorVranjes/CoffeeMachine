package src;

public class CoffeeMachine {

    private int moneyCurrent = 550;
    private int waterCurrent = 400;
    private int milkCurrent = 540;
    private int beansCurrent = 120;
    private int disposableCupsCurrent = 9;

    public CoffeeMachine(int moneyCurrent, int waterCurrent, int milkCurrent, int beansCurrent, int disposableCupsCurrent) {
        this.moneyCurrent = moneyCurrent;
        this.waterCurrent = waterCurrent;
        this.milkCurrent = milkCurrent;
        this.beansCurrent = beansCurrent;
        this.disposableCupsCurrent = disposableCupsCurrent;
    }

    public int getMoneyCurrent() {
        return moneyCurrent;
    }

    public void setMoneyCurrent(int moneyCurrent) {
        this.moneyCurrent = moneyCurrent;
    }

    public int getWaterCurrent() {
        return waterCurrent;
    }

    public void setWaterCurrent(int waterCurrent) {
        this.waterCurrent = waterCurrent;
    }

    public int getMilkCurrent() {
        return milkCurrent;
    }

    public void setMilkCurrent(int milkCurrent) {
        this.milkCurrent = milkCurrent;
    }

    public int getBeansCurrent() {
        return beansCurrent;
    }

    public void setBeansCurrent(int beansCurrent) {
        this.beansCurrent = beansCurrent;
    }

    public int getDisposableCupsCurrent() {
        return disposableCupsCurrent;
    }

    public void setDisposableCupsCurrent(int disposableCupsCurrent) {
        this.disposableCupsCurrent = disposableCupsCurrent;
    }

    public boolean enoughResources(CoffeeCup cup) {
        return waterCurrent >= cup.getWaterNeeded() && beansCurrent >= cup.getBeansNeeded() && milkCurrent >= cup.getMilkNeeded() && disposableCupsCurrent > 0;
    }

    public void makeCoffee(CoffeeCup cup) {
        waterCurrent -= cup.getWaterNeeded();
        beansCurrent -= cup.getBeansNeeded();
        milkCurrent -= cup.getMilkNeeded();
        disposableCupsCurrent -= 1;
        moneyCurrent += cup.getPriceNeeded();
    }

    public String whatIsMissing(CoffeeCup cup) {
        String resources = "";
        if (waterCurrent < cup.getWaterNeeded()) resources = "water";
        else if (beansCurrent < cup.getBeansNeeded()) resources = "beans";
        else if (milkCurrent < cup.getMilkNeeded()) resources = "milk";
        else if (disposableCupsCurrent < 1) resources = "cups";

        return resources;

    }

    public void remaining() {
        System.out.println("The coffee machine has:\n" +
                getWaterCurrent() + " ml of water\n" +
                getBeansCurrent() + " g of coffee beans\n" +
                getMilkCurrent() + " ml of milk\n" +
                getDisposableCupsCurrent() + " disposable cups\n" +
                "$" + getMoneyCurrent() + " of money\n");
    }

}