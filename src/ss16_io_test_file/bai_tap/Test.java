package ss16_io_test_file.bai_tap;

import java.io.FileNotFoundException;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        try {
            List<String> list = ReadCSV.readCsvFile("src/ss16_io_test_file/bai_tap/nation.csv");
            for (int i = 0; i < list.size(); i++) {
                Nations nations = new Nations(Integer.parseInt((list.get(i).split(","))[0]),(list.get(i).split(","))[1],(list.get(i).split(","))[2]);
                System.out.println(nations);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
