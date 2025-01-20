public class PayrollCalculator {
    public double calculatePay(EmployeeData employeeData) {
        int regularHours = calculateRegularHours(employeeData);
        return regularHours * 20;
    }

    private int calculateRegularHours(EmployeeData employeeData) {
        int totalHours = employeeData.getTotalHoursWorked();
        int editedHours;
        if (totalHours > 8) {
            editedHours = ((totalHours - 8) * 2) + 8;
            
        } else {
            editedHours = totalHours;
        }
        return editedHours;
    }
    
}
