package com.lanou.rollCall;

import java.util.List;
import java.util.Random;

public class RollCall {
      private List<Person> persons ;
     
	  public RollCall() {
		super();
		
	}
      
	public void initData() {
		Person wangkangjian = new Person("������", "ZZJ190703-25");
		Person yumanman = new Person("������", "ZZJ190703-26");
		Person suxiangkang = new Person("���鿵", "ZZJ190703-27");
		Person huleilei = new Person("������", "ZZJ190703-28");
		Person qiaoshouyuan = new Person("����Ԫ", "ZZJ190703-29");
		Person luxingchen = new Person("¬�ǳ�", "ZZJ190703-30");
		Person wanjingwei = new Person("��ΰ", "ZZJ190703-31");
		Person chenxiangpeng = new Person("������", "ZZJ190703-32");
		Person jiangshansen = new Person("��ɽɭ", "ZZJ190703-35");
		Person wangbo = new Person("����", "ZZJ190703-36");
		Person zhangjuntao = new Person("�ſ���", "ZZJ190703-37");
		Person gaoxiangyu = new Person("������", "ZZJ190703-38");
		Person fengjun = new Person("�뿡", "ZZJ190703-39");
		Person wangding = new Person("����", "ZZJ190703-40");
		Person liuxiang = new Person("����", "ZZJ190703-41");
		Person liguang = new Person("���", "ZZJ190703-42");
		Person fengxiangyu = new Person("������", "ZZJ190703-43");
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
