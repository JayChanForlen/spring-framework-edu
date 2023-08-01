package com.stu.common;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: CommonConfig
 * @Author: JayChan
 * @Date: 2023/8/1 19:39
 * @Description: No description
 */

public class CommonConfig {

	public static class Shared{
		/**
		 * 由于IOC容器加载BEAN_FACTORY_POST_PROCESS时使用的时单线程，因此增加参数来获取多个后置处理器调用顺序
		 */
		public volatile static int BEAN_FACTORY_POST_PROCESS_ORDER = 1;
	}

}
