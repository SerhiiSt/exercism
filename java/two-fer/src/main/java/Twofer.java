public class Twofer {
    public String twofer(String name) {
        return "One for " + (name == null ? "you," : name.isEmpty() ? "," : name + ",") + " one for me.";
    }
}
