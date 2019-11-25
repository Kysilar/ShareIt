package Gereedschap;

import Gereedschap.Gereedschap;

public class Tekeuren implements ToolState {
    private Gereedschap gereedschap;
    public Tekeuren(Gereedschap gereedschap) {
        this.gereedschap = gereedschap;
    }


    @Override
    public void InfoIngeven(String gereedschapsNaam, Gereedschapstype type) {
        System.out.printf("Er is reeds info ingegeven voor dit item.%n");
    }

    @Override
    public void Keuren(Boolean goedgekeurd, String extraInfo) {
        if (goedgekeurd == true) {
            System.out.printf("item goedgekeurd%n");
            gereedschap.setToolState(gereedschap.getBeschikbaar());
        } else {
            System.out.printf("item afgekeurd. Reden:%s%n", extraInfo);
            gereedschap.setToolState(gereedschap.getAfgekeurd());
        }
    }

    @Override
    public void Herkeuren() {
        System.out.printf("Item is nog niet gekeurd. Het kan niet herkeurd worden.%n");
    }

    @Override
    public void Stopzetten() {
        System.out.printf("Item is nog niet beschikbaar gezet. Het kan niet worden stopgezet.%n");
    }

    @Override
    public void Reserveren(String gebruikersNaam) {
        System.out.printf("Item is nog niet beschikbaar gezet.%n");
    }

    @Override
    public void Afhalen(boolean afgehaald, String gebruikersNaam) {
        System.out.printf("Item is nog niet beschikbaar gezet.%n");
    }

    @Override
    public void BeschikbaarStellen() {
        System.out.printf("Item is nog niet beschikbaar gezet.%n");
    }

    @Override
    public void GereedschapstypeToekennen(Gereedschapstype type) {
        System.out.printf("Gereedschapstype is reeds toegekend.%n");
    }
}
