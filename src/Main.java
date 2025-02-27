public class Main {
    public static void main(String[] args) {
        // Unit Test for Cash class

        // Fake Exchange (returns a constant rate 0.8)
        Exchange mockExchange = new Exchange() {
            @Override
            public float rate(String origin, String target) {
                return 0.8f;
            }
        };
        Cash dollar = new Cash(mockExchange, 100);
        System.out.println("Dollar: " + dollar.toString());

        // Test 'in' method of Cash
        Cash euro = dollar.in("Euro");
        System.out.println("Dollar to Euro: " + euro.toString());
    }
}