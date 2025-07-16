import java.util.*;

public class test {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); // Duplicate - ignored
        set.add("abjeet");
        set.add(null);   // Allowed once

        System.out.println(set); // Output might be: [null, Java, Python]
    }
}
