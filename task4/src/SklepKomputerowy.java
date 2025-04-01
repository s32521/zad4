
public class SklepKomputerowy {
    public Produkt[] produkty;
    public Klient[] klienci;
    public Zamowienie[] zamowienia;
    public int liczbaProduktow;
    public int liczbaKlientow;
    public int liczbaZamowien;

    public SklepKomputerowy() {
        produkty = new Produkt[100];
        klienci = new Klient[100];
        zamowienia = new Zamowienie[100];
    }

    public void  dodajProdukt(Produkt produkt){
        if(liczbaProduktow<produkty.length)
            produkty[liczbaProduktow++] = produkt;
        }

    public void dodajKlienta(Klient klient) {
        if (liczbaKlientow < klienci.length) {
            klienci[liczbaKlientow++] = klient;
        }
    }

    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty,int[] ilosci){

        Zamowienie noweZamowienie = new Zamowienie(liczbaZamowien+1, klient, produkty, ilosci, "30.03.2025", "Nowe");
        zamowienia[liczbaZamowien] = noweZamowienie;
        return zamowienia[liczbaZamowien++];
    }

    public void aktualizujStanMagazynowy(Zamowienie zamowienie){
        Produkt[] produkty = zamowienie.getProdukty();
        int[] ilosci = zamowienie.getIlosci();
        for(int i = 0; i<ilosci.length; i++){
            int stan = produkty[i].getIloscWMagazynie();
            int nowyStan = stan - ilosci[i];
            produkty[i].setIloscWMagazynie(nowyStan);
        }

    }

    public void zmienStatusZamowienia(int idZamowienia,String nowyStatus){
      for(int i = 0; i<liczbaZamowien; i++){
          if(zamowienia[i].getId() == idZamowienia){
              zamowienia[i].setStatus(nowyStatus);
          }
      }
    }

    public void wyswietlProduktyWKategorii(String kategoria){
        for(int i = 0; i<liczbaProduktow; i++){
            if (produkty[i].getKategoria().equals(kategoria)) {
                System.out.println(produkty[i].getNazwa()+", Id:"+produkty[i].getId()+","+produkty[i].getCena()+"zł, ilość w magazynie:"+ produkty[i].getIloscWMagazynie());
            }
        }
    }

    public void wyswietlZamowieniaKlienta(int idKlient){
        for(int i = 0; i<liczbaZamowien; i++){
            if(zamowienia[i].getKlient().getId() == idKlient){
                zamowienia[i].wyswietlSzczegoly();
            }
        }
    }

}
