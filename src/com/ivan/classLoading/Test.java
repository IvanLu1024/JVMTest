package com.ivan.classLoading;

/**
 * <clinit>() 方法具有以下特点：

 是由编译器自动收集类中所有类变量的赋值动作和静态语句块中的语句合并产生的，
 编译器收集的顺序由语句在源文件中出现的顺序决定。

 特别注意的是，静态语句块只能访问到定义在它之前的类变量，
 定义在它之后的类变量只能赋值，不能访问。
 *
 * Created by Ivan Lu on 2018/9/12.
 */
public class Test {

    static {
        i=0;                    //给变量赋值可以正常编译通过
        //System.out.println(i);  //不能访问，“非法向前引用”
    }
    static int i=1;
}
