package ss16_io_test_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    public static List<String> readCsvFile(String pathFile) throws FileNotFoundException {
        List<String> list = new ArrayList<>();
        File file = new File(pathFile);
        BufferedReader br = null;
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        try {
            FileReader fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
            String line = "";
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {
        try {
            List<String> list = readCsvFile("src/ss16_io_test_file/bai_tap/nation.csv");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i+1) +". "+ (list.get(i).split(","))[2]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}


