package week5.singleton;

class Aarde {
    private static Aarde instance;

    Aarde(){}

    public static Aarde getInstance(){
        if(instance == null) {
            instance = new Aarde();
        }
        return Aarde.instance;
    }

    public void print(String print){
        System.out.println(print);
    }
}
