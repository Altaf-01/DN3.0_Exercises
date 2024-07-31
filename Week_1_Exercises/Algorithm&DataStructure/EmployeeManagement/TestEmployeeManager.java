public class TestEmployeeManager {
    public static void main(String[] args) {
        // Create EmployeeManager with capacity of 5
        EmployeeManager manager = new EmployeeManager(5);

        // Create some Employee instances
        Employee emp1 = new Employee("E001", "John Doe", "Developer", 70000);
        Employee emp2 = new Employee("E002", "Jane Smith", "Manager", 80000);
        Employee emp3 = new Employee("E003", "Alice Brown", "Analyst", 60000);

        // Add employees to the manager
        manager.addEmployee(emp1);
        manager.addEmployee(emp2);
        manager.addEmployee(emp3);

        // Display all employees
        System.out.println("All Employees:");
        manager.traverseEmployees();

        // Search for an employee
        System.out.println("\nSearching for employee with ID E002:");
        Employee found = manager.searchEmployeeById("E002");
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee
        System.out.println("\nDeleting employee with ID E001:");
        manager.deleteEmployeeById("E001");

        // Display all employees after deletion
        System.out.println("\nAll Employees after deletion:");
        manager.traverseEmployees();
    }
}
