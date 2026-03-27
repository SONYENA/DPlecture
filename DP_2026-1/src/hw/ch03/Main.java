public class Main {
    public static void main(String[] args) {

        //3-1 기본테스트
        System.out.println("**기본 테스트**");
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello");
        d1.display();
        d2.display();

        //3-2 반복 횟수 제어
        System.out.println("\n**반복 횟수 제어 테스트**");
        AbstractDisplay d3 = new CharDisplay('X', 3);
        AbstractDisplay d4 = new StringDisplay("Test", 7);
        d3.display();
        d4.display();

        //3-3 새로운 Display
        System.out.println("\n**NumberDisplay 테스트**");
        AbstractDisplay num = new NumberDisplay(42, 4);
        num.display();
    }
}
