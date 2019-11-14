
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int totalEuros = euros + added.euros();
        int totalCents = cents + added.cents();

        if (totalCents >= 100) {
            totalEuros++;
            totalCents -= 100;
        }

        Money total = new Money(totalEuros, totalCents);

        return total;
    }

    public boolean less(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        }
        if (this.euros() == compared.euros()) {
            if (this.cents() < compared.cents()) {
                return true;
            }
        }
        return false;
    }

    public Money minus(Money decremented) {
        int totalEuros = euros - decremented.euros();
        int totalCents = cents - decremented.cents();

        if (totalCents < 0) {
            totalEuros--;
            totalCents += 100;
        }
        
        if (totalEuros < 0) {
            totalEuros = 0;
            totalCents = 0;
        }

        Money total = new Money(totalEuros, totalCents);

        return total;
    }
}
