import java.util.*;
import java.util.stream.Collectors;

public class MapValueFilter {
    public static void main(String[] args) {
        Map<Integer,Integer> hmap = new HashMap<>();
        hmap.entrySet().stream().filter(e->e.getValue() > 3).collect(Collectors.toList());
    }
}
