package Library_Management_system;

public class LibraryManagementSystem {
    public static void main(String[] args) throws InvalidPriceException{
        Book b=new Book("12-3131-31","The Art of Problem Solving in Java",1200);

        b.displayDetails();
        b.borrowBook();
        b.returnBook();

        double p=5000;
        if (p<0) throw new InvalidPriceException("Invalid Price");
        else b.setPrice(p);

        EBook eb=new EBook("444-77-6","The Art of Thinking Clearly",40,55);
        eb.BookInfo();

    }
}
