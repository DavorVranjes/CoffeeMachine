package src;

public class CoffeeCup {
    String name;
    int beansNeeded;
    int waterNeeded;
    int milkNeeded;
    int priceNeeded;

    public CoffeeCup(String name, int beansNeeded, int waterNeeded, int milkNeeded, int priceNeeded) {
        this.name = name;
        this.beansNeeded = beansNeeded;
        this.waterNeeded = waterNeeded;
        this.milkNeeded = milkNeeded;
        this.priceNeeded = priceNeeded;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBeansNeeded() {
        return beansNeeded;
    }

    public void setBeansNeeded(int beansNeeded) {
        this.beansNeeded = beansNeeded;
    }

    public int getWaterNeeded() {
        return waterNeeded;
    }

    public void setWaterNeeded(int waterNeeded) {
        this.waterNeeded = waterNeeded;
    }

    public int getMilkNeeded() {
        return milkNeeded;
    }

    public void setMilkNeeded(int milkNeeded) {
        this.milkNeeded = milkNeeded;
    }

    public int getPriceNeeded() {
        return priceNeeded;
    }

    public void setPriceNeeded(int priceNeeded) {
        this.priceNeeded = priceNeeded;
    }
}