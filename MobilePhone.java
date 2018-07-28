package Challenge;

import java.util.Scanner;

public class MobilePhone {
    private static Scanner input = new Scanner(System.in);
    private static Contacts contactList = new Contacts();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice : (6 to see the available options)");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    contactList.printContactList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    findItem();
                    break;
                case 6:
                    printInstructions();
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To shutdown.");
        System.out.println("\t 1 - To print list of all contacts.");
        System.out.println("\t 2 - To add a new contact.");
        System.out.println("\t 3 - To modify a contact.");
        System.out.println("\t 4 - To remove a contact.");
        System.out.println("\t 5 - To search for a contact.");
        System.out.println("\t 6 - To print choice of operations.");

    }

    public static void addItem() {
        System.out.println("Enter the contact name");
        String name=input.nextLine();
        System.out.println("Enter the contact number");
        String number=input.nextLine();
        contactList.store(name,number);
    }

    public static void modifyItem() {
        System.out.println("Enter the current name");
        String item = input.nextLine();
        if(contactList.query(item)>0) {
            System.out.println("Enter the new contact name and number");
            String newItem = input.nextLine();
            String newPhone = input.nextLine();
            contactList.modify(item, newItem, newPhone);
        }

    }

    public static void removeItem() {
        System.out.println("Please enter name to be removed");
        String item = input.nextLine();
        contactList.remove(item);
    }

    public static void findItem() {
        System.out.println("Enter name to search for");
        String newItem = input.nextLine();
        contactList.query(newItem);
    }
}
