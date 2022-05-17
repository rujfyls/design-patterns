public class Template {
    /*
    Позволяет определить основу алгоритма и позволяющий подклассам переопределять определенные шаги алгоритма,
    не изменяя его структуру в целом.

    используется в Spring как закрытие соединений и так далее
     */
}
abstract class Car { //есть абстрактный класс, при запуске метода которого происходит выполнение двух методов последовательно
    abstract void startEngine();
    abstract void stopEngine();

    public final void start(){
        startEngine();
        stopEngine();
    }
}
class OneCar extends Car { //переопределяем эти два метода
    public void startEngine() {
        System.out.println("Start engine.");
    }
    public void stopEngine() {
        System.out.println("Stop engine.");
    }
}
class TwoCar extends Car {
    public void startEngine() {
        System.out.println("Start engine.");
    }
    public void stopEngine() {
        System.out.println("Stop engine.");
    }
}

class TemplateTest {//тест
    public static void main(String[] args) {
        //только запускаем а происходит выполнение и закрытие сразу, т.е.работа выполняется по шаблону
        Car car1 = new OneCar();
        car1.start();
        System.out.println();
        Car car2 = new TwoCar();
        car2.start();
    }
}
