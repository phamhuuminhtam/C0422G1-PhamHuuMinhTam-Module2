package ss17_binaryfile_serialization.bai_tap.copyfilebinary;

import java.io.*;

public class Copy2 implements Serializable {
    public static void copyFile(String sourcePatch, String targetPath) {
        FileOutputStream fileOutputStream =null;
        FileInputStream fileInputStream  =null;
        File targetFile = new File(sourcePatch);
        try {
            fileOutputStream = new FileOutputStream(new File(targetPath));
            fileInputStream = new FileInputStream(targetFile);
            int c;
            while ((c = fileInputStream.read()) != -1) {
                fileOutputStream.write(c);
            }
            System.out.println(targetFile.length());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }

    public static void main(String[] args) {
        copyFile("src/ss17_binaryfile_serialization/bai_tap/productmanager/data/productlist.dat", "src/ss17_binaryfile_serialization/bai_tap/copyfilebinary/target.dat");

    }
}
