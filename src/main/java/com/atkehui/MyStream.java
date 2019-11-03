package com.atkehui;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author eternity
 * @create 2019-10-31 19:22
 */

/**
 * 1.Stream关注的是对数据的运算，与CPU相关
 * 集合关注的是数据的存储，与内存相关
 *
 * 2.
 * Stream 自己不会存储元素
 * Stream 不会改变源对象，相反，他们会返回一个持有结果的新Stream。
 * Stream操作是延迟执行的。意味着他们会等到需要结果时才执行
 *
 * 3、Stream执行流程
 * Stream的实例化
 * 一系列的中间操作（过滤、映射）
 * 终止操作
 *
 * 4.说明：
 * 一个中间操作链。对数据源的数据进行处理
 * 一旦执行终止操作，就执行中间操作链，并产生结果。之后，不会再被使用
 *
 */
public class MyStream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c");
        list.stream().forEach(System.out::println);
        System.out.println();
        list.forEach(System.out::println);
    }
}
