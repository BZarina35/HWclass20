package HWclass20;

public class CreditCardTester {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1000, 0.05);
        creditCard.calculateInterest();

        Visa visa = new Visa(2000, 0.03);
        visa.calculateInterest();

        AX ax = new AX(3000, 0.02);
        ax.calculateInterest();
    }
}
