public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 31;

        long actual = service.calculate(amount, registered);

        boolean passed = expected == actual;

        System.out.println(passed);
    }
}
