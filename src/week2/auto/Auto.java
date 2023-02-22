package week2.auto;

public class Auto {
    String eigenaar;
    String merk;
    int gewicht;
    String honkSound = "TOOT";
    public void Honk() {
        System.out.println(honkSound);
    }
    public void Print(){
        System.out.printf("Car 1 is a: %s of around %dkg, The owner of the car is %s\n", merk, gewicht, eigenaar);
    }
    public Auto(String eigenaar, String merk, int gewicht) {
        this.eigenaar = eigenaar;
        this.merk = merk;
        this.gewicht = gewicht;
    }
}
