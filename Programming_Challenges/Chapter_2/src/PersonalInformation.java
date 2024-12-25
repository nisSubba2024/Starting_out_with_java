public class PersonalInformation {
    /*
    Programming Challenges
    Chapter 2, Question 3: Personal Information
    Date: 12/25/24

    Write a program that displays the following information, each on a
    separate line:

        Your name
        Your address, with city, state, and ZIP
        Your telephone number
        Your college major

    Although these items should be displayed on separate output lines, use
    only a single println statement in your program.
     */

    public static void main(String[] args) {
        String name = "Matt Smith";
        String address = "140 Real St, Fake City, 24516";
        String phoneNumber = "451-513-5415";
        String major = "Information Systems";

        System.out.println("Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nMajor: " + major);
    }
}
