public class Farmer extends Person implements Working {

    public Farmer() {
        super();
    }

    public Farmer( String name ) {
//        this();
        super();
        this.sName = name;
    }

    public String toString() {
        return "*** In Farmer: " + this.sName;
    }

    public void hours () {
        System.out.println ( "*** Working farmer -- working 7 days a week!!" );
    }
}