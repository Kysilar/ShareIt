package Gereedschap;

import Gereedschap.Gereedschap;

public class Stopgezet implements ToolState {
    Gereedschap gereedschap;
    public Stopgezet(Gereedschap gereedschap) {
        this.gereedschap = gereedschap;
    }


    @Override
    public void InfoIngeven(String gereedschapsNaam, Gereedschapstype type) {
        System.out.printf("Het item is stopgezet%n");
    }

    @Override
    public void Keuren(Boolean goedgekeurd, String extraInfo) {
        System.out.printf("Het item is stopgezet%n");
    }

    @Override
    public void Herkeuren() {
        System.out.printf("Het item zal nu opnieuw gekeurd worden door een expert.%n");
        gereedschap.setToolState(gereedschap.getTeKeuren());
    }

    @Override
    public void Stopzetten() {
        System.out.printf("Het item is stopgezet%n");
    }

    @Override
    public void Reserveren(String gebruikersNaam) {
        System.out.printf("Het item is stopgezet%n");
    }

    @Override
    public void Afhalen(boolean afgehaald, String gebruikersNaam) {
        System.out.printf("Het item is stopgezet%n");
    }

    @Override
    public void BeschikbaarStellen() {
        System.out.printf("Het item is stopgezet%n");
    }

    @Override
    public void GereedschapstypeToekennen(Gereedschapstype type) {
        System.out.printf("Het item is stopgezet%n");
    }
}
