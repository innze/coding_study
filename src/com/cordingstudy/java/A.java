package com.cordingstudy.java;

public class A {
	   public String y(){
	        return "public void y()";
	    }
	    private	String z(){
	        return "public void z()";
	    }
	    public String x(){
	        return z();
	    }
		public String y1() {
			return null;
		}
}

class AcessDemo {
		public static void main(String[] args) {
		       A a = new A();
		       System.out.println(a.y());
		       // 아래 코드는 오류가 발생한다.
		       //System.out.println(a.z());
		       System.out.println(a.x());
		       System.out.println(a.y1());
		       
		    }
}
