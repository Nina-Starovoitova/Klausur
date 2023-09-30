package shawerma;

class ShawarmaItem implements ShawarmaInt{

    private  double price;
    private  String name;

    public  ShawarmaItem(double price, String name) {
    this.name = name;
    this.price = price;
}

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}

