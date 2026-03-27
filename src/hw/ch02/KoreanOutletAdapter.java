public class KoreanOutletAdapter implements Charger {

    // KoreanOutlet을 내부적으로 포함
    private KoreanOutlet outlet;

    public KoreanOutletAdapter(KoreanOutlet outlet) {
        this.outlet = outlet;
    }

    // Charger 인터페이스 구현
    @Override
    public int charge() {
        return outlet.provide(); // KoreanOutlet의 provide() → charge() 로 변환!
    }
}
