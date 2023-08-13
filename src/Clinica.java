import java.util.ArrayList;

public class Clinica {

   private ArrayList<Camera> cameras ;


    public Clinica(){
        this.cameras = new ArrayList<>();
        init();
    }


    public ArrayList<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(ArrayList<Camera> cameras) {
        this.cameras = cameras;
    }


    public void init (){
        Camera camera1 = new Camera(Type.CANGUR, 1);
        Camera camera2 = new Camera(Type.DINGO, 2);
        Camera camera3 = new Camera(Type.KOALA, 3);
        Camera camera4 = new Camera(Type.VEVERITA, 4);
        Camera camera5 = new Camera(Type.DINGO, 5);
        Camera camera6 = new Camera(Type.DINGO, 6);

        cameras.add(camera1);
        cameras.add(camera2);
        cameras.add(camera3);
        cameras.add(camera4);
        cameras.add(camera5);
        cameras.add(camera6);

    }

    public void addAnimale(Animal animal){

        if (isClinicaFull()){
            System.out.println ("clinica full");
            return;
        }

        try {
         Camera camera = getRoomByType(animal.type);
         camera.addInCamera(animal);
         }
       catch (MyException e){
         System.out.println(e);
        }
    }


    public Camera getRoomByType(Type type) throws MyException {
        for(Camera camera: cameras){
            if(camera.getType().equals(type))
                return camera;
        }
         throw new MyException("animale incompatibile");
    }


    public boolean isClinicaFull(){
        for(Camera camera: cameras){
            if(camera.getAnimale().size() < 5){
                  return false;
            }
        }
        return true;
    }


    public void removeAnimal (Animal animal){
        for(Camera camera :cameras){
            if (camera.getAnimale().contains(animal))
                camera.getAnimale().remove(animal);
        }
    }


    //Numarul si tipul speciilor de animale din clinica (de ex: 4 specii cangur, koala, veverita,
    //dingo)

    public void nrSiTipulAnimalelorDinClinica(){
        for(Camera camera :cameras){
            System.out.println("Avem " + camera.getAnimale().size() +" " + camera.getType() + " in camera cu nr " +camera.getNumarCamera());
        }
    }


    //Cate camere sunt ocupate si gradul de ocupare al fiecarei camere (4 camere ocupate, gradul
    //de ocupare: camera 1: 2 canguri, camera 2: 4 koala


    public void gradDeOcupare(){
        int camereOcupate = 0;
        for(Camera camera :cameras){
            if(camera.getAnimale().size() == 5 ){
                camereOcupate ++;
               System.out.println("camera cu nr :"+  camera.getNumarCamera()+ " este ocupata " +camereOcupate );
            }
        }

        for (Camera camera :cameras){
            double procentCamereOcupate;
            procentCamereOcupate = 100- (5 - camera.getAnimale().size())/5.0*100;
            System.out.println("avem grad de ocupare pe camera:" + camera.getNumarCamera() +" are " +procentCamereOcupate);
        }

    }


    //Cate camere sunt libere si cate animale se mai pot caza in fiecare camera si din ce specie.

    public void camereLibereClinica(){
        int camereLibere =0;
        for (Camera camera : cameras){
            if(camera.getAnimale().size() == 0){
               camereLibere ++;
                System.out.println( "nr camerei este " + camera.getNumarCamera());
            }
        }
        System.out.println("avem un nr de camere libere de : " + camereLibere + " " );
    }


    public void cateAnimaleSeMaiPotCaza(){
        int camereNeocupate = 0;
        for(Camera camera :cameras){
            if(camera.getAnimale().size()<5){
             camereNeocupate = 5 - camera.getAnimale().size();
            }
            System.out.println("in camera " + camera.getNumarCamera() + " se mai pot caza " + camereNeocupate + " animale din specia "+ camera.getType());
        }
    }

    public void cateCamereIsLibereLaClinica() {
        int camereNeocupate = 0;
        for (Camera camera : cameras) {
            if (camera.getAnimale().size() < 5) {
                camereNeocupate = 5 - camera.getAnimale().size() + camereNeocupate;
            }
        }
        System.out.println("in clinica avem un total de camere libere de: " +camereNeocupate);
    }


}
