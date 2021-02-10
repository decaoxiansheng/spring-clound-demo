# euraka-demo

一、绑定host
~~~~
127.0.0.1 eureka1
127.0.0.1 eureka2
127.0.0.1 eureka3
~~~~
二、服务中心
~~~~
打包后 启动服务集群（指定使用的配置文件）
java -jar eureka-server-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=eureka1
java -jar eureka-server-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=eureka2
java -jar eureka-server-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=eureka3
浏览器输入以下地址进入管理界面
http://eureka1:8081/
~~~~
三、服务端
~~~~
打包后 启动服务 （指定使用的配置文件）
java -jar provider-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=provider1
java -jar provider-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=provider1
浏览器输入以下地址进入管理界面 查看服务提供者情况
http://eureka1:8081/
~~~~
四、消费者
~~~~
浏览器输入以下地址进入管理界面 查看服务消费者情况
http://eureka1:8081/
浏览器输入以下地址查看服务响应情况，不断刷新重试
http://localhost:9000/hello
~~~~

