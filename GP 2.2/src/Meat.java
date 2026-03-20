/*
Jessica Willis
3/14/26
gp 2.2
*/

public class Meat extends Food{
    private String source;

    public Meat(String name, String servingSize, String source) {
        super(name, servingSize);
        this.source = source;
    }
    

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return String.format(
            "%sSource Descrption: %s%n",
            super.toString(), source);
    }

}
