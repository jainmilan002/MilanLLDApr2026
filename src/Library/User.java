package Library;

public abstract class User {

    private String userId;
    private String name;
    private String contactInfo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    User(){
        setUserId(generateUniqueId());
    }

    User(String name, String contactInfo){
        setName(name);
        setContactInfo(contactInfo);
    }

    User(User otherUser){
        setUserId(otherUser.getUserId());
        setName(otherUser.getName());
        setContactInfo(otherUser.getContactInfo());
    }

    private String generateUniqueId(){
        return "0";
    }

    public abstract void displayDashboard();
    public abstract void canBorrowBooks();

}
