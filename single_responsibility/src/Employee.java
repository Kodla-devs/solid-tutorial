public class Employee {
    private String name;
    private int totalHoursWorked;

    public Employee(String name, int totalHoursWorked) {
        this.name = name;
        this.totalHoursWorked = totalHoursWorked;
    }

    public double calculatePay() {
        int regular = regularHours();
        return regular * 20;
    }

    public void reportHours() {
        int regular = regularHours();
        System.out.println(name + " worked " + regular + " regular hours.");
    }

    public void saveToDatabase() {
        System.out.println("Saving " + name + " to database...");
    }

    private int regularHours() {
        int total;
        if (totalHoursWorked > 8) {
            total = ((totalHoursWorked - 8) * 2) + totalHoursWorked;
        } else {
            total = totalHoursWorked;
        }
        return total;
    }
}
