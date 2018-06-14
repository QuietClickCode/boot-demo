package com.example.demo.hadoop.job;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

/**
 * 远程读取hdfs上的文件
 * @author zwq
 * @date 2018/6/14 15:55
 */
public class CatDemoRead {
    public static void main(String[] args) {
        System.setProperty("hadoop.home.dir", "D:\\Tools\\hadoop-2.8.0");
        Configuration conf = new Configuration();
        //设置存储服务器的用户名，密码
        conf.set("hadoop.job.ugi", "admin,admin");
        conf.set("fs.hdfs.impl",org.apache.hadoop.hdfs.DistributedFileSystem.class.getName());
        String uri = "hdfs://192.168.2.48:9000/input/test.input";

        FSDataInputStream in = null;
        try {

            //得到文件系统的实例
            FileSystem fs = FileSystem.get(URI.create(uri), conf); //URI.create(uri)要创建

            //通过FileSystem的open方法打开一个指定的文件
            in = fs.open(new Path(uri));

            //将InputStream中的内容通过IOUtils的copyBytes方法拷贝到System.out中
            IOUtils.copyBytes(in, System.out, 4096, false);

            //seek到position 1
            in.seek(1);

            //在执行一边拷贝输出工作
            IOUtils.copyBytes(in, System.out, 4096, false);

        } catch (Exception ex) {
            System.out.println(ex);

        } finally {
            IOUtils.closeStream(in);
        }

    }
}
