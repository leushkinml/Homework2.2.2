import java.util.HashSet;
import java.util.Set;

public class Sponsor {

    private final String name;
    private final int amount;

    private Set<Sponsor> sponsors;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;

        sponsors = new HashSet<>();
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void toSponsorRace() {
        System.out.printf("Спонсор %s проспонсировал заезд на %d%n", name, amount);
    }

    @Override
    public String toString() {
        return name + ", сумма поддержки " + amount;
    }
}
