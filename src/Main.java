public class Main {
    public static void main(String[] args) {

        /*Printer printer = new Printer();
        printer.start();
        printer.work("Print myfile.pdf");
        printer.stop();

        //Anonymous class, Method local inner class
        Machine m1 = new Machine() {
            @Override
            void start() {
                System.out.println("My machine started");
            }

            @Override
            void work(String job) {
                System.out.println("Executing: " + job);
            }

            @Override
            void stop() {
                System.out.println("My machine stopped");
            }
        };
        m1.start();
        m1.work("my work");
        m1.stop();

        Movable mv1 = new Movable() {
            @Override
            public void move(String item) {
                System.out.println("Moved: " + item);
            }
        };
        mv1.move("Students");

        class Car implements Movable {
            @Override
            public void move(String item) {
                System.out.println("Car moved: " + item);
            }
        }

        Car c1 = new Car();
        c1.move("Passenger");*/

        Message message = new Message(101, "Assignments are due!");
        message.send();
        Object objVerifier = message.verify();
        System.out.println(objVerifier.toString());

    }
}
