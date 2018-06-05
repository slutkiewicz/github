package services;

import java.util.Scanner;

public class Client {
    private String surname;
    private String street;
    private String zipCode;
    private String phoneNumber;
    private Boolean delivery;
    Scanner scanner = new Scanner(System.in).useDelimiter(" *");

    public Client() {
    }

    public Client(String surname, String phoneNumber, Boolean delivery) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.delivery = delivery;
    }

    public Client(String surname, String street, String zipCode, String phoneNumber, Boolean delivery) {
        this.surname = surname;
        this.street = street;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.delivery = delivery;
    }

    public Client getClientInfo(){
        scanner.reset();
        scanner.useDelimiter(" *");
        System.out.println("PLEASE ENTER YOU SURNAME");
        surname=scanner.nextLine();

        System.out.println("PLEASE ENTER YOUr PHONE NUMBER?");
        phoneNumber=scanner.nextLine();

        System.out.println("Do YOU WANT TO DELIVER IT TO YOUR HOUSE?");
        System.out.println("1. YES");
        System.out.println("ANY NUMBER FOR NO");
        while (!scanner.hasNextInt()) {
            System.out.print("It has to be a number! Type number from menu: ");
            scanner.next();
        }
        if(scanner.nextInt()==1){
            scanner.nextLine();
            delivery= true;
            System.out.println("PLEASE ENTER YOU STREET NAME");
            street=scanner.nextLine();

            System.out.println("PLEASE ENTER YOU ZIP CODE");
            zipCode=scanner.nextLine();
            return new Client(surname,street,zipCode,phoneNumber,delivery);
        }
        else{
            delivery= false;
            return new Client(surname,phoneNumber,delivery);
        }
    }

    public String getSurname() {
        return surname;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Boolean getDelivery() {
        return delivery;
    }

}
