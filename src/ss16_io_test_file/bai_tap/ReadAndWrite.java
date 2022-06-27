package ss16_io_test_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readFile(String pathFile) throws FileNotFoundException {
        List<String> list = new ArrayList<>();
        File file = new File(pathFile);
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void writeFile(String targetPathFile,List<String> list){
        File file = new File(targetPathFile);
        if (file.exists()){
            System.err.println("file đã có");
        }
        try {
            FileWriter fileWriter = new FileWriter(targetPathFile, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size() ; i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void copyFile(String sourceFile, String targetFile){
        List<String> list=null;
        try {
            list =readFile(sourceFile);
            writeFile(targetFile,list);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try {
            List<String> list = readFile("src/ss16_io_test_file/bai_tap/SourceFile.txt");
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                count+=list.get(i).length();
            }
            System.out.println("số ký tự trong file là " + (count + list.size()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        copyFile("src/ss16_io_test_file/bai_tap/SourceFile.txt","src/ss16_io_test_file/bai_tap/TargetFile.txt");

    }
}
