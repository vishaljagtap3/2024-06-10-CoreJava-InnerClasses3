public class Message {
    private int id;
    private String body;

    public Message(int id, String body) {
        this.id = id;
        this.body = body;
    }

    public void send() {
        class Date {
            int day, month, year;

            public Date(int day, int month, int year) {
                this.day = day;
                this.month = month;
                this.year = year;
            }

            @Override
            public String toString() {
                return day + "-" + month + "-" + year;
            }
        }

        System.out.println("Sending...");
        System.out.println(body);
        System.out.println("Message sent on " + new Date(5, 7, 2024));
    }

    public Object verify() {

        int local = 100;
        int i = 10;

        //method local inner class is using the local variable of the method
        class Verifier {
            public void verify(int id) {
                //local++; //will not work as local is final
                System.out.println("Verifying: " + id + " local = " + local);
            }

            @Override
            public String toString() {
                return "verifier local = " + local;
            }
        }

        i++;

        Verifier verifier = new Verifier();
        verifier.verify(id);

        return verifier;
    }
}
