package SlowFlake;
// 测试方法
public class TestSnowFlake {
	//测试1秒能够生成的id个数
	public static void generateIdsInOneSecond() {
		// 创建对象实力
		 SnowFlake idWorker = new SnowFlake(1, 1);
		// 事件记录，起止时间秒
		 long start = System.currentTimeMillis();
		 int i = 0;
		// 遍历时间事件
		 for (; System.currentTimeMillis() - start <1000; i++) {
				 idWorker.nextId();
		 }
		// 遍历结束时间
		 long end = System.currentTimeMillis();
		// 输出耗时和ID个数
		 System.out.println("耗时："+ (end - start));
		 System.out.println("生成id个数："+ i);
	}
        // 主函数调用方法
	public static void main(String[] args) {
		 generateIdsInOneSecond();
}
}
