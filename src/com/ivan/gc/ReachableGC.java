package com.ivan.gc;

/**
 * 可达性分析算法
 *      描述：通过 GC Roots 作为起始点进行搜索，
 *          能够到达到的对象都是存活的，不可达的对象可被回收。
 *
 *      Java 虚拟机使用该算法来判断对象是否可被回收
 *      在java中的GC Roots一般包含以下内容：
 *      （1）虚拟机栈中局部变量表中引用对象；
 *      （2）本地方法栈中JNI（native方法）中引用的对象；
 *      （3）方法区中静态属性引用对象；
 *      （4）方法区中的常量引用的对象
 *
 * Created by Ivan Lu on 2018/9/11.
 */
public class ReachableGC {
}
