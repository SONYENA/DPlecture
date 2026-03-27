/**
 * 충전기 인터페이스
 * - 모든 전자기기가 공통으로 사용하는 인터페이스
 * - charge() 메서드를 반드시 구현해야 한다는 약속
 *
 * [핵심 포인트]
 * KoreanOutlet은 provide()를 쓰고,
 * 전자기기는 charge()를 원함 → 이 둘을 연결해주는 게 Adapter!
 */
public interface Charger {
    public int charge();
}
