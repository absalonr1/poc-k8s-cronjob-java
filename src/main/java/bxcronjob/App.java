package bxcronjob;

/**
 * docker build -t test-cron-job-datadog .
 * docker tag test-cron-job-datadog absalon1000rr/test-cron-job-datadog:v1
 * docker push absalon1000rr/test-cron-job-datadog:v1
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Runing JOB (60s) ...");
        try {
            Thread.currentThread().sleep(10000);
            System.out.println("10 segundos");
            Thread.currentThread().sleep(10000);
            System.out.println("20 segundos");
            Thread.currentThread().sleep(10000);
            System.out.println("30 segundos");
            Thread.currentThread().sleep(10000);
            System.out.println("40 segundos !!. FIN de espera");
            
            if(System.getenv("ERROR_ENV")!=null){
                System.out.println("Failing JOB !!");
                System.exit(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End JOB");
        System.exit(0);

    }
}
