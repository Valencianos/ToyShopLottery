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
        return "id = " + id + ", name = " + name + ", quantity = " + qty + ", frequency = " + freq;
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
    public float getFreq(){
        return freq;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public void setFreq(float freq){
        this.freq = freq;
    }
}
