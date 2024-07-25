import java.util.*;

public class PhoneBook {
    private HashMap<String, User> phoneBook;
    private int size;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public void put(String name, String number) {
        User user = phoneBook.get(name);
        if (user == null) {
            user = new User(name);
            phoneBook.put(name, user);
            size++;
        }
        user.addPhoneNumber(number);
    }

    public void delContact(String name) {
        if (phoneBook.remove(name) != null) {
            size--;
        }
    }

    public void clear() {
        phoneBook.clear();
        size = 0;
    }

    public ArrayList<User> getAll() {
        ArrayList<User> users = new ArrayList<>(phoneBook.values());
        users.sort((u1, u2) -> Integer.compare(u2.getPhoneNumbers().size(), u1.getPhoneNumbers().size()));
        return users;
    }
}