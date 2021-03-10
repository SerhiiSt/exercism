class Greeter {

    String getGreeting(String text) {

        return "Hello, "+ (text == null|| text.isEmpty() ? "World": text)+"!";
    }

}
