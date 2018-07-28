package Challenge;

import java.util.ArrayList;

public class Contacts {

    private ArrayList<String> nameList = new ArrayList<String>();

    public void printContactList() {
        int x = nameList.size() / 2;
        System.out.println("You have " + x + " items in the list\n");
        if (x > 0) {
            System.out.print("Name\tNumber");

            for (String list : nameList) {
                int i = nameList.indexOf(list);
                if (i % 2 == 0) {
                    System.out.println();
                }
                System.out.print(list + "\t");
            }
            System.out.println();


        }
    }

    public void store(String name, String phoneNumber) {
        boolean flag = nameList.contains(name);
        if (flag == false) {
            nameList.add(name);
            nameList.add(phoneNumber);
        }
    }

    public void modify(String name, String newName, String newPhoneNumber) {
        boolean flag = nameList.contains(name);
        if (flag == true) {
            int i = nameList.indexOf(name);
            String phoneNumber = nameList.get(i + 1);
            int j = nameList.indexOf(phoneNumber);
            nameList.set(i, newName);
            nameList.set(j, newPhoneNumber);
            System.out.println("The contact " + name + " is updated to \nName : " + newName + "\tPhoneNumber : " + newPhoneNumber);
        }
    }

    public void remove(String name) {
        boolean flag = nameList.contains(name);
        int i = nameList.indexOf(name);
        if (flag == true) {
            nameList.remove(name);
            nameList.remove(i);
            System.out.println("Successfully deleted " + name);
        } else
            System.out.println(name + " does not exist");
    }

    public int query(String name) {
        boolean flag = nameList.contains(name);
        if (flag == true) {
            int i = nameList.indexOf(name);
            String phoneNumber = nameList.get(i + 1);
            System.out.println("Found : " + name + " \nPhone number : " + phoneNumber);
        return 1;
        } else
            System.out.println("Contact " + name + " does not exist");
        return 0;
    }
}
