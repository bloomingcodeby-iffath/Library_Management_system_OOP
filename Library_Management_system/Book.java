package Library_Management_system;

public  class Book extends LibraryItem implements Borrowable {
    private String isbn;
    private String title;
    private double price;
    private boolean isBorrowed;
    //Constructor:
    Book(String isbn,String title,double price) {
        setIsbn(isbn);
        setTitle(title);
        setPrice(price);
        this.isBorrowed=true;
    }
    //Setter & Getter
    public void setIsbn(String isbn){
        this.isbn=isbn;
    }
    public String getIsbn(){
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0) System.out.println("Please enter a valid price");//Encapsulation
        else this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void BookInfo(){
        System.out.println("Info of Book");
        System.out.println("ISBN: "+this.isbn);
        System.out.println("Title: "+this.title);
        System.out.println("Price: "+this.price);
    }

    public void BookPrice(){
        System.out.println("Price: "+this.price);
    }
    //Overloading BookPrice method:
    public void BookPrice(String currency){
        System.out.println("Price: "+currency+this.price);
    }


    @Override
    public void borrowBook() {
        if (!isBorrowed) System.out.println("Cannot borrow: book is already borrowed.");
        else  isBorrowed = true;
        System.out.println("Book borrowed successfully.");

    }

    @Override
    public void returnBook() {
        if(!isBorrowed) System.out.println("Can't return: book was not borrowed.");
        else  System.out.println("Book returned");
    }

    @Override
    void displayDetails() {
        System.out.println("---- Book Details ----");
        BookInfo();
        BookPrice();
        System.out.println("Borrowed: "+((isBorrowed)?"NO":"YES"));
        System.out.println("****************************");
    }
}
