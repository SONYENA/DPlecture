/**
 * 스마트폰 클래스
 * - Charger 인터페이스만 알고 있음
 * - KoreanOutlet이 뭔지, Adapter가 뭔지 전혀 몰라도 됨
 *   → 이게 Adapter 패턴의 장점! 사용하는 쪽 코드가 단순해짐
 */
public class Smartphone {

    private Charger charger; // Charger 인터페이스 타입으로 받음

    // 어떤 Charger든 받을 수 있음 (KoreanOutletAdapter도 Charger니까 OK)
    public Smartphone(Charger charger) {
        this.charger = charger;
    }

    public void charge() {
        int voltage = charger.charge(); // charge()만 호출하면 됨
        System.out.println("스마트폰이 " + voltage + "V에서 충전합니다.");
    }
}
