import java.util.ArrayList;

public class ExamQ3Interface {
	public static void main(String[] args) {
        ArrayList<BakedGoods> list = new ArrayList<BakedGoods> ();
        Cookie c1 = new Cookie();
        list.add(c1);
        
        CinnamonRoll c2 = new CinnamonRoll();
        list.add(c2);
        
        Brownie b3= new Brownie();
        list.add(b3);
        
        for(int i=0;i<3;i++) {
        	BakedGoods bakedgoods = list.get(i);
            System.out.println("Price: "+ bakedgoods.getPrice());
            System.out.println("Description: "+ bakedgoods.getDescription());
            System.out.println("Sell by: "+bakedgoods.getSellByDate());
            System.out.println("");
        }
   }
}