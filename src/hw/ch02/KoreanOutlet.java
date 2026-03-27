/**
 * 한국 표준 콘센트 클래스
 * - 수정 불가능한 기존 클래스 (외부 라이브러리라고 생각하면 됨)
 * - provide() 메서드로 220V를 제공함
 */
public class KoreanOutlet {

    // 한국 표준 전원: 220V AC
    public int provide() {
        System.out.println("한국 콘센트에서 220V AC를 제공합니다.");
        return 220; // 220V
    }
}
