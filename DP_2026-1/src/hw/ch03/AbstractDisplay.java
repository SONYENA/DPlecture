public abstract class AbstractDisplay {

    private int repeatCount;

    public AbstractDisplay() {
        this.repeatCount = 5;
    }

    // 반복 횟수를 인자로 받도록 확장
    public AbstractDisplay(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    public abstract void open();
    public abstract void print();
    public abstract void close();

    //`display()` 메서드에서 필드값을 사용
    public final void display() {
        open();
        for (int i = 0; i < repeatCount; i++) {
            print();
        }
        close();
    }
}
