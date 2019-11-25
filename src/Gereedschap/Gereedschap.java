package Gereedschap;

public class Gereedschap {

    private ToolState ingediend;
    private ToolState teKeuren;
    private ToolState afgekeurd;
    private ToolState geblokkeerd;
    private ToolState stopgezet;
    private ToolState beschikbaar;
    private ToolState geannuleerd;
    private ToolState gereserveerd;
    private ToolState uitgeleend;

    private ToolState toolState;


    public Gereedschap(){
         ingediend = new Ingediend(this);
         teKeuren = new Tekeuren(this);
         afgekeurd = new Afgekeurd(this);
         geblokkeerd = new Geblokkeerd(this);
         stopgezet = new Stopgezet(this);
         beschikbaar = new Beschikbaar(this);
         geannuleerd = new Geannuleerd(this);
         gereserveerd = new Gereserveerd(this);
         uitgeleend = new Uitgeleend(this);

         toolState = ingediend;
    }

    public void setToolState(ToolState newState){
        toolState = newState;
    }

    void InfoIngeven(String gereedschapsNaam, Gereedschapstype type){
        toolState.InfoIngeven(gereedschapsNaam, type);
    }
    void Keuren(Boolean goedgekeurd, String extraInfo){
        toolState.Keuren(goedgekeurd, extraInfo);
    }
    void Herkeuren(){
        toolState.Herkeuren();
    }
    void Stopzetten(){
        toolState.Stopzetten();
    }
    void Reserveren(String gebruikersNaam){
        toolState.Reserveren(gebruikersNaam);
    }
    void Afhalen(boolean afgehaald, String gebruikersNaam){
        toolState.Afhalen( afgehaald, gebruikersNaam);
    }
    void Terugbrengen(){
        toolState.BeschikbaarStellen();
    }

    public ToolState getIngediend() {
        return ingediend;
    }

    public ToolState getTeKeuren() {
        return teKeuren;
    }

    public ToolState getAfgekeurd() {
        return afgekeurd;
    }

    public ToolState getGeblokkeerd() {
        return geblokkeerd;
    }

    public ToolState getStopgezet() {
        return stopgezet;
    }

    public ToolState getBeschikbaar() {
        return beschikbaar;
    }

    public ToolState getGeannuleerd() {
        return geannuleerd;
    }

    public ToolState getGereserveerd() {
        return gereserveerd;
    }

    public ToolState getUitgeleend() {
        return uitgeleend;
    }
}
