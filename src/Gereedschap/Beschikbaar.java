package Gereedschap;

import Gereedschap.Gereedschap;

public class Beschikbaar implements ToolState {
    Gereedschap gereedschap;
    public Beschikbaar(Gereedschap gereedschap) {
        this.gereedschap = gereedschap;
    }


    @Override
    public void InfoIngeven(String gereedschapsNaam, Gereedschapstype type) {
        System.out.printf("Voor dit item is reeds informatie ingegeven.%n");
    }

    @Override
    public void Keuren(Boolean goedgekeurd, String extraInfo) {
        System.out.printf("Het item is al gekeurd.%n");
    }

    @Override
    public void Herkeuren() {
        System.out.printf("Het item heeft een aanvraag tot herkeuring gekregen. Een expert zal dit zo snel mogelijk doen.%n");
        gereedschap.setToolState(gereedschap.getTeKeuren());
    }

    @Override
    public void Stopzetten() {
        System.out.printf("Het item is nu stopgezet.");
        gereedschap.setToolState(gereedschap.getStopgezet());
    }

    @Override
    public void Reserveren(String gebruikersNaam) {
        System.out.printf("Het item is gereserveerd door %s.%n", gebruikersNaam);
        gereedschap.setToolState(gereedschap.getGereserveerd());
    }

    @Override
    public void Afhalen(boolean afgehaald, String gebruikersNaam) {
        System.out.printf("Het item is nog niet gereserveerd.%n");
    }

    @Override
    public void BeschikbaarStellen() {
        System.out.printf("Het item is nog niet gereserveerd.%n");
    }

    @Override
    public void GereedschapstypeToekennen(Gereedschapstype type) {
        System.out.printf("Het item heeft al een gereedschapstype.%n");
    }
}
