public class TestCurrencyConverter {

    public static void main(String[] args) {
        System.out.println("Running Strict Compliance Tests...\n");
        
        int passed = 0;
        int failed = 0;

        // --- Test 1: Default Constructor ---
        // Expected: 0.0 amount, "USD" code
        CurrencyConverter t1 = new CurrencyConverter();
        if (t1.getAmount() == 0.0 && "USD".equals(t1.getCurrencyCode())) {
            System.out.println("[PASS] Default Constructor");
            passed++;
        } else {
            System.out.println("[FAIL] Default Constructor");
            System.out.println("   Expected: 0.0 USD");
            System.out.println("   Got: " + t1.getAmount() + " " + t1.getCurrencyCode());
            failed++;
        }

        // --- Test 2: Parameterized Constructor ---
        // Expected: 100.0 amount, "EUR" code
        CurrencyConverter t2 = new CurrencyConverter(100.0, "EUR");
        if (t2.getAmount() == 100.0 && "EUR".equals(t2.getCurrencyCode())) {
            System.out.println("[PASS] Parameterized Constructor");
            passed++;
        } else {
            System.out.println("[FAIL] Parameterized Constructor");
            failed++;
        }

        // --- Test 3: Math Logic (VND -> USD) ---
        // Expected: 1,000,000 * 0.0000038 = 3.8
        CurrencyConverter t3 = new CurrencyConverter(1000000, "VND");
        double result3 = t3.toUSD();
        if (Math.abs(result3 - 3.8) < 0.0001) {
            System.out.println("[PASS] Math: VND to USD");
            passed++;
        } else {
            System.out.println("[FAIL] Math: VND to USD");
            System.out.println("   Expected: 3.8");
            System.out.println("   Got: " + result3);
            failed++;
        }

        // --- Test 4: STRICT CHECK - Negative Numbers ---
        // If you kept your logic that sets negative numbers to 0, this will FAIL.
        // The assignment did NOT ask for validation, so strict code allows -50.
        CurrencyConverter t4 = new CurrencyConverter(-50, "USD");
        if (t4.getAmount() == -50.0) {
            System.out.println("[PASS] Strict Check: Negative Allowed");
            passed++;
        } else {
            System.out.println("[FAIL] Strict Check: Negative Allowed");
            System.out.println("   Your code changed -50 to: " + t4.getAmount());
            System.out.println("   Reason: You added validation that wasn't requested.");
            failed++;
        }

        // --- Test 5: STRICT CHECK - Invalid Currency ---
        // If you kept logic that changes "JPY" to "USD", this will FAIL.
        CurrencyConverter t5 = new CurrencyConverter(100, "JPY");
        if ("JPY".equals(t5.getCurrencyCode())) {
            System.out.println("[PASS] Strict Check: Invalid Currency Storage");
            passed++;
        } else {
            System.out.println("[FAIL] Strict Check: Invalid Currency Storage");
            System.out.println("   Your code changed 'JPY' to: " + t5.getCurrencyCode());
            System.out.println("   Reason: You added validation that wasn't requested.");
            failed++;
        }

        System.out.println("\n-----------------------------");
        System.out.println("Total Passed: " + passed);
        System.out.println("Total Failed: " + failed);
        
        if (failed > 0) {
            System.out.println("VERDICT: CODE NEEDS FIXING TO MATCH ASSIGNMENT EXACTLY.");
        } else {
            System.out.println("VERDICT: PERFECT SCORE.");
        }
    }
}