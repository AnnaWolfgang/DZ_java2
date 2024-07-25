import java.util.Scanner;

public class PhoneBookView {
    private PhoneBook phoneBook;
    private Scanner scanner;

    public PhoneBookView(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Phone Book Application");
        System.out.println("1. Add Contact");
        System.out.println("2. Delete Contact");
        System.out.println("3. Display All Contacts");
        System.out.println("4. Clear Phone Book");
        System.out.println("5. Exit");
    }

    public void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        phoneBook.put(name, phoneNumber);
        System.out.println("Contact added.");
    }

    public void deleteContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        phoneBook.delContact(name);
        System.out.println("Contact deleted.");
    }

    public void displayAllContacts() {
        if (phoneBook.empty()) {
            System.out.println("The phone book is empty.");
        } else {
            for (User user : phoneBook.getAll()) {
                System.out.println(user);
            }
        }
    }

    public void clearPhoneBook() {
        phoneBook.clear();
        System.out.println("Phone book cleared.");
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addContact();
                case 2 -> deleteContact();
                case 3 -> displayAllContacts();
                case 4 -> clearPhoneBook();
                case 5 -> {
                    System.out.println("Exiting.");
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}