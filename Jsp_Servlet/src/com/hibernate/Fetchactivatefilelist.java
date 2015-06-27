package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.database.HibernateUtil;

import pojo.Article;
import pojo.Users;

public class Fetchactivatefilelist{

	
	/*public static void main(String args[]){
		
		Fetchactivatefilelist obj1 = new Fetchactivatefilelist();
		
		obj1.getlist();
		
	}*/
	
	public String getlist() {

		System.out.println("=======================================");
		System.out.println("Process Started..............");
		System.out.println("=======================================");
		Session session=null;
		Transaction transaction=null;

		try{
			System.out.println("==============session=========================");
			session=HibernateUtil.getSessionFactory().openSession();
			System.out.println("==============trans=========================");
			transaction=session.beginTransaction();
			
			String sql="SELECT * FROM article where StatusId = :StatusId LIMIT 1";
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(Article.class);
			query.setParameter("StatusId", 2);
			//query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
			@SuppressWarnings("unchecked")
			List<Article> obj=(List<Article>)query.list();
			
			if(obj.size() != 0){
				for(Article obj1 :obj) {
					System.out.println("JID::"+obj1.getJid() +"\nAID::"+ obj1.getAid());
				}
			}else{
				System.out.println("NO files in Queue.....");
			}

		}catch(Exception e){
			
			e.printStackTrace();
			
		} finally{
			transaction.commit();
			session.clear();
			session.close();			
		}
		
		System.out.println("==================end=====================");
		
		return "method return";

	}
	
	public List<Users> getListOfUsers(){
		 List<Users> list = new ArrayList<Users>();
			Session session=null;
			Transaction tx=null;
			session=HibernateUtil.getSessionFactory().openSession();


		 try {
				tx=session.beginTransaction();
				String hql="FROM Users u";
				Query query=session.createQuery(hql);
				List<Users> obj=(List<Users>)query.list();
				if(obj.size() != 1){
					System.out.println("Token Not Found OR More than one token exist" + obj.size());
				}
				tx.commit();
		 } catch (Exception e) {
			 if (tx != null) {
				 tx.rollback();
			 }
			 System.out.println("catch::" + e);
		 } finally {
			 session.close();
		 }
		 return list;
	}
}
