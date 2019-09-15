public class Ingredient {

    private String ingredientName;
    private double amount;

    public Ingredient(String name, double amount) {
        this.ingredientName = name;
        this.amount = amount;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
