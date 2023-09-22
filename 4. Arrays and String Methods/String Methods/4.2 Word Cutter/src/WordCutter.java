public class WordCutter
{
    //code the method cutInHalf that returns the first half of the String passed as argument
    public static String cutInHalf(String word){
        int length = (word.length() / 2);
        String half = word.substring(0, length);
        return half;

    }
}