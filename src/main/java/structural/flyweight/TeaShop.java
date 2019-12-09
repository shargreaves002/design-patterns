package structural.flyweight;

public class TeaShop {
    private KarakTea[] orders = new KarakTea[10];
    private TeaMaker teaMaker;

    public TeaShop(TeaMaker teaMaker){
        this.teaMaker = teaMaker;
    }

    public void takeOrder(String teaType, int table){
        this.orders[table] = this.teaMaker.make(teaType);
    }

    public void serve(){
        for (int x = 0; x < orders.length; x++) {
            if (orders[x] != null) System.out.println("Serving tea to table # " + x);
        }
    }
}
