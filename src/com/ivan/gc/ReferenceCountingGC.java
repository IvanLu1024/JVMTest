package com.ivan.gc;

/**垃圾回收算法
 *      --引用计数算法
 *          描述：给对象添加一个引用计数器，当对象增加一个引用时计数器加 1，引用失效时计数器减 1。引用计数为 0 的对象可被回收。
                 两个对象出现循环引用的情况下，此时引用计数器永远不为 0，导致无法对它们进行回收。
 * Created by Ivan Lu on 2018/9/11.
 */
public class ReferenceCountingGC {
    public Object instance=null;

    public static void main(String[] args) {
        ReferenceCountingGC objectA=new ReferenceCountingGC();
        ReferenceCountingGC objectB=new ReferenceCountingGC();
        //正因为循环引用的存在，因此 Java 虚拟机不使用引用计数算法。
        objectA.instance=objectB;
        objectB.instance=objectA;


    }

}
