package com.anthony;
import java.util.*;

public class Main {
    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);
    public static void main(String[] args) {

//        // ArrayList - Data type
//        // Add "pointy brackets" to set a type for a generic type to an array list
//        ArrayList<String> cities = new ArrayList<String>();
//        // Add to end of array
//        cities.add("Minneapolis");
//        cities.add("St. Paul");
//        cities.add("Richfield");
//        System.out.println(cities);
//        // Add by position
//        cities.add(2, "Bloomington");
//        cities.add(0, "Woodburry");
//        System.out.println(cities);
//        // Remove by position or object value?
//        cities.remove(2);
//        cities.remove("Woodburry");
//        System.out.println(cities);
//        // Does not require cast to for each object value in the array because of "pointy brackets"
//        for (int i = 0; i < cities.size(); i++) {
//            String stringCities = cities.get(i);
//            System.out.println(stringCities);
//        }


//        /*
//        Please create a new ArrayList of Strings called myClasses
//        Add the names of the courses you are taking this semester
//        Remove "Java Programming"
//        Check if the ArrayList is empty
//        Use a for each loop to print out the names of all of your classes
//        Add some extra course names to test the code
//
//         */
//        ArrayList<String> myClasses = new ArrayList<String>();
//        myClasses.add("Intercultural Communication");
//        myClasses.add("College Composition");
//        myClasses.add("Java Programming");
//        myClasses.add("Supervised Activity Programs");
//        System.out.println(myClasses);
//        myClasses.remove("Java Programming");
//        System.out.println(myClasses);
//        if (myClasses.isEmpty()){
//            System.out.println("Your schedule is empty.");
//        } else {
//            System.out.println("You have " + myClasses.size() + " classes");
//        }
//        for (String mClass:myClasses) {
//            System.out.println(mClass);
//        }


//        /*
//        Calculate the total cost of all of your textbooks this semester
//        Use a loop to ask for the price of each textbook. Store each price in an ArrayList of Doubles.
//        Once all the data has been entered, calculate the total, and average price of all textbooks
//
//         */
//        ArrayList<Double> priceList = new ArrayList<Double>();
//        // Get textbook amount
//        System.out.println("How many textbooks do you have? ");
//        int textbookNum = numberScanner.nextInt();
//        // Iterate over each textbook the user has
//        for (int i = 0; i < textbookNum; i++) {
//            System.out.println("What is the cost of textbook " + (i + 1) + "?");
//            double price = numberScanner.nextDouble();
//            priceList.add(price);
//        }
//        // Create variable to total the price of the books
//        double totalPrice = 0;
//        // Loop over each price in the list
//        for (Double price:priceList) {
//            totalPrice += price;
//        }
//        // Print output
//        System.out.println("The total price of your textbooks is: " + totalPrice);
//        System.out.println("The average price of your textbooks is: " + totalPrice/textbookNum);


//        /* Linked list stuff */
//        LinkedList<String> listOfNames= new LinkedList<String>();
//        listOfNames.add("Tony");
//        listOfNames.addFirst("John");
//        listOfNames.addLast("Sam");
//        listOfNames.addLast("Jim");
//        for (int i = 0; i < listOfNames.size(); i++) {
//            System.out.println("Name " + i + " " + listOfNames.peek());
//            listOfNames.removeFirst();
//        }
//        // Close scanners
//        numberScanner.close();


        // HashMap stuff
        // Create hashMap
        HashMap<String, Double> snowfall = new HashMap<String, Double>();
        // Adding data
        snowfall.put("January", 6.0);
        snowfall.put("February", 6.2);
        snowfall.put("March", 4.0);
        snowfall.put("April", 0.0);
//        // Reading values using the (key, values)
//        System.out.println("Snowfall for January is: " + snowfall.get("January") + " inches.");
        // Iterating over a HashMap
        for (Object ob:snowfall.keySet()){
            System.out.println("For month " + ob + " there was " + snowfall.get(ob) + " inch(es) of snowfall");
        }
        System.out.println("**In this instance it's fine that it is not in order.**");
        // Get user input to change or add a month to the HashMap
        System.out.print("Enter a month you would like to enter a snowfall amount for: ");
        String month = stringScanner.nextLine();
        System.out.print("Enter the snowfall for that month: ");
        double snowfallAmount = numberScanner.nextDouble();
        int totalMonths = snowfall.size();
        double totalSnow = 0;
        if (snowfall.containsKey(month)){
            System.out.println("Data is already in HashMap value is: " + snowfall.get(month));
            System.out.println("Would you like to replace the information? ");
            String ask = stringScanner.nextLine();
            if (ask.equalsIgnoreCase("y") || ask.equalsIgnoreCase("yes")){
                System.out.println("Replacing data...");
                snowfall.put(month, snowfallAmount);
            }
        } else {
            snowfall.put(month, snowfallAmount);
        }
        snowfall.put(month, snowfallAmount);
        for (Object ob:snowfall.keySet()){
            totalSnow += snowfall.get(ob);
            System.out.println("For month " + ob + " there was " + snowfall.get(ob) + " inch(es)");
        }
        System.out.println("The total amount of snow for " + totalMonths + " months is: " + totalSnow);
    }

}
