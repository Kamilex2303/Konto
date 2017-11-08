package konto;

public class Konto {

    public static void main(String[] args) {
       Dane k1 = new Dane(1000 , "Kamil Stasiak");
       Dane k2 = new Dane(2000 , "Patrycja Bak");   
       KontoHistoria k3 = new KontoHistoria(3000 , "Olek Szewczak");
       KontoHistoria k4 = new KontoHistoria(5000 , "Jan Kowalski");
       
       
       KontoHistoria.przelej(200 , k3 , k4);
       KontoHistoria.przelej(300 , k4 , k3);
       KontoHistoria.przelej(300 , k4 , k3);
       KontoHistoria.przelej(300 , k4 , k3);
       KontoHistoria.przelej(300 , k4 , k3);
       KontoHistoria.przelej(600 , k4 , k3);
       
       k3.historia();
       
       
       
       
       
       
    }    
}
