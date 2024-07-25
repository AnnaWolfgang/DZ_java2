public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        PhoneBookView view = new PhoneBookView(phoneBook);
        view.run();
    }
}