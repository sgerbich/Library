public class LibraryGo {
    public static void main(String[] args) {
        Publisher bookppl = new Publisher("bookppl");
        Author rick = new Author("rick riordan", bookppl);
        Book yeet = new Book("percy jackson", rick, "rio", 17, "fiction");
        yeet.toString();
        System.out.println(yeet);
    }
}