public class Main {

    public static void main(String[] args) {

        // Switch between CentralResource1, CentralResource2, CentralResource3
        final CentralResource1 resource = new CentralResource1();

        Thread microServiceA = new Thread(() -> {
            while (true) {
                String data = resource.getData("Thread A");
                System.out.println(data);

                try {Thread.sleep(1000);}
                catch (InterruptedException ex) {ex.printStackTrace();}
            }
        });

        Thread microServiceB = new Thread(() -> {
            while (true) {
                String data = resource.getData("Thread B");
                System.out.println(data);

                try {Thread.sleep(1500);}
                catch (InterruptedException ex) {ex.printStackTrace();}
            }
        });

        microServiceA.start();
        microServiceB.start();
    }

}
