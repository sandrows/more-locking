import java.util.concurrent.locks.ReentrantLock;

/**
 * Synchronized block around a lock
 */
class CentralResource3 {

    // Using a Re-entrant lock
    private final ReentrantLock lock = new ReentrantLock();

    String getData(String name){
        String data;

        try {
            lock.lock();
            System.out.println(name + " gained lock");
            data = String.valueOf(System.currentTimeMillis());

            try {Thread.sleep(1000);}
            catch (InterruptedException ex) {ex.printStackTrace();}
        }
        finally {
            lock.unlock();
        }

        return data;
    }

}
