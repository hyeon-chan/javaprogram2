package hard;

enum Season{
	 SPRING, SUMMER, AUTUMN, WINTER
	}

	public class ex2 {
	 public static void main(String[] args) {
	     Season currentSeason = Season.SPRING;

	     switch (currentSeason) {
	         case SPRING:
	             System.out.println("It's Spring!");
	             break;
	         case SUMMER:
	             System.out.println("It's Summer!");
	             break;
	         case AUTUMN:
	             System.out.println("It's Autumn!");
	             break;
	         case WINTER:
	             System.out.println("It's Winter!");
	             break;
	     }

	     for (Season season : Season.values()) {
	         System.out.println(season);
	     }
	 }
	}
