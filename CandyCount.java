class CoundyCount {
    private double _money;
    private double _price;
    private int _candies;

    public CoundyCount(double money, double price, int candies) {
        this._money = money;
        this._price = price;
        this._candies = candies;
    }

    public int get_candies() {
        return _candies;
    }

    public void set_candies(int _candies) {
        this._candies = _candies;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public double get_money() {
        return _money;
    }

    public void set_money(double _money) {
        this._money = _money;
    }

    public static void main(String[] args) {

        CoundyCount coundyCount = new CoundyCount(12.4, 1.2, 0);

        if (coundyCount.get_money() > 0 && coundyCount.get_price() > 0) {
            while ((coundyCount.get_money() - coundyCount.get_price()) >= 0) {
                coundyCount.set_candies(coundyCount.get_candies() + 1);
                coundyCount.set_money(coundyCount.get_money() - coundyCount.get_price());
            }
        }
        
        System.out.println(coundyCount.get_candies());
    }
}