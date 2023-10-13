public class Bookkeeper extends Human {
    private String bookkeeper;

    public String getBookkeeper() {
        return bookkeeper;
    }

    public void setBookkeeper(String bookkeeper) {
        this.bookkeeper = bookkeeper;
    }

    public Bookkeeper(String lastName, String firstName, int age, String bookkeeper) {
        super(lastName, firstName, age);
        setBookkeeper(bookkeeper);
        System.out.println("BConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public Bookkeeper(Human other, String bookkeeper) {
        super(other);
        setBookkeeper(bookkeeper);
        System.out.println("BCopyConstructor:\t" + Integer.toHexString(hashCode()));
    }

    @Override
    public String toString() {
        return super.toString() + " " + bookkeeper;
    }
}
