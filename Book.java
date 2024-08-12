public class Book {

    private String authorName;
    private String  titleName;
    private String borrowedBy;
    private boolean isBorrowed;

    public Book(String authorName, String titleName, String borrowedBy, boolean isBorrowed){
        this.authorName = authorName;
        this.titleName = titleName;
        this.borrowedBy = null;
        this.isBorrowed = false;
    }

    public void Borrow(String Borrower){
        if(!isBorrowed){
            isBorrowed = true;
            borrowedBy = Borrower;
            System.out.println("The Book " + titleName + " Written by " +  authorName + " is Borrowed by " + borrowedBy);
        }
        else{
            System.out.println("This is borrowed by someone!!! :(");
        }
    }

    public void returnBook(){
        if(isBorrowed){
            isBorrowed = false;
            borrowedBy = null;
            System.out.println("This Book is Returned");
        }
        else{
            System.out.println("Something Wrong in the Book");
        }
    }

    public String AuthorName(){
        return authorName;
    }

    public String TitleName(){
        return titleName;
    }

    public String BorrowedBy(){
        return borrowedBy;
    }

    public boolean isBorrowed(){
        return isBorrowed;
    }

    public static void main(String[] args) {
        
    }
    
}
