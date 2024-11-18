
public class supportsystem {
    private inputreader reader;
    private responder responder;

    public supportsystem() {
        reader = new inputreader();
        responder = new responder();
    }

    public void start() {
        boolean finished = false;

        printWelcome();

        while (!finished) {
            String input = reader.getInput();

            if (input.toLowerCase().startsWith("bye")) {
                finished = true;
            } else {
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }

        printGoodbye();
    }

    private void printWelcome() {
        System.out.println("Welcome to the KaicenatRizz Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    private void printGoodbye() {
        System.out.println("Nice talking to you. Bye...");
    }
}