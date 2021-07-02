package r2;

public class SmartPhone {

    private float price;
    private String name;
    private String model;
    private String processor;

    public SmartPhone(float price,String name, String model, String processor){
        this.price = price;
        this.name = name;
        this.model = model;
        this.processor = processor;
    }

    public float getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
    public String getModel(){
        return model;
    }

    protected static int stock = 0;

    public static void restock(int newStock){
        stock += newStock;
    }

    public static void minusStock(){
        stock--;
    }

    public static int getStock(){
        return stock;
    }
}

