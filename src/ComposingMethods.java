import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ComposingMethods {

    // 1. Extract Method
    void printOwing() {
        printBanner();
        printDetails(getOutstanding());
    }

    void printDetails(double outstanding) {
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    // 2. Inline Method
    class PizzaDelivery {
        //...
        int getRating() {
            return numberOfLatedeliveries > 5 ? 2 : 1;
        }
    }

    // 3. Extract Variable
    void renderBanner() {
        final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
        final boolean isIE = browser.toUpperCase().indexOf("IE") > -1;
        final boolean wasResized = resize > 0;

        if (isMacOs && isIE && wasInitialized() && wasResized) {
            //...
        }
    }

    // 4. Inline Temp
    boolean hasDiscount(Order order) {
        return order.basePrice() > 1000;
    }

    // 5. Replace Temp with Query (ndion: Replace Temp with Method)
    double calculateTotal() {
        if (basePrice() > 1000) {
            return basePrice() * 0.95;
        }
        else {
            return basePrice() * 0.98;
        }
    }
    double basePrice() {
        return quantity * itemPrice;
    }

    // 6. Split Temp Variable
    final double perimeter = 2 * (height + width);
    System.out.println(perimeter);
    final double area = height * width;
    System.out.println(area);

    // 7. Remove Assignments to Parameters
    int discount(int inputVal, int quantity) {
        int result = inputVal;
        if (quantity > 50) {
            result -= 2;
        }
        //...
    }

    // 8. Replace Method with Method Object (ndion: Replace large Method with Class of smaller methods)
    class Order {
        public double price() {
            return new PriceCalculator(this).compute();
        }
    }

    class PriceCalculator {
        private double primaryBasePrice;
        private double secondaryBasePrice;
        private double tertiaryBasePrice;

        public PriceCalculator(Order order) {
            //...
        }

        public double compute() {
            //...
        }
    }

    // 9. Substitute Algorithm
    String foundPerson(String[] people) {
        List candidates = Arrays.asList(new String[] {"Ndion", "John", "Doe"});
        for (int i = 0; i < people.length; i++) {
            if (candidates.contains(people[i]))
                return people[i];
        }
        return "";
    }

}
