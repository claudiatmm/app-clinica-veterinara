//import java.util.ArrayList;
//
//public class CameraNO {
//
//
//    public String [] camere = new String[10];
//
//
//    public ArrayList<String> populareCamera(String[] specie , int indexAnimal) {
//        Animal animal = new Animal(specie[0],specie[1],specie[2],specie[3],specie[4]);
//        ArrayList<String> abc = new ArrayList<>();
//        abc.add(animal.specie1);
//        abc.add(animal.specie2);
//        abc.add(animal.specie3);
//        abc.add(animal.specie4);
//        abc.add(animal.specie5);
//
//        camere[indexAnimal] = String.valueOf(abc);
//
//        for(String a :camere){
//        System.out.println(a);}
//        return abc;
//    }
//
//
//
//    public String plasareAnimalNouInCamera(String animal){
//
//        ArrayList<String> abcD = new ArrayList<>();
//        ArrayList<Animal> abcDOI = new ArrayList<>();
//        Animal animal1 = null;
//        String cameraAnimale="";
//
//        for(int i=0; i< camere.length; i++){
//            if(camere[i] == null || camere[i].isEmpty() || camere[i] != null){
//                cameraAnimale = camere[i];
//                abcD.add(cameraAnimale);
//            }
//
//            for (int i1 =0; i1 < abcD.size(); i1++){
//                 String animalSpatiu = String.valueOf(abcD + "\n") ;
//                System.out.println("aici am valoarea" + animalSpatiu);
//
//                String[] splitDupaVirgula = animalSpatiu.split(",");
//                animal1 = new Animal(splitDupaVirgula[0],splitDupaVirgula[1], splitDupaVirgula[2], splitDupaVirgula[3], splitDupaVirgula[4]);
//                abcDOI.add(animal1);
//                System.out.println("valoare din lista" +animal1);
//
//            }
//
//        }
//
////        System.out.println("aici e" + abcD.get(0));
//        System.out.println( "DOIII " );
//
//        return null;
//    }
//
//
//
//
//    public void populareCameraVariantaDoi(String[] specie , int indexAnimal) {
//        Animal animal = new Animal(specie[0],specie[1],specie[2],specie[3],specie[4]);
//        ArrayList<String> abc = new ArrayList<>();
//        abc.add(animal.specie1);
//        abc.add(animal.specie2);
//        abc.add(animal.specie3);
//        abc.add(animal.specie4);
//        abc.add(animal.specie5);
//        camere[indexAnimal] = String.valueOf(abc);
//    }
//
//
//    public void addAnimalInCamera(String numeSpecie){
//
//        ArrayList<String> valoareDePeIndex = new ArrayList<>();
//        for (int i =0; i< camere.length; i++) {
//            valoareDePeIndex.add(camere[i]);
//            for (int ii = 0; ii < valoareDePeIndex.size(); ii++) {
//                String[] split = valoareDePeIndex.get(ii).split(",");
//                ArrayList<String> valoareDupaSplit = new ArrayList<>();
//                Animal animal = new Animal(split[0],split[1],split[2], split[3], split[4]);
//                valoareDupaSplit.add(String.valueOf(animal));
//
//                for (int iii = 0; iii < valoareDupaSplit.size(); iii++) {
//                    if (valoareDupaSplit.get(iii).isEmpty() || valoareDupaSplit.get(iii) == null || valoareDupaSplit.get(iii).equals(numeSpecie))
//                        valoareDupaSplit.add(numeSpecie);
//
//                    else
//                      System.out.println("Animale Incompatibile");
//                }
//
//            }
//
//        }
//
//    }
//
//
//
//
//
//}
//
//
