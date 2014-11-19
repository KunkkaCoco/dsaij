dsaij
=====
Data Structures & Algorithms in Java


##版本高级的maven 自动编译
### 执行main方法
	#执行 com.java.Main.class  main方法
	
	mvn exec:java -Dexec.mainClass="com.maxi." -Dexec.args="arg0 arg1 arg2"
### sublime 运行
		ctrl+B
		#注意把package注释掉 
### 执行测试用例
	#Test.class中的@Test方法
	mvn test -Dtest=Test
 