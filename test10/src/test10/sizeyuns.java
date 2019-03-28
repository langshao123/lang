package test10;

public class sizeyuns {

	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int cheng(int a,int b) {
		return a*b;
	}
	public int chu(int a,int b) {
		return a/b;
	}
	public String chu10(int a) {
		String S;
		if(a%10==0)
			S="被10整除";
		else
			S="不被10整除";
		return S;
	}
	public String chu7(int a) {
		String S;
		if(a%7==0)
			S="被7整除";
		else
			S="不被7整除";
		return S;
	}
}
