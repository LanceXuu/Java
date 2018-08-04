//package iflytek;
//
//import com.alibaba.fastjson.JSONObject;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.*;
//
///**
// * @Author: Lance
// * @Date: 2018/7/26 15:03
// */
//public class Thead {
//
//    public void concurrentSendRequest(int sliceIndex, int sliceNumber, List<JSONObject> paramList, Map<String, JSONObject> standardResultMap) throws IOException, InterruptedException {
//        int totalCount = paramList.size();
//
//        int threadCount = totalCount / SINGLE_THREAD_EXECUTE_NUMBER;
//
//        if (totalCount % SINGLE_THREAD_EXECUTE_NUMBER > 0) {
//            threadCount += 1;
//        }
//
//        ExecutorService executor = new ThreadPoolExecutor(threadCount, threadCount,
//                0L, TimeUnit.MILLISECONDS,
//                new LinkedBlockingQueue<Runnable>());
//
//        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
//
//        for (int threadIndex = 0; threadIndex < threadCount; threadIndex++) {
//            //对list进行分片，一个线程执行一段
//            List<JSONObject> sliceList = sliceList(paramList, threadIndex, SINGLE_THREAD_EXECUTE_NUMBER);
//
//            executor.execute(new RequestTask(sliceIndex, sliceNumber, countDownLatch, sliceList));
//        }
//
//        executor.shutdown();
//
//        //阻塞主线程，当计数器值清零后，打开锁，恢复主线程
//        countDownLatch.await();
//
//        //当所有请求任务结束后，开始校对结果和标准结果的偏差
//        compareResult(equalResultFile, notEqualResultFile, concurrentMap, standardResultMap);
//    }
//
//
//}
