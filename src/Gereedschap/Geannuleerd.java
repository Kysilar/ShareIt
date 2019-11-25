package Gereedschap;

import Gereedschap.Gereedschap;

public class Geannuleerd implements ToolState {
    Gereedschap gereedschap;
    public Geannuleerd(Gereedschap gereedschap) {
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
        System.out.printf("Item kan momenteel niet gereserveerd worden.%n");
    }

    @Override
    public void Afhalen(boolean afgehaald, String gebruikersNaam) {
        System.out.printf("Item kan momenteel niet afgehaald worden.%n");
    }

    @Override
    public void BeschikbaarStellen() {
        System.out.printf("Item is nu terug beschikbaar voor reservaties.%n");
        gereedschap.setToolState(gereedschap.getBeschikbaar());
    }

    @Override
    public void GereedschapstypeToekennen(Gereedschapstype type) {
        System.out.printf("Item heeft reeds een geldig gereedschapstype.%n");
    }
}
