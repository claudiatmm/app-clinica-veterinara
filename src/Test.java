public class Test {


    public static void main(String[] args) {

        Animal animal1 = new Animal(Type.CANGUR, "Mmm", 22);
        Animal animal3 = new Animal(Type.KOALA, "BB", 44);
        Animal animal4 = new Animal(Type.DINGO, "DD", 88);
        Animal animal5 = new Animal(Type.VEVERITA, "RRR", 99);

        Clinica clinica = new Clinica();
        clinica.addAnimale(animal1);
        clinica.addAnimale(animal5);
        clinica.addAnimale(animal3);
        clinica.addAnimale(animal4);
        clinica.addAnimale(animal4);
        clinica.addAnimale(animal1);
        clinica.addAnimale(animal1);
        clinica.addAnimale(animal1);
        clinica.addAnimale(animal1);

        //TEST Methods
        clinica.nrSiTipulAnimalelorDinClinica();
        clinica.gradDeOcupare();
        clinica.camereLibereClinica();
        clinica.cateAnimaleSeMaiPotCaza();
        clinica.cateCamereIsLibereLaClinica();


    }
}
