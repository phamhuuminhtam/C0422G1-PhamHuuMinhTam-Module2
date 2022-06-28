package ss17_binaryfile_serialization.bai_tap.copyfilebinary;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class Copy {
    private static void copyFileUsingStream(File source, File dest) {
        InputStream is = null;
        OutputStream os = null;
        try {
            try {
                is = new FileInputStream(source);
                os = new FileOutputStream(dest);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            byte[] buffer = new byte[1024];
            int length = 0;
            while (true) {
                try {
                    if (!((length = is.read(buffer)) > 0)) break;
                    os.write(buffer, 0, length);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            try {
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void write(List<String> list, String taretPathFile) {
        File file = new File(taretPathFile);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void main(String[] args) {
        File sourceFile = new File("src/ss17_binaryfile_serialization/bai_tap/copyfilebinary/source.dat");
        File targetFile = new File("src/ss17_binaryfile_serialization/bai_tap/copyfilebinary/target.dat");

       copyFileUsingStream(sourceFile,targetFile);


    }
}
