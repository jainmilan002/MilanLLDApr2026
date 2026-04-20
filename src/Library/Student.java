package Library;

public class Student extends User {

    private int borrowedBooksCount;
    private int MAX_BORROW_LIMIT;

    Student(){

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
