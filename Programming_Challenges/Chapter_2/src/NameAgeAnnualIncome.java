public class NameAgeAnnualIncome {
    /*
    Programming Challenges
    Chapter 2, Question 1: Name, Age, and Annual Income
    Date: 12/25/24

    Write a program that declares the following:

        a String variable named name
        an int variable named age
        a double variable named annualPay

    Store your age, name, and desired annual income as literals in these
    variables. The program should display these values on the screen in a
    manner similar to the following:

    My name is Joe Mahoney, my age is 26 and
    I hope to earn $100000.0 per year.
     */

    public static void main(String[] args) {
        String name = "Matt Smith";
        int age = 40;
        double annualPay = 60000.0;

        System.out.println("My name is " + name + ", my age is " + age + " and \nI hope to earn $" + annualPay + " per year.");
    }
}
