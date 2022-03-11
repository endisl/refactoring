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
}
