package com.gejian.geektime.strategy.filesort.strategy;

/**
 * @author yixiqiuyu
 * @description:
 * @date 2021/9/10 14:48
 */
public interface ISortAlg {
    /**
     * 排序逻辑
     * @param filePath
     */
    void sort(String filePath);
}
