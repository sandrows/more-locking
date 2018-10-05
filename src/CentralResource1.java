/**
 * Synchronized block around a lock
 */
class CentralResource1 {

    private final Object lock = new Object();

    // Includes a synchronous part of the method where the central resoruce is accessed.
    String getData(String name) {
        String data;

        synchronized (lock) {
            // Only stuff that needs to be synchronized to avoid unnecessary delays
            System.out.println(name + " gained lock");
            data = String.valueOf(System.currentTimeMillis());

            try {
                // To make things more clear for testing
                Thread.sleep(1000);
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        return data;
    }

}
