import pizzageneratorproject.DeluxPizza;
import pizzageneratorproject.Pizza;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        Pizza basePizza = new Pizza(true);
//                basePizza.addExtraToppings();
//               basePizza.addExtraCheese();
//              basePizza.takeAway();
//                basePizza.getBill();
        DeluxPizza dp = new DeluxPizza(false);
        dp.takeAway();

        dp.getBill();
    }
}