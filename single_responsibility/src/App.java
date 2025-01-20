public class App {
    public static void main(String[] args) throws Exception {
        EmployeeData employeeData = new EmployeeData("Alice", 9);

        EmployeeFacade facade = new EmployeeFacade();

        double pay = facade.calculatePay(employeeData);
        System.out.println("calculated pay: " + pay);

        facade.reportHours(employeeData);
        facade.saveEmployee(employeeData);
    }
}
