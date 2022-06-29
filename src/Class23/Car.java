package Class23;

public abstract class Car {

    void start() {
        System.out.println("use keys to start engine");
    }
    void stop(){
        System.out.println("parks manually");
    }

    abstract void park();
}
class BMW extends Car{
    @Override
    void start(){
        System.out.println("push start button to start engine");
    }
    @Override
    void stop(){
        System.out.println("use auto breaking or manual brakes to stop");
    }
    @Override
    void park(){
        System.out.println("self parking");
}}
class Tesla extends Car{
    @Override
    void start(){
        System.out.println("you can start me from app");
    }
    @Override
    void stop(){
        System.out.println("use auto breaking to stop");
    }
    @Override
    void park(){
        System.out.println("Self parking");
    }
}
    class Toyota extends Car{
        @Override
        void start(){
            System.out.println("push start button to start engine");
        }
        @Override
        void stop() {
            System.out.println("press brakes to stop");
        }
        @Override
        void park() {
            System.out.println("manual parking");
        }
    }
