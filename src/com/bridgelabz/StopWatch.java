package com.bridgelabz;

public class StopWatch {
    private long stopWatchStartTime = 0;
    private long stopWatchStopTime = 0;
    public void start() {
        this.stopWatchStartTime = System.currentTimeMillis();
    }
    public void stop() {
        this.stopWatchStopTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        long elapsedTime;
        elapsedTime = (stopWatchStopTime - stopWatchStartTime);
        return elapsedTime;
    }
    public static void main(String[] args) throws InterruptedException {
        StopWatch timer = new StopWatch();
        timer.start();
        Thread.sleep(5000);
        timer.stop();
        System.out.println("Elapsed time in milliseconds: " + timer.getElapsedTime());
    }
}
