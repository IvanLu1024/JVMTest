package com.ivan.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * Created by Ivan Lu on 2018/9/11.
 */
public class ReferenceDemo {

    public static void main(String[] args) {
        //1.强引用类型
        Object object=new Object();

        //2.软引用类型--只有在内存不够的情况下才会被回收
        SoftReference<Object> sf=new SoftReference<Object>(object);

        //3.弱引用类型--关联的对象一定会被回收，也就是说它只能存活到下一次垃圾回收之前
        WeakReference<Object> wf=new WeakReference<Object>(object);


        //4.虚引用类型--又称幽灵引用或幻影引用，唯一目的就是能在这个对象被回收时收到一个系统通知
        Object obj=new Object();
        //PhantomReference<Object> pf=new PhantomReference<Object>(obj);
        obj=null;


    }
}
