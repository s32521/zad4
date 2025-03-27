public class Klient {
    private int id;
    private String imie;
    private String nazwisko;
    private String email;
    private boolean czyStaly;

    public Klient(int id, String imie, String nazwisko, String email, boolean czyStaly) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.czyStaly = czyStaly;
    }
    public int getId() {
        return id;
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getEmail() {
        return email;
    }
    public boolean getCzyStaly() {
        return czyStaly;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCzyStaly(boolean czyStaly) {
        this.czyStaly = czyStaly;
    }
    public void wyswietlInformacje(){
        System.out.println("Id:"+this.id);
        System.out.println("Imie:"+this.imie);
        System.out.println("Nazwisko:"+this.nazwisko);
        System.out.println("Email:"+this.email);
        System.out.println("Czy Staly:"+this.czyStaly);
    }
}
