package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorEx2 {
    public static void main(String[] args) {
        Runnable runnable1=()-> System.out.println("process1 running");
        Runnable runnable12=()-> {
            for (int i=0;i<20;i++)
                System.out.println("process12 running");
        };
        Runnable runnable2=()-> System.out.println("process2 running");
        Runnable runnable3=()-> System.out.println("process3 running");

        ExecutorService service= Executors.newFixedThreadPool(10);

        service.execute(runnable1);
        service.execute(runnable12);

        service.execute(runnable2);
        service.execute(runnable3);

    }
}
