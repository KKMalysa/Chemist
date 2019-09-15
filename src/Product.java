public class Product {
    Ingredient[] ingredients;

    public Product(Ingredient[] ingredientsTab) {
        this.ingredients = ingredientsTab;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }
}
