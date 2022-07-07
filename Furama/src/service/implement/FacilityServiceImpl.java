package service.implement;

import model.facility.Facility;
import service.FacilityService;
import ultility.ReadAndWrite;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    public  static final String FACILITY_PATH_FILE = "src/data/FacilityCSV.csv";
    @Override
    public void display() {
        Map<Facility,Integer> map = ReadAndWrite.readFacilityToCSV(FACILITY_PATH_FILE);
        Set<Facility> facilitySet = map.keySet();
        for (Facility f: facilitySet){
            System.out.println(f.toString() + " có số lần sử dụng " + map.get(f));
        }

    }

    @Override
    public void add() {
        FacilityService villa = new VillaServiceImpl();
        FacilityService room = new RoomServiceImpl();
        FacilityService house = new HouseServiceImpl();
        boolean flag = true;
        do {
            System.out.println("Chọn dịch vụ muốn thêm:" +
                    "\n1.Add New Villa" +
                    "\n2.Add New House" +
                    "\n3.Add New Room" +
                    "\n4.Back to menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    villa.add();
                    break;
                case 2:
                    house.add();
                    break;
                case 3:
                    room.add();
                    break;
                case 4:
                     flag = false;
                    break;

                default:
                    System.out.println("Wrong choice! Choose again please!");
            }
        } while (flag);
    }

    @Override
    public void edit() {

    }
}
