package com.techinterviews.various;

public class BitFun {

	/**
	 * @param args
	 */
	public static int countOnBits(int x)
	{
		int val=0;
		while(x>0){
			val+=x%2;
			x /=2;
		}
		
		return val;
	}
	
	public static String convertFractionBinary(double x){
		StringBuilder sb = new StringBuilder();
		
		if(x>1){
			
		}
		else
		{
			sb.append(".");
		}
		
		while(x>0){
			double num = Math.floor(x*2.0);
			if(num>=1){
				sb.append("1");
				x=x*2-num;
			}
			else{
				sb.append("0");
				x*=2;
			}
			
			//if(sb.charAt(arg0))
		}
		
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(countOnBits(4));
		System.out.println(convertFractionBinary(.95));
	}

}
