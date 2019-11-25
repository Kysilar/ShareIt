package Gereedschap;

import Gereedschap.Gereedschap;

public class Geblokkeerd implements ToolState {
    private Gereedschap gereedschap;
    public Geblokkeerd(Gereedschap gereedschap) {
        this.gereedschap = gereedschap;
    }


    @Override
    public void InfoIngeven(String gereedschapsNaam, Gereedschapstype type) {
        System.out.printf("Item is gebokeerd. Gelieve te wachten tot een admin dit verhelpt.%n");
    }

    @Override
    public void Keuren(Boolean goedgekeurd, String extraInfo) {
        System.out.printf("Item is gebokeerd. Gelieve te wachten tot een admin dit verhelpt.%n");
    }

    @Override
    public void Herkeuren() {
        System.out.printf("Item is gebokeerd. Gelieve te wachten tot een admin dit verhelpt.%n");
    }

    @Override
    public void Stopzetten() {
        System.out.printf("Item is gebokeerd. Gelieve te wachten tot een admin dit verhelpt.%n");
    }

    @Override
    public void Reserveren(String gebruikersNaam) {
        System.out.printf("Item is gebokeerd. Gelieve te wachten tot een admin dit verhelpt.%n");
    }

    @Override
    public void Afhalen(boolean afgehaald, String gebruikersNaam){
        System.out.printf("Item is gebokeerd. Gelieve te wachten tot een admin dit verhelpt.%n");
    }

    @Override
    public void BeschikbaarStellen() {
        System.out.printf("Item is gebokeerd. Gelieve te wachten tot een admin dit verhelpt.%n");
    }

    @Override
    public void GereedschapstypeToekennen(Gereedschapstype type) {
        System.out.printf("Gereedschapstype toegekend. Het kan nu worden gekeurd.");
        gereedschap.setToolState(gereedschap.getTeKeuren());
    }
}
