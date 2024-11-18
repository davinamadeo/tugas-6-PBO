
import java.util.Random;
import java.util.HashMap;

public class responder {
    private Random answerNum;
    private String[] answers;
    private HashMap<String, Integer> keywords;
    private int lastAnswer = -1;  

    public responder() {
        answerNum = new Random();
        initializeAnswers();
        initializeKeywordList();
    }

    public String generateResponse(String input) {
        int responseIndex = -1;
        boolean match = false;

        String[] splitInput = input.split("\\W+");  

        for (String word : splitInput) {
            if (keywords.containsKey(word.toLowerCase())) {
                match = true;
                responseIndex = keywords.get(word.toLowerCase());
                break;
            }
        }

        if (!match) {
            do {
                responseIndex = answerNum.nextInt(answers.length);
            } while (responseIndex == lastAnswer);
        }

        lastAnswer = responseIndex;  
        return answers[responseIndex];
    }

    private void initializeAnswers() {
        answers = new String[]{
            "Did you ask google?",
            "Did you turn it off and on?",
            "Keep talking, I'll get myself a coffee.",
            "Oh my gosh...",
            "42",
            "I have no clue.",
            "Have a break, have a KitKat.",
            "Wenn's mal wieder länger dauert...",
            "Loading 31%",
            "Talk to the hand.",
            "Java, Java, Java!",
            "Computer, Rechner, Ordenador",
            "Apple, apple, apple...",
            "Microsoft, Winzigweich, pico fofo",
            "The answer to life, the universe and everything is 42",
            "Mac, mac, mack, muck, mick...",
            "Aaahhh... we're all gonna die...",
            "This might take a little while.",
            "Printing is not good for the environment.",
            "Which distribution?",
            "Did you try rooting it?"
        };
    }

    private void initializeKeywordList() {
        keywords = new HashMap<>();
        keywords.put("java", 10);
        keywords.put("computer", 11);
        keywords.put("ios", 12);
        keywords.put("windows", 13);
        keywords.put("life", 14);
        keywords.put("mac", 15);
        keywords.put("crashed", 16);
        keywords.put("loading", 17);
        keywords.put("print", 18);
        keywords.put("linux", 19);
        keywords.put("android", 20);
        keywords.put("problem", 2);
    }
}
