package employee;

/**
 *
 * @author rck20
 */
public class HourlyPlusCommissionEmployee extends HourlyEmployee {

    private float commission;

    public HourlyPlusCommissionEmployee(String name, float wage, int hours, float commission) {
        super(name, wage, hours);
        this.commission = commission;
    }
    
    @Override
    public float calculatePay() {
        return (this.wage * this.hours) + commission;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }
    
    
}
