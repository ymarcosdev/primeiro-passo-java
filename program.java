
public class program{
	
	 public static void main(String[] args) {
     String produtc1 ="Computer";
     String product2 ="Office Desk";
     
     int age=30;
     int code=5290;
    
      
	 double price1= 2100.0;
	 double price2= 650.50;
	 double measure= 53.234567;
	 
	 System.out.println("Products:");
	 System.out.printf("%s,which price is %.4f%n %s, which price is R$%f  ", produtc1, price1, product2 ,  price2);
	 System.out.println("");
	 System.out.println("");
	 System.out.print("Record:");
	 System.out.printf("%d years old, Code %d and gender:f",age,code );
	 System.out.println("");
	 System.out.printf("Measue with eight decimal places:%f rouded (three decimal places):53,235 US decimal point:53.235 ", measure );
	 
	 
	 
	 }
}