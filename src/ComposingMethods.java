public class ComposingMethods {

    //1. Extract Method

    void printOwing() {
        printBanner();
        printDetails(getOutstanding());
    }

    void printDetails(double outstanding) {
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

}
