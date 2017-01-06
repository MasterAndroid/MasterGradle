package com.roger.gradle;

/**
 * Created by liren on 05/01/2017.
 */

public class MyPluginExtension {
    String javaSrcDir // java源码的目录
    String classesOutDir // 编译输出的class文件目录

    String outputFileDir // 输出的jar包目录
    String outputFileName // 输出的jar包文件名

    String androidJarDir
    String javaBase
    String javaRt

    String proguardConfigFile
}
