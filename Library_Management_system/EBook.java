package Library_Management_system;

public class EBook extends Book{
    private  int fileSize;
    EBook(String isbn,String title,double price,int  fileSize) throws InvalidPriceException{
        super(isbn, title, price);
        this.fileSize=fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
    //Override BookInfo method:
    public void BookInfo(){
        System.out.println("************************");
        System.out.println("This is an Ebook");
        System.out.println("ISBN: "+this.getIsbn());
        System.out.println("Title: "+this.getTitle());
        System.out.println("Price: "+this.getPrice());
        System.out.println("File Size: "+this.fileSize);
    }


}
