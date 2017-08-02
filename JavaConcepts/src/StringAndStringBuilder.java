
public class StringAndStringBuilder {

	public static void main(String args[])
	{
		String s = "";
		//Ineffecient - creates new string every time
		s += "Hello";
		s += " ";
		s += "I am string";
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("");
		//More effecient - modifies existing string
		sb.append("Hello");
		sb.append(" ");
		sb.append("I am StringBuilder");
		System.out.println(sb.toString());
	}
}
