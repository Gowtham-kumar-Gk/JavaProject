import java.util.*;
public class Hangama
{
    public static String getRandomWord(List<String> wordList)
    {
        if(wordList == null || wordList.isEmpty())
        {
            return null;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(wordList.size());
        return wordList.get(randomIndex);

    }
    public static String[] stages = {
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n       |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n========="
    };

    public static String logo = " \n _                                             \n" +
                                   "| |                                            \n" +
                                   "| |__    _ _     _ _  ___    _ _   \n" +
                                   "| '    / _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\ \n" +
                                   "| | | | ( _| | | | | (_| | | | | | | (_| | | | |\n" +
                                   "|_| |_|  _|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|\n" +
                                   "                    __/ |                      \n" +
                                   "                   |___/                       ";
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String[] words = {"abruptly",
                "absurd",
                "abyss",
                "affix",
                "askew",
                "avenue",
                "awkward",
                "axiom",
                "azure",
                "bagpipes",
                "bandwagon",
                "banjo",
                "bayou",
                "beekeeper",
                "bikini",
                "blitz",
                "blizzard",
                "boggle",
                "bookworm",
                "boxcar",
                "boxful",
                "buckaroo",
                "buffalo",
                "buffoon",
                "buxom",
                "buzzard",
                "buzzing",
                "buzzwords",
                "caliph",
                "cobweb",
                "cockiness",
                "croquet",
                "crypt",
                "curacao",
                "cycle",
                "daiquiri",
                "dirndl",
                "disavow",
                "dizzying",
                "duplex",
                "dwarves",
                "embezzle",
                "equip",
                "espionage",
                "euouae",
                "exodus",
                "faking",
                "fishhook",
                "fixable",
                "fjord",
                "flapjack",
                "flopping",
                "fluffiness",
                "flyby",
                "foxglove",
                "frazzled",
                "frizzled",
                "fuchsia",
                "funny",
                "gabby",
                "galaxy",
                "galvanize",
                "gazebo",
                "giaour",
                "gizmo",
                "glowworm",
                "glyph",
                "gnarly",
                "gnostic",
                "gossip",
                "grogginess",
                "haiku",
                "haphazard",
                "hyphen",
                "iatrogenic",
                "icebox",
                "injury",
                "ivory",
                "ivy",
                "jackpot",
                "jaundice",
                "jawbreaker",
                "jaywalk",
                "jazziest",
                "jazzy",
                "jelly",
                "jigsaw",
                "jinx",
                "jiujitsu",
                "jockey",
                "jogging",
                "joking",
                "jovial",
                "joyful",
                "juicy",
                "jukebox",
                "jumbo",
                "kayak",
                "kazoo",
                "keyhole",
                "khaki",
                "kilobyte",
                "kiosk",
                "kitsch",
                "kiwifruit",
                "klutz",
                "knapsack",
                "larynx",
                "lengths",
                "lucky",
                "luxury",
                "lymph",
                "marquis",
                "matrix",
                "megahertz",
                "microwave",
                "mnemonic",
                "mystify",
                "naphtha",
                "nightclub",
                "nowadays",
                "numbskull",
                "nymph",
                "onyx",
                "ovary",
                "oxidize",
                "oxygen",
                "pajama",
                "peekaboo",
                "phlegm",
                "pixel",
                "pizazz",
                "pneumonia",
                "polka",
                "pshaw",
                "psyche",
                "puppy",
                "puzzling",
                "quartz",
                "queue",
                "quips",
                "quixotic",
                "quiz",
                "quizzes",
                "quorum",
                "razzmatazz",
                "rhubarb",
                "rhythm",
                "rickshaw",
                "schnapps",
                "scratch",
                "shiv",
                "snazzy",
                "sphinx",
                "spritz",
                "squawk",
                "staff",
                "strength",
                "strengths",
                "stretch",
                "stronghold",
                "stymied",
                "subway",
                "swivel",
                "syndrome",
                "thriftless",
                "thumbscrew",
                "topaz",
                "transcript",
                "transgress",
                "transplant",
                "triphthong",
                "twelfth",
                "twelfths",
                "unknown",
                "unworthy",
                "unzip",
                "uptown",
                "vaporize",
                "vixen",
                "vodka",
                "voodoo",
                "vortex",
                "voyeurism",
                "walkway",
                "waltz",
                "wave",
                "wavy",
                "waxy",
                "wellspring",
                "wheezy",
                "whiskey",
                "whizzing",
                "whomever",
                "wimpy",
                "witchcraft",
                "wizard",
                "woozy",
                "wristwatch",
                "wyvern",
                "xylophone",
                "yachtsman",
                "yippee",
                "yoked",
                "youthful",
                "yummy",
                "zephyr",
                "zigzag",
                "zigzagging",
                "zilch",
                "zipper",
                "zodiac",
                "zombie"};
        System.out.println(logo);
        System.out.println();
        System.out.println();
        System.out.println("Guess a word of this size :");

        List<String> wordList = Arrays.asList(words);
        String randomWord = getRandomWord(wordList);
        int index = 0;
        int chances = 7;
        String c = "";
        int n = randomWord.length();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = "_";
        }
        while(chances > 0)
        {
            for(int i = 0; i < n; i++)
            {
                System.out.print(arr[i]);
            }
            System.out.println();
            System.out.println("Guess a letter : ");
            c = sc.next();
            if(randomWord.contains(c))
            {
                arr[randomWord.indexOf(c)] = c;
                for(int i = 0; i < n; i++)
                {
                    System.out.print(arr[i]);
                }
            }
            else
            {

                System.out.println("Oops! You have choosen wrong letter ");
                System.out.println(stages[index]);
                index++;
                chances--;
            }
        }
        if(randomWord.equals(arr.toString()))
        {
            System.out.println("Hurrayy! you have won the Game");
            System.out.println(randomWord);
        }
        else
        {
            System.out.println("Sorry! You have lost the game play again");
            System.out.println(randomWord);
        }
    }
}
