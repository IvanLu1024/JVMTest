package com.ivan.classLoading;

import java.io.*;

/**
 * 自定义的类加载器的实现
 * Created by Ivan Lu on 2018/9/12.
 */
public class FileSystemClassLoader extends ClassLoader {
    private String rootDir;

    public FileSystemClassLoader(String rootDir) {
        this.rootDir = rootDir;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] classData = getClassData(name);
        if (classData==null){
            throw new ClassNotFoundException();
        }else {
            return defineClass(name,classData,0,classData.length);
        }


    }

    private byte[] getClassData(String className){
        String path = classNameToPath(className);
        try{
            InputStream ins = new FileInputStream(path);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int bufferSize=4096;
            byte[] buffer = new byte[bufferSize];
            int byteNumRead;
            while ((byteNumRead=ins.read(buffer))!=-1){
                baos.write(buffer,0,byteNumRead);
            }
            return baos.toByteArray();


        }catch (IOException e){
            e.printStackTrace();
        }
        return null;



    }

    private String classNameToPath(String className) {
        return rootDir+ File.separatorChar+className.replace('.',File.separatorChar)+".class";
    }
}
