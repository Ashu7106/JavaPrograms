package JavaBasicsConstructor;

import OOPConceptPart2.newcar;

public class SuperKeyword1 extends SuperKeyword {

	public SuperKeyword1() {
	   super();
	}
	public SuperKeyword1(int i) {
		   super(i);
		}
	public SuperKeyword1(int x, int y) {
		   super(x,y);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  SuperKeyword1 spr=new SuperKeyword1();

	  SuperKeyword1 spr1=new SuperKeyword1(10);	
	  SuperKeyword1 spr2=new SuperKeyword1(20, 40);

	}

}
