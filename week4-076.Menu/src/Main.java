
public class Main {
    public static void main(String[] args) {
        Menu exactum = new Menu();
        
        exactum.addMeal("Hamburger");
        exactum.addMeal("Fish'n'Chips");
        exactum.addMeal("Sauerkraut");
        exactum.printMeals();
        exactum.clearMenu();
        exactum.printMeals();
        
    }
}
