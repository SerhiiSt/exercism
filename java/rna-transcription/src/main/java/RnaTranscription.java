import java.util.Map;
import java.util.stream.Collectors;

class RnaTranscription {

    Map<String, String> map = Map.of("G", "C",
                "C", "G",
                "T", "A",
                "A", "U"
    );

    String transcribe(String dnaStrand) {
        return dnaStrand.chars().mapToObj(c -> map.get(Character.toString(c))).collect(Collectors.joining());
    }

}
