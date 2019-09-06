package com.flin.spring.java.thread;

import java.util.concurrent.*;

/**
 * @author F_lin
 * @since 2019/4/8
 **/
public class AQSTests {

    public static void main(String[] args) throws InterruptedException {
        //countDownLatchTest1();
        cyclicBarrierTest();
    }


    private static void countDownLatchTest1() throws InterruptedException {
        int threadCount = 100;
        // 创建一个具有固定线程数量的线程池对象（如果这里线程池的线程数量给太少的话你会发现执行的很慢）
        ExecutorService threadPool = Executors.newFixedThreadPool(60);
        final CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        for (int i = 0; i < threadCount; i++) {
            final int threadnum = i;
            threadPool.execute(() -> {// Lambda 表达式的运用
                try {
                    test1(threadnum);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();// 表示一个请求已经被完成
                }

            });
        }
        countDownLatch.await();
        threadPool.shutdown();
        System.out.println("finish");
    }


    public static void test1(int threadnum) throws InterruptedException {
        Thread.sleep(1000);// 模拟请求的耗时操作
        System.out.println("threadnum:" + threadnum);
        Thread.sleep(1000);// 模拟请求的耗时操作
    }

    private static void cyclicBarrierTest() {
        int threadNum = 100;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10);

        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < threadNum; i++) {
            int threadIndex = i;
            threadPool.execute(() -> {
                System.out.println("threadnum: 【 " + threadIndex + " 】 is ready");
                try {
                    //通知 CyclicBarrier 该线程已就绪
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println("threadnum: 【 " + threadIndex + " 】 is finish");
            });
        }

        threadPool.shutdown();
    }

}
