package com.gejian.geektime.strategy.filesort.strategy;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yixiqiuyu
 * @description:
 * @date 2021/9/10 17:10
 */
public class SortAlgFactory {
    private static final Map<String, ISortAlg> ALGS = new HashMap<>(16);

    static {
        ALGS.put("QuickSort",new QuickSort());
        ALGS.put("ExternalSort", new ExternalSort());
        ALGS.put("ConcurrentExternalSort", new ConCurrentExternalSort());
        ALGS.put("MapReduceSort", new MapReduceSort());
    }

    public static ISortAlg gerSortAlg(String type) {
        if (!StringUtils.hasText(type)) {
            throw new IllegalArgumentException("type can't be null");
        }
       return ALGS.get(type);
    }
}
