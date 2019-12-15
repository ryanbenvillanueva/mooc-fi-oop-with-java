
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    @Override
    public boolean equals(Object other) {
        if (other == null || (this.getClass() != other.getClass())) {
            return false;
        }
        
        Bird otherBird = (Bird) other;
        
        return this.latinName.equals(otherBird.latinName) && this.ringingYear == otherBird.ringingYear;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (this.latinName != null ? this.latinName.hashCode() : 0);
        hash = 17 * hash + this.ringingYear;
        return hash;
    }
}


