import java.util.ArrayList;
import java.util.List;

public class LicenseCardFactory extends Factory {

    private List<Product> database = new ArrayList<>();
    private int licenseCounter = 100;
    private String baseDate;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected Product createProduct(String owner) {
        // 만료일: 발급일로부터 5년 후 (간단하게 연도만 +5)
        String expiryDate = (Integer.parseInt(baseDate.substring(0, 4)) + 5)
                + baseDate.substring(4);
        return new LicenseCard(owner, licenseCounter++, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        database.add(product);
        System.out.println(product + " 을 등록했습니다.");
    }
}
