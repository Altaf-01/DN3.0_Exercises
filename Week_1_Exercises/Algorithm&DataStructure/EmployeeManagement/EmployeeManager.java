public class EmployeeManager {
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add employee
    public void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size++] = employee;
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    // Search employee by ID
    public Employee searchEmployeeById(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null; // Not found
    }

    // Traverse all employees
    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete employee by ID
    public void deleteEmployeeById(String employeeId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[--size] = null; // Clear the last element
        } else {
            System.out.println("Employee not found.");
        }
    }
}
