package com.cordingstudy.java;

class SubstractionableCalculator extends Calculator {
    
    public void sum() {
    	super.sum();
        System.out.println("���� ����� " +(this.left + this.right)+"�Դϴ�.");
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }

    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}