/**
 * 핵심 클래스! KoreanOutlet을 Charger 인터페이스에 맞게 변환해주는 Adapter
 *
 * 실생활 비유:
 *   220V 콘센트 → [어댑터] → 스마트폰
 *   KoreanOutlet → [KoreanOutletAdapter] → Smartphone
 *
 * Adapter 패턴의 구조:
 *   1. Charger 인터페이스를 implements  → "나는 charge()를 제공할 수 있어!"
 *   2. KoreanOutlet을 내부에 포함       → 실제 전원은 여기서 가져옴
 *   3. charge()안에서 outlet.provide() 호출 → 메서드 이름을 바꿔서 연결
 *
 * [동영상 설명 포인트]
 * KoreanOutlet의 provide()와 Charger의 charge()는 이름이 달라서
 * 직접 연결이 안 돼요. KoreanOutletAdapter가 그 사이에서
 * charge()를 받아서 provide()로 바꿔 전달하는 역할을 해요.
 */
public class KoreanOutletAdapter implements Charger {

    // KoreanOutlet을 내부에 포함 (수정은 못 하지만 사용은 할 수 있음)
    private KoreanOutlet outlet;

    // 생성자: 어떤 콘센트를 쓸지 받아서 기억
    public KoreanOutletAdapter(KoreanOutlet outlet) {
        this.outlet = outlet;
    }

    /**
     * Charger 인터페이스의 charge()를 구현
     * → 내부적으로 KoreanOutlet의 provide()를 호출해서 전압을 가져옴
     * → 이게 Adapter 패턴의 핵심! 메서드 이름 불일치를 여기서 해결
     */
    @Override
    public int charge() {
        return outlet.provide(); // provide() → charge() 로 변환!
    }
}
