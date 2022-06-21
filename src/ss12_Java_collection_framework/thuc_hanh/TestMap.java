package ss12_Java_collection_framework.thuc_hanh;
import java.util.*;
import java.util.Map.Entry;

public class TestMap {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Map<String, Integer> words = new TreeMap<>();
            System.out.println("Enter String: ");
            String string = scanner.nextLine();
            string = string.trim().toLowerCase();
            String[] array = string.split(" ");
            for (String s : array) {
                if (!s.equals("")) {
                    if (words.containsKey(s)) {
                        words.put(s, words.get(s) + 1);
                    } else {
                        words.put(s, 1);
                    }
                }
            }

            Set<String> keyList = words.keySet();
            for (String s : keyList) {
                System.out.println(s + ": " + words.get(s));
            }
        }
    }