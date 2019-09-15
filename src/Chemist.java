import java.util.Scanner;

/**
 * Zdefiniuj klasę Chemist, która posiada metodę createProduct, która tworzy produkt z dowolną ilością składników podanych przez użytkownika.
 * W wyniku metoda powinna zwracać obiekt typu Product z informacjami o składnikach danego produktu.
 * Każdy składnik w klasie Product powinien być reprezentowany przez klasę Ingredient, która przechowuje nazwę oraz ilość danego składnika.
 * Dane wczytaj od użytkownika korzystającego z aplikacji.
 *
 * Klasa Chemik powinna także posiadać metodę printProduct, która przyjmuje jako parametr obiekt typu Product i wyświetla o nim informacje.
 */
public class Chemist {

    public static void main(String[] args) {
        Product product = createProduct();
        Chemist.printProduct(product);
    }

    private static Scanner scan = new Scanner(System.in);


    public static Product createProduct(){
        System.out.println("Podaj ilość składnikow");
        int ingredientNumber = scan.nextInt();
        scan.nextLine();

        Ingredient[] ingredients = new Ingredient[ingredientNumber];
        for(int i=0; i<ingredientNumber; i++){
            ingredients[i] = createIngredient();
        }

        return new Product(ingredients);
    }

    public static Ingredient createIngredient(){
        System.out.println("Wprowadź nazwę składnika");
        String ingredientName = scan.nextLine();
        System.out.println("Wprowadź zawartość składnika");
        double amount = scan.nextDouble();
        scan.nextLine();

        return new Ingredient(ingredientName, amount);
    }

    public static void printProduct(Product product){
        Ingredient[] ingredients = product.getIngredients();
        System.out.printf("Produkt składa się z %d składników:\n", ingredients.length);
        for(Ingredient ingredient:ingredients){
            System.out.printf("-%s w ilości %.0f\n", ingredient.getIngredientName(), ingredient.getAmount());
        }

    }
}
