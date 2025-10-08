package aims;

public class Cart {
   public static final int MAX_ORDERED = 30;
   private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_ORDERED];
   private int quanityOrdered = 0;
   
   public void addDigitalVideoDisc(DigitalVideoDisc disc) {
	   if(quanityOrdered >= MAX_ORDERED) {
		   System.out.println("Cart is full!");
		   
	   }
	   
	   else {
		   itemsOrdered[quanityOrdered] = disc;
		   quanityOrdered ++;
		   System.out.println("Added " +disc.getTitle());
	   }
   }
   
   public void removeDigitalVideoDisc(DigitalVideoDisc dics) {
	   for(int i=0;i<quanityOrdered;i++) {
		   if(itemsOrdered[i]==dics) {
			   for(int j=i;j<quanityOrdered-1;j++) {
				   itemsOrdered[j]=itemsOrdered[j+1];
			   }
			   itemsOrdered[quanityOrdered-1]=null;
			   quanityOrdered--;
			   return;
		   }
		 
	   }  System.out.println("the DVD cannot find in your cart!");
   }
   
   public float totalCost() {
	   float sum=0;
	   for(int i=0;i<quanityOrdered;i++) {
		   sum+=itemsOrdered[i].getCost();
	   }
	   return sum;
   }
   
}
