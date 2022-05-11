package prac4;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MyExecutor implements ExecutorService {
    ExecutorService executor;

    public MyExecutor(int threadNums) {
        this.executor = Executors.newFixedThreadPool(threadNums);
    }//конструктор
    //методы интерфейся executor
    public void shutdown() {
        this.executor.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.executor.shutdownNow();
    }

    public boolean isShutdown() {
        return this.executor.isShutdown();
    }

    public boolean isTerminated() {
        return this.executor.isTerminated();
    }

    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return this.executor.awaitTermination(timeout, unit);
    }

    public <T> Future<T> submit(Callable<T> task) {
        return this.executor.submit(task);
    }

    public <T> Future<T> submit(Runnable task, T result) {
        return this.executor.submit(task, result);
    }

    public Future<?> submit(Runnable task) {
        return this.executor.submit(task);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return this.executor.invokeAll(tasks);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return this.executor.invokeAll(tasks, timeout, unit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        return this.executor.invokeAny(tasks);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.executor.invokeAny(tasks, timeout, unit);
    }

    public void execute(Runnable command) {
        this.executor.execute(command);
    }
}