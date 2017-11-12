class Dane {
    private  double stan;
    private  String wlasciciel;
    
    Dane(double stan , String wlasciciel){
        this.stan = stan;
        this.wlasciciel = wlasciciel;
    }
    
    double getStan(){
        return stan;
    }
    
    String getWlasciciel(){
        return wlasciciel;
    }
    
    void setStan(double stan){
        this.stan = stan;
    }
    
    void setWlasciciel(String wlasciciel){
        this.wlasciciel = wlasciciel;
    }
    
    @Override
    public String toString(){
        return "Konto : "+this.wlasciciel+", stan : "+this.stan;
    }
    
    void operacja(double ile){
        this.setStan(this.getStan() + ile);
    }
    
    void przelej(double ile , Dane dokad){
        this.operacja(-ile);
        dokad.operacja(ile);
    }
    
    static void przelej(double ile , Dane dokad , Dane skad){
        skad.operacja(-ile);
        dokad.operacja(ile);
    }
    
    
}
