package com.demo;

import java.math.BigDecimal;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyClass1 {

	@Override
	public String toString() {

		String str1 = "ABC";

		// TODO Auto-generated method stub
		String s = String.format("string2=%s and %s", string2, str1);
		return s;
	}

	{
		System.out.println("hello1!");
	}

	private static String string2 = "string2";

	static {
		System.out.println("hello2!");
		MyClass1.string2 = "string2 init done";
	}

	private String string1 = "abc";

	/**
	 * @author QiuZidane
	 *         <h2>MyClass1的构造方法</h2>
	 * @param int1
	 *            TODO
	 * 
	 * @see <a href="www.baidu.com">BaiDu一下</a>
	 */
	MyClass1(String initString, int int1) {

		this.string1 = "ddd";

	}

	// 构造方法 -> 等同于 public static MyClass1() 或者 MyClass1()
	public MyClass1() {
		// TODO Auto-generated constructor stub
	}

	protected void about_array() {
		int[] intarr1 = new int[10];
		intarr1[0] = 1;
		System.out.println(Arrays.toString(intarr1));

		String[] strarr1 = new String[10];
		for (int i = 0; i < strarr1.length; i++) {
			strarr1[i] = "哈哈";
		}

		System.out.println(Arrays.toString(strarr1));

		String[] strarr2 = Arrays.copyOf(strarr1, 5);
		System.out.println(Arrays.toString(strarr2));

		// int[] intarr2 = Arrays.copyOf(intarr1, 5);
		int[] intarr2 = intarr1.clone();
		System.out.println(Arrays.toString(intarr2));
	}

	/**
	 * 用于测试字符串相关知识点
	 */
	private void about_string() {

		System.out.println("string1 = " + this.string1);
		String formatString = String.format("string1 = %s", this.string1);
		System.out.println(formatString);

		StringBuffer sb1 = new StringBuffer("StringBuffer=");
		sb1.append("aaa");
		sb1.append(" bbb");
		sb1.append('d');
		System.out.println(sb1);

		StringBuilder sbu1 = new StringBuilder("StringBuilder=");
		sbu1.append("123");
		sbu1.append(" ddd");
		sbu1.delete(1, 3);
		System.out.println(sbu1);

	}

	/**
	 * 
	 * @param datestr
	 *            日期
	 */
	public void about_date() {
		Date myDate = new Date();
		// Date myDate2 = new Date(99, 2, 2);

		// 使用toString()函数显示日期时间
		System.out.println(myDate.toString());
		// System.out.println(myDate2.getTime());

		Date myDate3 = new Date(990304000000l);

		System.out.println(myDate3.toString());
		// System.out.println(myDate.before(myDate2));

		try {
			long begin = System.currentTimeMillis();

			Thread.sleep(10);

			long end = System.currentTimeMillis();

			System.out.println(end - begin);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		GregorianCalendar now = new GregorianCalendar();
		System.out.println("gregor=" + now);
		int month = now.get(Calendar.MONTH) + 1;
		System.out.println("month = " + month);

		System.out.println(DateFormatSymbols.getInstance().getShortWeekdays()[Calendar.DATE]);
		System.out.println(Calendar.DATE);

	}

	private void about_decimal() {

		BigDecimal bd1 = new BigDecimal(2.0);
		BigDecimal bd2 = new BigDecimal(1.1);
		BigDecimal bd3 = bd1.subtract(bd2);
		System.out.println("bd1=" + bd1);
		System.out.println("bd2=" + bd2);
		System.out.println(bd3);

		BigDecimal a = BigDecimal.valueOf((long) 2.0);
		BigDecimal b = BigDecimal.valueOf((long) 1.1);
		System.out.println("a-b=" + a.subtract(b));

	}

	public static void main(String... args) {

		MyClass1 mc1 = new MyClass1("abc", 123);

		// mc1.about_array();
		// mc1.about_string();
		// mc1.about_date();
		// mc1.about_decimal();
		// mc1.about_array();

		// System.out.println(mc1.toString());
		//
		// Random r = new Random();
		// System.out.println(r.nextDouble());

	}

}
