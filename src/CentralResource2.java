/**
 * Synchronized block around a lock
 */
class CentralResource2 {

    synchronized String getData(String name) {
        // Whole object method is now synchronous
        System.out.println(name + " gained lock");
        String data = String.valueOf(System.currentTimeMillis());

        try {Thread.sleep(1000);}
        catch (InterruptedException ex) {ex.printStackTrace();}

        return data;
    }

}
