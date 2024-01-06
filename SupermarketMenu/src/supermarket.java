import java.util.Scanner; 

public class supermarket {
     public static void main(String[]args) {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("welcome to the super market");
    	 
    	 boolean continueShopping = true;
    	 
    	 while (continueShopping) {
    		 printCategories();
    		 
    		 System.out.println("Enter the number of the category you whant to explore");
    		 int choice= sc.nextInt();
    		 
    		 if (choice==0) {
    			 continueShopping = false; }
    		 else if (choice>=1 && choice<=10) {
                     printCategory(choice);
    		 }
    	     else {
    	    	 System.out.println("invalid choice. Please enter a value between 1 to 10");
    	     }
    		 }
     
    	 System.out.println("thanks for shopping at our Supermarket :)");		 
    	 }

          public static void printCategories() {
        	  System.out.println("===Supermarket Categories===");
        	  System.out.println("1. Bakery");
        	  System.out.println("2. Meat and seafood");
        	  System.out.println("3. Grains");
        	  System.out.println("4. Condiments");
        	  System.out.println("5. Dairy and Eggs");
        	  System.out.println("6. Oil and Fat");
        	  System.out.println("7. Fruits and Vegtables");
        	  System.out.println("8. Snacks");
        	  System.out.println("9. Cleaning Products");
        	  System.out.println("10. personal Care");
          }
          public static void printCategory(int categoryNumber) {

        	  switch (categoryNumber) {
        	  case 1:
        		  printBakery();
        		  break;
        	  case 2:
        		  printMandS();
        		  break;
        	  case 3:
        		  printGrains();
        		  break;
        	  case 4:
        		  printCondiments();
        		  break;
        	  case 5:
        		  printDandE();
        		  break;
        	  case 6:
        		  printOandF();
        		  break;
        	  case 7:
        		  printFandV();
        		  break;
        	  case 8:
        		  printSnacks();
        		  break;
        	  case 9:
        		  printCleaninproducts();
        		  break;
        	  case 10:
        		  printPersonalcare();
        		  break;
        	  default:
        		  System.out.println("invalid category number");}
        	  }
        	  public static void printBakery() {
        		  System.out.println("=========================================");
        		  System.out.println("Wheat bread: 99.68 EGP per loaf "
        				+ "\n" + "Tortillas: 116.02 EGP per pack"
        				+ "\n" + "Croissants: 66.16 EGP each"
        				+ "\n" + "Baguette: 82.65 EGP each");
        		  System.out.println("=========================================");
        		  }
        	  public static void printMandS() {
        		  System.out.println("=========================================");
        		  System.out.println("Chicken: 165.07 EGP per pound"
          				+ "\n" + "Turkey: 99.07 EGP per pound"
          				+ "\n" + "Salmon: 329.84 EGP per pound"
          				+ "\n" + "Mackerel: 230.34 EGP per pound");
        		  System.out.println("=========================================");
    		  }
        	  public static void printGrains() {
        		  System.out.println("=========================================");
        		  System.out.println("Rice: 99.68 EGP per pound"
          				+ "\n" + "Pasta: 66.16 EGP per pack"
          				+ "\n" + "Oats: 132.32 EGP per container"
          				+ "\n" + "Whole-grain cereal: 148.81 EGP per box");
        		  System.out.println("=========================================");
    		  }
        	  public static void printCondiments() {
        		  System.out.println("=========================================");
        		  System.out.println("Ketchup: 82.65 EGP per bottle"
          				+ "\n" + "Mustard: 66.16 EGP per bottle"
          				+ "\n" + "Mayonnaise: 115.82 EGP per jar"
          				+ "\n" + "Salad dressings: 132.32 EGP per bottle");
        		  System.out.println("=========================================");
    		  }
        	  public static void printDandE() {
        		  System.out.println("========================================="); 
        		  System.out.println("Milk: 115.82 EGP per gallon"
            				+ "\n" + "Cheese: 165.07 EGP per block"
            				+ "\n" + "Yogurt: 66.16 EGP per container"
            				+ "\n" + "Eggs: 99.07 EGP per dozen");
        		  System.out.println("=========================================");
    		  }
        	  public static void printOandF() {
        		  System.out.println("=========================================");
        		  System.out.println("Olive oil: 231.64 EGP per bottle"
            				+ "\n" + "Vegetable oil: 99.07 EGP per bottle"
            				+ "\n" + "Butter: 132.32 EGP per pound"
            				);
        		  System.out.println("=========================================");
    		  }
        	  public static void printFandV() {
        		  System.out.println("=========================================");
        		  System.out.println("Apples: 66.16 EGP per kg"
            				+ "\n" + "Bananas: 22.70 EGP per kg"
            				+ "\n" + "Oranges: 49.48 EGP per kg"
            				+ "\n" + "Lettuce: 66.16 EGP per head"
            				+ "\n" + "Tomatoes: 82.65 EGP per kg"
            				+ "\n" + "Carrots: 49.48 EGP per kg"
            				+ "\n" + "Basil: 66.16 EGP per bunch"
            				+ "\n" + "Cilantro: 33.08 EGP per bunch"
            				+ "\n" + "Parsley: 49.48 EGP per bunch"
            				+ "\n" + "Potatoes: 99.07 EGP per kg"
            				+ "\n" + "Bell peppers: 66.16 EGP per kg");
        		  System.out.println("=========================================");
    		  }
        	  public static void printSnacks() {
        		  System.out.println("=========================================");
        		  System.out.println("Chips: 116.02 EGP per bag"
            				+ "\n" + "Cookies: 99.07 EGP per pack"
            				+ "\n" + "Soda: 66.16 EGP per bottle/can"
            				+ "\n" + "Water: 49.48 EGP per bottle");
        		  System.out.println("=========================================");
    		  }
        	  public static void printCleaninproducts() {
        		  System.out.println("=========================================");
        		  System.out.println("Dish soap: 99.07 EGP per bottle"
            				+ "\n" + "Laundry detergent: 231.64 EGP per bottle");
        		  System.out.println("=========================================");
    		  }
        	  public static void printPersonalcare() {
        		  System.out.println("=========================================");
        		  System.out.println("Shampoo: 165.07 EGP per bottle"
            				+ "\n" + "Toothpaste: 82.65 EGP per tube"
            				+ "\n" + "Toilet paper: 231.64 EGP per pack"
            				+ "\n" + "Paper towels: 132.32 EGP per roll");
        		  System.out.println("=========================================");
    		  }
}

        	  
          
          
