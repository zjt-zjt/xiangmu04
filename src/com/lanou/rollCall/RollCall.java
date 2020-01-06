package com.lanou.rollCall;

import java.util.List;
import java.util.Random;

public class RollCall {
      private List<Person> persons ;
     
	  public RollCall() {
		super();
		
	}
      
	public void initData() {
		Person wangkangjian = new Person("Íõ¿µ½¡", "ZZJ190703-25");
		Person yumanman = new Person("ÓÚÂşÂş", "ZZJ190703-26");
		Person suxiangkang = new Person("ËÕÏé¿µ", "ZZJ190703-27");
		Person huleilei = new Person("ºúÀÚÀÚ", "ZZJ190703-28");
		Person qiaoshouyuan = new Person("ÇÇÊ×Ôª", "ZZJ190703-29");
		Person luxingchen = new Person("Â¬ĞÇ³½", "ZZJ190703-30");
		Person wanjingwei = new Person("Íò¾´Î°", "ZZJ190703-31");
		Person chenxiangpeng = new Person("³ÂÏéÅô", "ZZJ190703-32");
		Person jiangshansen = new Person("½ªÉ½É­", "ZZJ190703-35");
		Person wangbo = new Person("Íõ²¨", "ZZJ190703-36");
		Person zhangjuntao = new Person("ÕÅ¿¡ÌÎ", "ZZJ190703-37");
		Person gaoxiangyu = new Person("¸ßÏîÓğ", "ZZJ190703-38");
		Person fengjun = new Person("·ë¿¡", "ZZJ190703-39");
		Person wangding = new Person("Íõ¶¦", "ZZJ190703-40");
		Person liuxiang = new Person("ÁõÏè", "ZZJ190703-41");
		Person liguang = new Person("Àî¹â", "ZZJ190703-42");
		Person fengxiangyu = new Person("·ëÏéÓî", "ZZJ190703-43");
		persons.add(wangkangjian);
		persons.add(yumanman);
		persons.add(suxiangkang);
		persons.add(huleilei);
		persons.add(qiaoshouyuan);
		persons.add(luxingchen);
		persons.add(wanjingwei);
		persons.add(chenxiangpeng);
		persons.add(jiangshansen);
		persons.add(wangbo);
		persons.add(zhangjuntao);
		persons.add(gaoxiangyu);
		persons.add(fengjun);
		persons.add(wangding);
		persons.add(liuxiang);
		persons.add(liguang);
		persons.add(fengxiangyu);
	}
	
	
	public void randomName() {
		  Random random = new Random();
        int index = random.nextInt(persons.size());
        System.out.println( persons.get(index) );
		
	}
	
	

	
	
}
