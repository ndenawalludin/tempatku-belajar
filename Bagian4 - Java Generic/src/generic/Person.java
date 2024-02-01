package generic;
import java.util.Objects;

/**
 * Person
 */
public class Person implements Comparable<Person>{

    private String name;
    private String address;


    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }
    
    @Override
    public int compareTo(Person o){
        return this.name.compareTo(o.name);
    }
    
}