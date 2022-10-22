package customer.models;

public class Customer {
    private int identityCard;
    private String name;
    private String phoneNumber;
    private String email;

    public Customer() {
    }

    public Customer(int identityCard, String name, String phoneNumber, String email) {
        this.identityCard = identityCard;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
