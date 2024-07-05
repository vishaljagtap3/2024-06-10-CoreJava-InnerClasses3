public class Printer extends Machine{

    @Override
    void start() {
        System.out.println("Printer started");
    }

    @Override
    void work(String job) {
        System.out.println("Printer completed " + job);
    }

    @Override
    void stop() {
        System.out.println("Printer stopped");
    }
}
