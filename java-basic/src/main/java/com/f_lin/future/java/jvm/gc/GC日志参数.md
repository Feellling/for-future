1）查看GC基本信息，在JDK 9之前使用-XX：+PrintGC，JDK 9后使用-Xlog：gc
2）查看GC详细信息，在JDK 9之前使用-XX：+PrintGCDetails，在JDK 9之后使用-Xlog:gc*
3）查看GC前后的堆、方法区可用容量变化，在JDK 9之前使用-XX：+PrintHeapAtGC，JDK 9之 后使用-Xlog:gc+heap=debug
4）查看GC过程中用户线程并发时间以及停顿的时间，在JDK 9之前使用-XX：+Print- GCApplicationConcurrentTime以及-XX:+PrintGCApplicationStoppedTime，JDK 9之后使用-Xlog:safepoint
5）查看收集器Ergonomics机制（自动设置堆空间各分代区域大小、收集目标等内容，从Parallel收 集器开始支持）自动调节的相关信息。在JDK 9之前使用-XX：+PrintAdaptive-SizePolicy，JDK 9之后 使用-Xlog:gc+ergo*=trace
6）查看熬过收集后剩余对象的年龄分布信息，在JDK 9前使用-XX：+PrintTenuring-Distribution， JDK 9之后使用-Xlog:gc+age=trace  




![cms](./image/日志参数1.png)
![cms](./image/日志参数2.png)
![cms](./image/gc参数1.png)
![cms](./image/gc参数2.png)