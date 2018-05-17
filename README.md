spring boot+Jpa(Hibernate)

集成redis缓存服务器

整合Druid数据源

Hadoop最简单JAVA应用案列-计算单词出现数 com.example.demo.hadoop

仅用于记录学习记录

**`Hadoop完全分布式安装部署`**

        --namenode 1 / datanode 2

**注意点：**

服务器上需要有jdk安装，版本要根据安装的hadoop版本来选择

各个服务器之间需实现SSH免密码登录，具体百度之
        
为防止一些意外的错误，注意要关闭防火墙，比如上传文件失败之类的错误  

hadoop namenode -format 注意如果多次格式化会出现连接不上的错误，查看日志文件可发现原因是由于namenode多次格式化造成了namenode和datanode的clusterID不一致，每次格式化时，namenode会更新clusterID，但是datanode只会在首次格式化时确定，造成不一致现象导致错误。  

~/hadoop/etc/ 目录下需要修改较多配置文件，yarn-site.xml、hdfs-site.xml、core-site.xml、hadoop-env.sh、mapred-env.sh、yarn-env.sh、slaves、mapred-site.xml具体配置需根据实际服务器情况来配置，配置项说明具体查阅资料
注意配置时，datanode中的各项配置文件大部分与namenode中的配置相同，slaves只需配置namenode

在/etc/hosts 文件中需要添加各服务器IP以及名称


