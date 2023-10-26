import java.util.ArrayList;
public class Invoice extends Base
 {
    int id;
    private ArrayList<Product> products;
    public Invoice(int i)
    {
        super(i);
        products = new ArrayList<Product>();
    }
    public void addProduct(Product a)
    {
        products.add(a);
    }
    public double getTotalCost()
    {
        double cost =0;
        for(Product a:products)
        {
            cost+= a.cost;

        }
        return cost;
    }

    
}
