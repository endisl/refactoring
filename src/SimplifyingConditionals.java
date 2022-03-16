public class SimplifyingConditionals {

    // 1. Consolidate Conditional Expression
    double disabilityAmount() {
        if (isNotEligibleForDisability)
            return 0;
        //...
    }

    // 2. Consolidate Duplicate Conditional Fragments
    if (isSpecialDeal())
        total = price * 0.95;
    else
        total = price * 0.98;
    send();

    // 3. Decompose Conditional
    if (isSummer(date)) {
        charge = summerCharge(quantity);
    }
    else {
        charge = winterCharge(quantity);
    }

    // 4. Remove Control Flag
    /* If a boolean variable acts as a control flag for multiple booelan expressions,
       use break, continue and return instead of the variable. */

    // 5. Replace Nested Conditional with Guard Clauses
    public double getPayAmount() {
        if (isDead) {
            return deadAmount();
        }
        if (isSeparated) {
            return separatedAmount();
        }
        if (isRetired) {
            return retiredAmount();
        }
        return normalPayAmount();
    }

    // 6. Replace Conditional with Polymorphism
    abstract class Bird {
        //...
        abstract double getSpeed();
    }

    class European extends Bird {
        double getSpeed() {
            return getBaseSpeed();
        }
    }

    class African extends Bird {
        double getSpeed() {
            return getBaseSpeed() - getLoadFactor * numberOfCoconuts;
        }
    }

    class NorwegianBlue extends Bird {
        double getSpeed() {
            return (isNailed) ? 0 : getBaseSpeed(voltage);
        }
    }

    //...client code
    speed = bird.getSpeed();

    // 7. Introduce Null Object
    class NullCustomer extends Customer {
        boolean isNull() {
            return true;
        }
        Plan getPlan() {
            return new NullPlan();
        }
        //...
    }
    customer = (order.customer != null) ? order.customer : new NullCustomer();
    plan = customer.getPlan();

    // 8. Introduce Assertion
    double getExpenseLimit() {
        Assert.isTrue(expenseLimit != NULL_EXPENSE || primaryProject != null);

        return (expenseLimit != NULL_EXPENSE) ? expenseLimit : primaryProject.getMemberExpenseLimit();
    }

}
