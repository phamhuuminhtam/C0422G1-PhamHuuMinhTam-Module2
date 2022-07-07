package ultility;

import model.Booking;
import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import model.person.Customer;
import model.person.Employee;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class ReadAndWrite {
    private static final String CUSTOMER_PATH_CSV = "src/data/CustomerCSV.csv";

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

    private static void writeObjectToCSV(List<String> list, String pathFile, boolean append) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(pathFile, append));
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
            employeeList.add(new Employee(arr[0], arr[1], LocalDate.parse(arr[2]), arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9])));
        }
        return employeeList;


    }

    public static Map<Facility, Integer> readFacilityToCSV(String pathFile) {
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
        List<String> list = readObjectToCSV(pathFile);
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            if (arr[0].contains("VL")) {
                facilityMap.put(new Villa(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8])), Integer.parseInt(arr[9]));
            } else if (arr[0].contains("HO")) {
                facilityMap.put(new House(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], Integer.parseInt(arr[6]), arr[7]), Integer.parseInt(arr[8]));
            } else
                facilityMap.put(new Room(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6]), Integer.parseInt(arr[7]));
        }
        return facilityMap;
    }

    //(String bookingCode, LocalDate startDay, LocalDate endDay, Customer iD, Facility serviceName)
    public static Set<Booking> readBookingToCSV(String pathFile) {
        Set<Booking> bookings = new TreeSet<>();
        List<String> list = readObjectToCSV(pathFile);
        String[] arr;
        Customer customer = null;
        Facility facility = null;
        for (int i = 0; i < list.size(); i++) {

            arr = list.get(i).split(",");
            for (Customer c : readCustomerToCSV(CUSTOMER_PATH_CSV)) {
                if (c.getID().equals(arr[3])) {
                    customer = c;
                }
            }
            Map<Facility, Integer> facilityIntegerMap = readFacilityToCSV("src/data/FacilityCSV.csv");
            Set<Facility> facilitySet = facilityIntegerMap.keySet();
            for (Facility f : facilitySet) {
                if (f.getServiceName().equalsIgnoreCase(arr[4])) {
                    facility = f;
                }
            }
            bookings.add(new Booking(arr[0], LocalDate.parse(arr[1]), LocalDate.parse(arr[2]), customer, facility));
        }
        return bookings;
    }

    public static void writeFacilityToCSV(Map<Facility, Integer> facilityIntegerMap, String pathFile, boolean append) {
        List<String> list1 = new ArrayList<>();
        Set<Facility> facilitySet = facilityIntegerMap.keySet();
        for (Facility f : facilitySet) {
            list1.add(f.getInfoToCSV() + "," + facilityIntegerMap.get(f));
        }
        writeObjectToCSV(list1, pathFile, append);
    }

    public static void writeCustomerToCSV(List<Customer> customers, String pathFile, boolean append) {
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < customers.size(); i++) {
            list1.add(customers.get(i).getInfoToCSV());
        }
        writeObjectToCSV(list1, pathFile, append);
    }

    public static void writeEmployeeToCSV(List<Employee> employeeList, String pathFile, boolean append) {
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            list1.add(employeeList.get(i).getInfoToCSV());
        }
        writeObjectToCSV(list1, pathFile, append);
    }

    public static void writeBookingToCSV(Set<Booking> bookings, String pathFile, boolean append) {
        List<String> list1 = new ArrayList<>();
        for (Booking b : bookings) {
            list1.add(b.getInfo());
        }
        writeObjectToCSV(list1, pathFile, append);
    }

}
