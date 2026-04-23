package Library;

public class Member extends User {

    private int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT = 5;

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    public void setBorrowedBooksCount(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }

    Member(int borrowedBooksCount ){
        super();
        setBorrowedBooksCount(borrowedBooksCount);
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
    }

    @Override
    public void canBorrowBooks() {
        System.out.println("Books Borrowed: " + borrowedBooksCount);
    }
}
