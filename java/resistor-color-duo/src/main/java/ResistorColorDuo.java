import java.util.HashMap;
import java.util.Map;

class ResistorColorDuo {
    int value(String[] colors) {
        Map<String, Integer> map = new HashMap<>();
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);

        return Integer.parseInt(String.valueOf(map.get(colors[0])) + map.get(colors[1]));
    }

}
