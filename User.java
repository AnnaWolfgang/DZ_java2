import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<String> phoneNumbers;

    public User(String name) {
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    @Override
    public String toString() {
        return name + ": " + String.join(", ", phoneNumbers);
    }
}
