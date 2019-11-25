package Gereedschap;

public interface ToolState {
   void InfoIngeven(String gereedschapsNaam, Gereedschapstype type);
   void Keuren(Boolean goedgekeurd, String extraInfo);
   void Herkeuren();
   void Stopzetten();
   void Reserveren(String gebruikersNaam);
   void Afhalen(boolean afgehaald, String gebruikersNaam);
   void BeschikbaarStellen();
   void GereedschapstypeToekennen(Gereedschapstype type);

}
