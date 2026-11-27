
/**
 * Enumeration class Unit - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Unit
{
    GRAM("g"),
    ML("ml"),
    CUP("cup"),
    TBSP("tbsp"),
    TSP("tsp"),
    PIECE("pc");
    
    private String symbol;
    
    Unit(String symbol) {
        this.symbol = symbol;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public String toString() {
        return symbol;
    }
}