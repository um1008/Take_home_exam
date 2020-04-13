
import java.util.ArrayList;
public class ExamQ3Abstract {
    public static void main(String[] args) {
    	
         ArrayList<SpaceShip> list = new ArrayList<SpaceShip> ();
         
         StarWarsShips s1 = new StarWarsShips();
         list.add(s1);
         
         StarTrekShips s2 = new StarTrekShips();
         list.add(s2);
         
         OtherSciFiSpaceShips s3= new OtherSciFiSpaceShips();
         list.add(s3);
         
         for(int i=0;i<3;i++) {
             SpaceShip spaceship = list.get(i);
             System.out.println("Name: "+ spaceship.getName());
             System.out.println("Tonnage: "+ spaceship.getTonnage());
             System.out.println("getFranchise: "+spaceship.getFranchise());
             System.out.println("");
         }
    }
}
