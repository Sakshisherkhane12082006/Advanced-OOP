package ExperimentNo5;

public class LibraryDemo {
    public static void main(String[] args) {

        Book b1 = new Book("Java Programming", "James Gosling", "12345");
        Member m1 = new Member("Sakshi", 101);

        System.out.println("---- Book Details ----");
        b1.displayBook();

        System.out.println("\n---- Member Details ----");
        m1.displayMember();
    }
}

