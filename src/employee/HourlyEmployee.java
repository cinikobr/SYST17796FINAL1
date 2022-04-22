package employee;

/**
 *
 * @author rck20
 */
public class HourlyEmployee {

    protected final String name;
    protected float wage;
    protected int hours;

    public HourlyEmployee(String name, float wage, int hours) {
        this.name = name;
        this.wage = wage;
        this.hours = hours;
    }

    public float calculatePay() {
        return this.wage * this.hours;
    }

    public String getName() {
        return name;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

}
