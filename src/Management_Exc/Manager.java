package Management_Exc;

public class Manager extends Employee {
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    /**
     * TODO this implementation
     * @param e the employee to be given raise
     * @param raise the raise
     * @throws IllegalArgumentException when raise is negative
     */
    public void giveRaise(Employee e, double raise) throws RuntimeException {
        if (raise < 0) {
            throw new IllegalArgumentException("Invalid increase");
        } else if (this == e) {
            e.setSalary(raise + e.getSalary());
        } else {
            double val = raise + e.getSalary();
            e.setSalary(val);
            this.setSalary(this.getSalary() + val/2);
        }
    }

    @Override
    public String toString() {
        return "Mgr. " +super.toString();
    }
}
