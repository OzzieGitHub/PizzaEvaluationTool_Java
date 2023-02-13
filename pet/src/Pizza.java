import java.lang.Math;

public class Pizza {
    private String pizzaName;
    private int pizzaDiameter;
    private int pizzaPrice;
    private int pizzaWidth;
    private int pizzaLength;

    public Pizza(){

    }

    public String getPizzaName() {
        return this.pizzaName;
    }
    public int getPizzaWidth() {
        return this.pizzaWidth;
    }
    public int getPizzaLength() {
        return this.pizzaLength;
    }
    public int getPizzaDiameter() {
        return this.pizzaDiameter;
    }
    public double getPizzaArea(int pizzaLength, int pizzaWidth) {
        return (1.0 * pizzaLength) * pizzaWidth;
    }
    public double getPizzaArea(int pizzaDiameter) {
        double radius = (1.0 * pizzaDiameter)/2;
        return ((1.0 * radius) * radius) * Math.PI;
    }
    

}
