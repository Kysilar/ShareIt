package Gereedschap;

import Gereedschap.Gereedschap;

public class Afgekeurd implements ToolState {
    private Gereedschap gereedschap;
    public Afgekeurd(Gereedschap gereedschap) {
        this.gereedschap = gereedschap;
    }


    @Override
    public void InfoIngeven(String gereedschapsNaam, Gereedschapstype type) {
        System.out.printf("Item is afgekeurd. Gelieve te wachten tot een expert dit terug goed heeft gekeurd.%n");
    }

    @Override
    public void Keuren(Boolean goedgekeurd, String extraInfo) {
        System.out.printf("Item is afgekeurd. Gelieve te wachten tot een expert dit terug goed heeft gekeurd.%n");
    }

    @Override
    public void Herkeuren() {
        System.out.printf("Gelieve de info te updaten zodat een expert dit terug kan keuren.%n");
        gereedschap.setToolState(gereedschap.getIngediend());
    }

    @Override
    public void Stopzetten() {
        System.out.printf("Item is afgekeurd. Gelieve te wachten tot een expert dit terug goed heeft gekeurd.%n");
    }

    @Override
    public void Reserveren(String gebruikersNaam) {
        System.out.printf("Item is afgekeurd. Gelieve te wachten tot een expert dit terug goed heeft gekeurd.%n");
    }

    @Override
    public void Afhalen(boolean afgehaald, String gebruikersNaam) {
        System.out.printf("Item is afgekeurd. Gelieve te wachten tot een expert dit terug goed heeft gekeurd.%n");
    }

    @Override
    public void BeschikbaarStellen() {
        System.out.printf("Item is afgekeurd. Gelieve te wachten tot een expert dit terug goed heeft gekeurd.%n");
    }

    @Override
    public void GereedschapstypeToekennen(Gereedschapstype type) {
        System.out.printf("Gereedschapstype is reeds toegekend.%n");
    }
}
