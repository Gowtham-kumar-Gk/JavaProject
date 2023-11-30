import java.util.*;
public class Hangman
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
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(Logo.logo);
        System.out.println();
        System.out.println();
        System.out.println("Guess a word of this size :");

        List<String> wordList = Arrays.asList(WordList.words);
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
            }
            else
            {

                System.out.println("Oops! You have choosen wrong letter ");
                System.out.println(Logo.stages[index]);
                index++;
                chances--;
            }
            if(randomWord.equals(arr.toString()))
            {
                break;
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
