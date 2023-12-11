package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<String,BookStore> books=new HashMap<>();
    static HashMap<String,UserRegistration> users=new HashMap<>();
    static HashMap<String,OrderProcessing> orders=new HashMap<>();
    public static void listBooks(Scanner in) {
        BookStore book=new BookStore();
        OrderProcessing order=new OrderProcessing();
        System.out.print("Enter the title of the book: ");
        String title=in.next();
        book.setTitle(title);
        order.setSelectedBookName(title);
        System.out.print("Enter the author of the book: ");
        String author=in.next();
        book.setAuthor(author);
        System.out.print("Enter the ISBN of the book: ");
        String ISBN=in.next();
        book.setISBN(ISBN);
        System.out.print("Enter the price of the book: ");
        int price=in.nextInt();
        book.setPrice(price);
        System.out.print("Enter the count of the book: ");
        int count=in.nextInt();
        in.nextLine();
        order.setQuantity(count);
        books.put(title,book);
        orders.put(title,order);
        System.out.println("Book Successfully Added!!");
    }

    public static void listUser(Scanner in) {
        UserRegistration user=new UserRegistration();
        System.out.print("Enter the username of the user: ");
        String username=in.next();
        user.setUsername(username);
        System.out.print("Enter the email of the user: ");
        String email=in.next();
        user.setEmail(email);
        System.out.print("Enter the password of the user: ");
        String password=in.next();
        user.setPassword(password);
        System.out.print("Enter the phone number of the user: ");
        String phone_number=in.next();
        user.setPhoneNumber(phone_number);
        users.put(username,user);
        System.out.println("User successfully added!!");
    }

    public static void placeOrder(Scanner in) {
        System.out.print("Enter the username of the user: ");
        String username=in.next();
        System.out.print("Enter the title of the book he/she want to purchase: ");
        String title=in.next();
        System.out.print("Enter the amount of book you want to purchase: ");
        int quantity=in.nextInt();
        UserRegistration user=users.get(username);
        if(user==null) {
            System.out.println("User not found!!");
            return;
        }
        BookStore book=books.get(title);
        if(book==null) {
            System.out.println("Book not available!!");
            return;
        }
        OrderProcessing order=orders.get(title);
        if(order.orderBook(quantity)) {
            System.out.println("User having details:");
            System.out.printf("Username: %s\n",user.getUsername());
            System.out.printf("Email: %s\n",user.getEmail());
            System.out.printf("Phone Number: %s\n",user.getPhoneNumber());
            System.out.println("Details of book are as follows: ");
            System.out.printf("Title: %s\n",book.getTitle());
            System.out.printf("ISBN: %s\n",book.getISBN());
            System.out.printf("Author: %s\n",book.getAuthor());
            System.out.printf("Price: %d\n",book.getPrice());
            System.out.printf("\nUser can able to purchase the book by paying Rs: %d\n",book.getPrice()*quantity);
            System.out.printf("Remaining Book in the Stock: %d\n",order.getQuantity());
        } else {
            System.out.println("Required book is out of Stock!!");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int choice;
        int more1,more2,more3;
        do {
            System.out.println("Enter the task you want to perform:");
            System.out.println("1. Enter the Book Details.");
            System.out.println("2. Enter the User Details.");
            System.out.println("3. Place Order for an user.");
            System.out.println("4. Exit.");
            choice=in.nextInt();
            switch(choice) {
                case 1:
                    do {
                        listBooks(in);
                        System.out.println("Do you want to add more books: (O for NO/ 1 for YES)");
                        more1=in.nextInt();
                    } while(more1!=0);
                    break;
                case 2:
                    do {
                        listUser(in);
                        System.out.println("Do you want to add more users: (O for NO/ 1 for YES)");
                        more2=in.nextInt();
                    } while(more2!=0);
                    break;
                case 3:
                    do {
                        placeOrder(in);
                        System.out.println("Do you want to place more orders: (O for NO/ 1 for YES)");
                        more3=in.nextInt();
                    } while(more3!=0);
                    break;
                case 4:
                    System.out.println("Thank You!!");
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        } while(choice!=4);

    }
}
