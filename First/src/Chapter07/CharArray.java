package Chapter07;

public class CharArray {
	public static void main(String[] args)
	{
		char[] apl = new char[26];
		char ch = 'A';
		
		for(int i=0;i<apl.length;i++,ch++)
		{
			apl[i] = ch;
		}
		for(int i=0;i<apl.length;i++)
		{
			System.out.println(apl[i]+","+(int)apl[i]);
		}
	}

}
