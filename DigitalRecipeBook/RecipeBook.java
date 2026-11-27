import java.util.ArrayList;

/**
 * Write a description of class RecipeBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecipeBook
{
    ArrayList<Recipe> recipes = new ArrayList<>();
    
    public void addRecipe(Recipe r) {
        
    }
    
    public void removeRecipe(Recipe r) {
        
    }
    
    public void listAll() {
        
    }
    
    public void listByType(String type) {
        
    }
    
    public ArrayList<Recipe> searchByTitle(String title) {
        return null;
    }
    
    // We use String for parameter because..
    public ArrayList<Recipe> searchByIngredient(String name) {
        return null;
    }
    
    public ArrayList<Recipe> searchByTag(Tag tag) {
        return null;
    }
}