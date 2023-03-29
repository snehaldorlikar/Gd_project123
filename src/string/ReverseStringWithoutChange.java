package string;

public class ReverseStringWithoutChange {
	public static void main(String[] args) {
		String s1 = "My name is Snehal";
		String s2="";
		String[] st = s1.split(" ");
		for (int i = st.length-1; i  >=0; i--) {
			//System.out.println(st[i]);
			// for (int j = st; j < st.length; j++) {
s2+=st[i]+"";
		}
		
		for(int k=0;k>=7;k++)
		{
			System.out.println("For loop concept" + k);
		}
		System.out.println(s2);
	}
//System.out.println(st[]);
}
//}
