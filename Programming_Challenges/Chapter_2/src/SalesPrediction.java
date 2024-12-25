public class SalesPrediction {
    /*
    Programming Challenges
    Chapter 2, Question 5: Sales Prediction
    Date: 12/25/24

    The East Coast sales division of a company generates 62 percent of total
    sales. Based on that percentage, write a program that will predict how
    much the East Coast division will generate if the company has $4.6
    million in sales this year. HINT: Use the value 0.62 to represent 62 percent.
     */
    public static void main(String[] args) {
        double totalSalesPercentage = 0.62;
        int sales = 4600000;

        // calculate total sale
        double totalSales = sales * totalSalesPercentage;

        System.out.println("The total sales is " + totalSales);
    }
}
