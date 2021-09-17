package com.gejian.geektime.strategy.filesort;

import com.gejian.geektime.strategy.filesort.strategy.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yixiqiuyu
 * @description: 根据文件大小不同来决定使用什么排序算法来排序
 * @date 2021/9/8 10:26
 */
public class Sorter {
    private static final long GB = 1000 * 1000 * 1000;



    /*
        // 原始版本
       public void sortFile(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();
        if (fileSize < 6 * GB) {
            quickSort(filePath);
        } else if (fileSize < 10 * GB) {
            externalSort(filePath);
        } else if (fileSize < 100 * GB) {
            concurrentExternalSort(filePath);
        } else {
            mapReduceSort(filePath);
        }
    }

    private void quickSort(String filePath) {
        // 快速排序
    }

    private void externalSort(String filePath) {
        // 外部排序
    }

    private void concurrentExternalSort(String filePath) {
        // 多线程外部排序
    }

    private void mapReduceSort(String filePath) {
        // 利用MapReduce多机排序
    }*/

    /**
     * 第一版优化后的，将排序算法单独拆分出来，再根据文件类型来决定使用
     * 哪个算法
     * @param filePath
     */
    /*public void sortFile(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg;
        if (fileSize < 6 * GB) {
            sortAlg = new QuickSort();
        } else if (fileSize < 10 * GB) {
            sortAlg = new ExternalSort();
        } else if (fileSize < 100 * GB) {
            sortAlg = new ConCurrentExternalSort();
        } else {
            sortAlg = new MapReduceSort();
        }
        sortAlg.sort(filePath);
    }*/


}
