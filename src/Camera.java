import java.util.ArrayList;

public class Camera {


   private ArrayList<Animal> animale ;
   private Type type;
   private int numarCamera;


    public Camera(Type type, int numarCamera) {
        this.animale = new ArrayList<>();
        this.type = type;
        this.numarCamera = numarCamera;
    }


    public ArrayList<Animal> getAnimale() {
        return animale;
    }

    public void setAnimale(ArrayList<Animal> animale) {
        this.animale = animale;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getNumarCamera() {
        return numarCamera;
    }

    public void setNumarCamera(int numarCamera) {
        this.numarCamera = numarCamera;
    }

    public void addInCamera (Animal animal) throws MyException{
       if(animale.size()<5)
         animale.add(animal);
       else
           throw new MyException("Avem mai mult de 5 animale in camera");
    }



}
