package Gereedschap;

import Gereedschap.Gereedschap;

public class Gereserveerd implements ToolState {
    Gereedschap gereedschap;
    public Gereserveerd(Gereedschap gereedschap) {
        this.gereedschap = gereedschap;
    }


    @Override
    public void InfoIngeven(String gereedschapsNaam, Gereedschapstype type) {
        System.out.printf("Item heeft reeds geldige info.%n");
    }

    @Override
    public void Keuren(Boolean goedgekeurd, String extraInfo) {
        System.out.printf("Item is reeds gekeurd.%n");
    }

    @Override
    public void Herkeuren() {
        System.out.printf("Item is reeds gekeurd.%n");
    }

    @Override
    public void Stopzetten() {
        System.out.printf("Item kan momenteel niet stopgezet worden.%n");
    }

    @Override
    public void Reserveren(String gebruikersNaam) {
        System.out.printf("Item is reeds gereserveerd.%n");
    }

    @Override
    public void Afhalen(boolean afgehaald, String gebruikersNaam) {
        if (afgehaald == true) {
            System.out.printf("Item is afgehaald door %s.%n", gebruikersNaam);
            gereedschap.setToolState(gereedschap.getUitgeleend());
        } else {
            System.out.printf("%s heeft dit item niet op tijd afgehaald. De reservatie is geannuleerd.%n", gebruikersNaam);
            gereedschap.setToolState(gereedschap.getGeannuleerd());
        }
    }

    @Override
    public void BeschikbaarStellen() {
        System.out.printf("Item is nog niet afgehaald.%n");
    }

    @Override
    public void GereedschapstypeToekennen(Gereedschapstype type) {
        System.out.printf("Item heeft reeds een geldig gereedschapstype.%n");
    }
}
