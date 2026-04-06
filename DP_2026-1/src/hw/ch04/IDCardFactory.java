import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private List<Product> database = new ArrayList<>();
    private int serial = 100;
    private String baseDate;

    public IDCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++, baseDate);
    }

    @Override
    protected void registerProduct(Product product) {
        database.add(product);
        System.out.println(product + "을 등록했습니다.");
    }
}
