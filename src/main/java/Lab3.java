import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class Lab3 {

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }


    /**
     * This method counts the total numbers of words that are in the URL provided
     */
    public static void wordCount(String url) {
      //String s = urlToString(url);
      String[] split = url.split(" ");
      System.out.println(split.length);
    }

    /**
     * This method finds a certain word that is defined by the user and counts how many times it is used in the URL
     */
    public static int findCertainWord(String url, String a){
        String[] split = url.split(" ");
        int count = 0;
        for (int i = 0; i < split.length; i++){
            if(split[i].equals(a)){
                count ++;
            }
        }
        return count;

    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String test = urlToString("http://erdani.com/tdpl/hamlet.txt");
        System.out.println(test);
        wordCount(test);
        System.out.println(findCertainWord(test,"Prince"));
    }

}
