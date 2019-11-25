package Gereedschap;

import Gereedschap.Gereedschap;

public class Ingediend implements ToolState {
    private Gereedschap gereedschap;
    public Ingediend(Gereedschap g) {
        gereedschap = g;
    }

    @Override
    public void InfoIngeven(String gereedschapsNaam, Gereedschapstype type) {
            if (type == Gereedschapstype.Andere){
                System.out.printf("Gereedschapstype nog niet aangemaakt. Een admin zal dit zo snel mogelijk doen en u contacteren.%n");
                gereedschap.setToolState(gereedschap.getGeblokkeerd());
            } else{
                System.out.printf("Informatie ontvangen. Een expert zal uw gereedschap zo snel mogelijk keuren.%n");
                gereedschap.setToolState(gereedschap.getTeKeuren());
            }
    }

    @Override
    public void Keuren(Boolean goedgekeurd, String extraInfo) {
        System.out.printf("Er is geen info van dit gereedschap gevonden. Vul dit eerst in.%n");
    }

    @Override
    public void Herkeuren() {
        System.out.printf("Er is geen info van dit gereedschap gevonden. Vul dit eerst in.%n");
    }

    @Override
    public void Stopzetten() {
        System.out.printf("Uw item is nog niet gekeurd, dus het kan niet stopgezet worden.%n");
    }

    @Override
    public void Reserveren(String gebruikersNaam) {
        System.out.printf("Uw item is nog niet gekeurd, het kan niet gereserveerd worden.%n");
    }

    @Override
    public void Afhalen(boolean afgehaald, String gebruikersNaam) {
        System.out.printf("Uw item is nog niet gereserveerd, het kan niet afgehaald worden.%n");
    }

    @Override
    public void BeschikbaarStellen() {
        System.out.printf("Uw item is nog niet ontleend, het kan niet teruggebracht worden worden.%n");
    }

    @Override
    public void GereedschapstypeToekennen(Gereedschapstype type) {
        System.out.printf("Gereedschapstype is reeds toegekend.%n");
    }
}
