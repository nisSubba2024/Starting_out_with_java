public class NameInitial {
    /*
    Programming Challenges
    Chapter 2, Question 2: Name and Initials
    Date: 12/25/24

    Write a program that has the following String variables: firstName,
    middleName, and lastName. Initialize these with your first, middle,
    and last names. The program should also have the following char
    variables: firstInitial, middleInitial, and lastInitial.
    Store your first, middle, and last initials in these variables. The program
    should display the contents of these variables on the screen.
     */
    public static void main(String[] args) {
        String firstName = "Matt";
        String middleName = " Elon";
        String lastName = "Smith";

        char firstInitial = 'M';
        char middleInitial = 'E';
        char lastInitial = 'S';

        System.out.println("My name is " + firstName + " " + middleName + " " + lastName + ".");
        System.out.println("My initials is " + firstInitial + middleInitial + lastInitial);


    }

}
