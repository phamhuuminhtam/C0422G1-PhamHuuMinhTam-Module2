package ultility;

import model.person.Customer;
import model.person.Employee;

import java.util.List;

public class IncreaseID {
    private static final String CSV_PATH_FILE = "src/data/CustomerCSV.csv";
    private static final String EMPLOYEE_CSV_PATH_FILE = "src/data/EmployeeCSV.csv";

    public static int increaseID() {
        List<Customer> list = ReadAndWrite.readCustomerToCSV(CSV_PATH_FILE);
        int id;
        if (list.isEmpty()) id = 1;
        else {
            boolean flag;
            do {
                flag = false;
                id = Integer.parseInt(list.get(list.size() - 1).getID()) + 1;
                for (Customer c : list) {
                    if (Integer.parseInt(c.getID()) == id) {
                        id++;
                        flag = true;
                    }
                }
            } while (flag);
        }
        return id;
    }
    public static int increaseEmployeeID() {
        List<Employee> list = ReadAndWrite.readEmployeeToCSV(EMPLOYEE_CSV_PATH_FILE);
        int id;
        if (list.isEmpty()) id = 1;
        else {
            boolean flag;
            do {
                flag = false;
                id = Integer.parseInt(list.get(list.size() - 1).getID()) + 1;
                for (Employee e : list) {
                    if (Integer.parseInt(e.getID()) == id) {
                        id++;
                        flag = true;
                    }
                }
            } while (flag);
        }
        return id;
    }
}
