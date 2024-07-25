 package app;



public class CalcCostBase {


    public double calcCost(Product product) {
        return Product.getQuota() * product.getPrice() ;
    }
}
