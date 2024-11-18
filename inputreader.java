import java.util.Scanner;

public class inputreader {
    private Scanner reader;

    public inputreader() {
        reader = new Scanner(System.in);
    }

    public String getInput() {
        System.out.print("> ");  // print prompt
        String inputLine = reader.nextLine();
        return inputLine;
    }
}
