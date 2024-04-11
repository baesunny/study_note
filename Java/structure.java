// 클래스 선언
public class MyClass {
    // 변수 선언
    int num1;
    Message msg;

    // 메서드
    public void printName(String name) {
        ...
    }

    // 메서드
    public Message getMessage() {
        ...
    }

    // 메인 메서드
    public static void main(String[] args) {
        // 클래스 인스턴스 생성
        MyClass mc = new MyClass();
        ...
    }
}



// 1) 클래스 (Class)
// > 객체 지향 프로그램의 기본 구조로, 자바의 모든 프로그램 소스는 클래스 단위로 시작한다.
// 코드 예제에서 MyClass는 객체 생성을 위한 청사진 역할을 하는 클래스이다. 클래스는 데이터와 동작을 모두 캡슐화합니다.

// 2) 인스턴스(Instance)
// > 클래스로부터 생성된 객체로, 클래스는 객체를 정의한 틀이고 실제 프로그램은 인스턴스를 통해 동작한다.
// 파이썬에서 다루는 클래스, 인스턴스와 동일한 개념이다. 

// 3) 캡슐화(Encapsulation)
// > HelloWorld 클래스는 "Hello, World!"를 인쇄하는 동작을 캡슐화한다.

// 4) 상속(Inheritance) 및 다형성(Polymorphism)
// > 위의 코드에 구현되어있지는 않지만 '상속'과 '다형성'은 자바의 가장 중요한 특징으로 꼽히는 키워드이다.
// Java에서는 클래스 간의 상속을 통해 코드의 재사용성 및 유지/보수성을 향상시키며
// 동일한 이름의 메소드를 다양한 형태로 사용 가능하다.

