package com.hxh.jdsun.util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

//���������ݿ�
public class DBT {
  static SqlSessionFactory sessionFactory;
  //ͨ��cfg�������ݿ�
  static{
	  try {
		Reader r=
			  Resources.getResourceAsReader("mybatis.cfg.xml");
	   sessionFactory=new SqlSessionFactoryBuilder().build(r);
	  } catch (IOException e) {
		e.printStackTrace();
	}
  }
  public static SqlSession getSession(){
  	return sessionFactory.openSession();
  }
 public static void main(String[] args) {
  	System.out.println(getSession());
}
}
