/**
 * 메인 클래스 - 실제로 실행되는 곳
 *
 * 전체 흐름:
 *   KoreanOutlet (220V) → KoreanOutletAdapter → Smartphone
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== [Step 1] 한국 콘센트 Adapter로 충전 ===");

        // 1. 한국 콘센트 생성
        KoreanOutlet koreanOutlet = new KoreanOutlet();

        // 2. Adapter 생성 - 콘센트를 Charger 인터페이스에 맞게 감쌈
        Charger adapter = new KoreanOutletAdapter(koreanOutlet);

        // 3. 스마트폰에 Adapter를 전달
        Smartphone smartphone = new Smartphone(adapter);

        // 4. 충전!
        smartphone.charge();
    }
}
