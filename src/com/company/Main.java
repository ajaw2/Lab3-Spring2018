public class Main {
    public static void main(String[] args) {
        System.out.println(WebScraper.urlToString ("http://erdani.com/tdpl/hamlet.txt"));
        System.out.println(WebScraper.wordFinder("http://erdani.com/tdpl/hamlet.txt", "http://erdani.com/tdpl/hamlet.txt"));
    }
}