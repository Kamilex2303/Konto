package konto;

class KontoHistoria extends Dane {
    
    double[] historia = new double[5];
    double[] historia2 = new double[5];
    int operacje =0;
    int i=0;
    public KontoHistoria(double stan, String wlasciciel) {
        super(stan, wlasciciel);
    }
    
    @Override
    void operacja(double ile){
       if(operacje<5){
        super.operacja(ile);
        this.historia[operacje]= ile;
        operacje++;
       }
       else{
        operacje =0; 
        super.operacja(ile);
        this.historia[operacje]= ile;
        operacje++;
       }
    }
    
    void historia(){
        for(int i=0 ; i<5; i++){
            System.out.println(historia[i]);
        }
    }
}
