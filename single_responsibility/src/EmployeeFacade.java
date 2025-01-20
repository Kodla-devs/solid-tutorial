public class EmployeeFacade {
    private PayrollCalculator payrollCalculator = new PayrollCalculator();
    private HoursReporter hoursReporter = new HoursReporter();
    private EmployeeDatabase employeeDatabase = new EmployeeDatabase();

    public double calculatePay(EmployeeData employeeData) {
        return payrollCalculator.calculatePay(employeeData);
    }

    public void reportHours(EmployeeData employeeData) {
        hoursReporter.reportHours(employeeData);
    }

    public void saveEmployee(EmployeeData employeeData) {
        employeeDatabase.save(employeeData);
    }
}
