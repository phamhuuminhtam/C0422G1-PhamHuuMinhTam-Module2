package service.implement;

import model.facility.Facility;
import service.FacilityService;
import service.MaintenanceService;
import ultility.ReadAndWrite;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MaintenanceServiceImpl implements MaintenanceService {

    @Override
    public void display() {
        add();
        Map<Facility, Integer> facilityIntegerMap = ReadAndWrite.readFacilityToCSV("src/data/MaintenanceCSV.csv");
        Set<Facility> facilitySet = facilityIntegerMap.keySet();
        for (Facility f : facilitySet) {
            System.out.println(f +" có số lần sử dụng là : " + facilityIntegerMap.get(f));
        }
    }



    @Override
    public void add() {
        Map<Facility, Integer> facilityIntegerMap = ReadAndWrite.readFacilityToCSV("src/data/FacilityCSV.csv");
        Map<Facility, Integer> facilityMaintenance = new LinkedHashMap<>();
        Set<Facility> facilitySet = facilityIntegerMap.keySet();
        for (Facility f : facilitySet) {
            if (facilityIntegerMap.get(f) >= 5) {

                facilityMaintenance.put(f, facilityIntegerMap.get(f));
            }
        }
        ReadAndWrite.writeFacilityToCSV(facilityMaintenance, "src/data/MaintenanceCSV.csv", false);
    }

    @Override
    public void edit() {
            Map<Facility,Integer> facilityIntegerMap  = ReadAndWrite.readFacilityToCSV("src/data/FacilityCSV.csv");
            Set<Facility> facilitySet = facilityIntegerMap.keySet();
            if (facilitySet.isEmpty()){
                System.out.println("Danh sách đang trống");
            }else {
                for(Facility f: facilitySet){
                    facilityIntegerMap.replace(f,0);
                }
                System.out.println("Đã bảo trì xong tất cả");
            }
        Map<Facility, Integer> facilityMaintenance = new LinkedHashMap<>();
        ReadAndWrite.writeFacilityToCSV(facilityMaintenance, "src/data/MaintenanceCSV.csv", false);

    }
}
