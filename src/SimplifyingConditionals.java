public class SimplifyingConditionals {

    // 1. Consollidate Conditional Expression
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


    // 4. Remove Control Flag
    /* If a boolean variable acts as a control flag for multiple booelan expressions,
       use break, continue and return instead of the variable. */

    // 5. Replace Nested Conditional with Guard Clauses


    // 6. Replace Conditional with Polymorphism


    // 7. Introduce Null Object


    // 8. Introduce Assertion


}
