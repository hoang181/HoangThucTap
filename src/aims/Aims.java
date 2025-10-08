package aims;

public class Aims {
     public static void main(String[]args) {
    	 Cart cart = new Cart();
    	 
    	 DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
         DigitalVideoDisc dvd2 = new DigitalVideoDisc("Animation", "Spirited Away", 19.95f);
         DigitalVideoDisc dvd3 = new DigitalVideoDisc("Hayao Miyazaki", "Animation", "Totoro", 14.95f);
         
         cart.addDigitalVideoDisc(dvd1);
         cart.addDigitalVideoDisc(dvd2);
         cart.addDigitalVideoDisc(dvd3);
         
         cart.removeDigitalVideoDisc(dvd2);

         System.out.println("Total cost: " + cart.totalCost());
     }
}
