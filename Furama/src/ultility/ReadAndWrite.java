package ultility;

import model.person.Customer;
import model.person.Employee;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readObjectToCSV(String pathFile) {
        List<String> list = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(pathFile));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void writeObjectToCSV(List<String> list, String pathFile,boolean append) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(pathFile,append));
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Customer> readCustomerToCSV(String pathFile) {
        List<Customer> customers = new ArrayList<>();
        List<String> list = readObjectToCSV(pathFile);
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            customers.add(new Customer(arr[0], arr[1], LocalDate.parse(arr[2]), arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]));
        }
        return customers;
    }

public static List<Employee> readEmployeeToCSV(String pathFile) {
        List<Employee> employeeList = new ArrayList<>();
        List<String> list = readObjectToCSV(pathFile);
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            employeeList.add(new Employee(arr[0], arr[1], LocalDate.parse(arr[2]), arr[3], arr[4], arr[5], arr[6], arr[7], arr[8],Double.parseDouble(arr[9])));
        }
        return employeeList;
    }

    public static void writeCustomerToCSV(List<Customer> customers, String pathFile,boolean append) {
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < customers.size(); i++) {
            list1.add(customers.get(i).getInfoToCSV());
        }
        writeObjectToCSV(list1,pathFile,append);
    }
    public static void writeEmployeeToCSV(List<Employee> employeeList, String pathFile, boolean append) {
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            list1.add(employeeList.get(i).getInfoToCSV());
        }
        writeObjectToCSV(list1,pathFile,append);
    }
}
