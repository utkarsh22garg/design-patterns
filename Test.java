import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

enum COLORS {
    RED, BLUE, BLACK, GREEN, YELLOW
};

public class Test {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Utkarsh", 100);
        map.put("Manas", 90);
        map.put("Prateek", 89);
        System.out.println(map.get("Utkarsh"));
    }
}
