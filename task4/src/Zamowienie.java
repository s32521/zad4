public class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;

    public Zamowienie(int id, Klient klient, Produkt[] produkty, int[] ilosci, String dataZamowienia, String status) {
        this.id = id;
        this.klient = klient;
        this.produkty = produkty;
        this.ilosci = ilosci;
        this.dataZamowienia = dataZamowienia;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public Klient getKlient() {
        return klient;
    }
    public Produkt[] getProdukty() {
        return produkty;
    }
    public int[] getIlosci() {
        return ilosci;
    }
    public String getDataZamowienia() {
        return dataZamowienia;
    }
    public String getStatus() {
        return status;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setKlient(Klient klient) {
        this.klient = klient;
    }
    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }
    public void setIlosci(int[] ilosci) {
        this.ilosci = ilosci;
    }
    public void setDataZamowienia(String dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public double obliczWartoscZamowienia() {
        double suma = 0.0;
        for (int i=0; i<produkty.length; i++){
            suma+=produkty[i].getCena()*ilosci[i];
        }
        return suma;
    }
    public void zastosujZnizke(){
        if(klient.getCzyStaly()){
            double nowaWartoscZamowienia = obliczWartoscZamowienia()*0.9;
            System.out.println("Nowa wartość zamówienia" + nowaWartoscZamowienia);
        }else {
            System.out.println("Brak zniżki");
        }
    }
    public void wyswietlSzczegoly(){
        System.out.println("Id:"+this.id);
        System.out.println("Klient:"+this.klient);
        System.out.println("Produkty:"+this.produkty);
        System.out.println("Ilosci:"+this.ilosci);
        System.out.println("DataZamowienia:"+this.dataZamowienia);
        System.out.println("Status:"+this.status);

    }
}
