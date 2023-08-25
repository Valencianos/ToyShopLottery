package ToyShopModules;

public class Toys {
    protected String name;
    protected int id, qty;
    protected float freq;

    public Toys(int id, String name, int qty, float freq) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.freq = freq;
    }

    public String toString(){
        return "name = " + name + ", quantity = " + qty;
    }
    public String getName(){
        return name;
    }
    public int getId() {
        return id;
    }
    public int getQty(){
        return qty;
        }
    public float getFreq(){ return freq; }
}
