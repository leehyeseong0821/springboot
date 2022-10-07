package DI_IoC;

public class Main {
    //pvsm 퍼블릭 보이드 스테틱 메인
    public static void main(String[] args) {

        ClassB classB1 = new ClassBImpl1();
        ClassB classB2 = new ClassBImpl2();

        ClassA classA = new ClassAImpl2(classB2);

        classA.logic1();
        classA.logic2();
        classA.logic3();


    }
}
