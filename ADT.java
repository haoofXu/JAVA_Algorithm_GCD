package basic;

public class ADT {
	//	��������
	public void declareArray(){
		double[] a = new double[10];
		int[] b = {1,1,2,3,5,8};
	}
	
	//	ŷ������㷨
	public static int gcd(int p, int q){
		if(q==0) return p;
		int r = p % q;
		return gcd(q, r);
	}
}
