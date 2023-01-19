public class Main {
    public static void main(String[] args){
        var u = new URLShortener();
        u.decode(u.encode("https://news.google.co.in"));
    }
}
