package cocubes;

public   class Test4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  FoodFactory myFoods = new FoodFactory();
	        Food food1 = myFoods.getFood("FastFood");
	        Food food2 = myFoods.getFood("Fruit");	
	        System.out.println("My name is: " + food1.getClass().getName());
	        System.out.println("My name is: " + food2.getClass().getName());
	        System.out.println("Our superclass is: " 
	                            + food1.getClass().getSuperclass().getName());
	        food1.serveFood();
	        food2.serveFood();
	}


	    
	}

class FoodFactory extends Food {

	

	public Food getFood(String string) {
		Food fc=new Food();
		
		
		return fc  ;
	}

}


class Food {

	
	public void serveFood() {
		
		System.out.println("I'm serving "+getClass());
	}}
	
	