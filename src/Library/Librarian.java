package Library;

public class Librarian extends User{

    private String employeeNumber;

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    Librarian(String employeeNumber){
        super();
        setEmployeeNumber(employeeNumber);
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard :" +getEmployeeNumber());
    }

    @Override
    public void canBorrowBooks() {
        System.out.println("");
    }
}
