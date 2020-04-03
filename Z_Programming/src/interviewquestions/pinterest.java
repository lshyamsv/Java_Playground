package interviewquestions;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class pinterest {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("Shyam");
//		strings.add("Sindhu");
//		strings.add("Raghuprema");

//		 for(String str : strings)
//		 {
//		 int n = strings.size();
//		 
//		
//		 }

		StringBuilder str = new StringBuilder();
		
		for (int i = 0; i < strings.size(); i++) {
			
			if (strings.size()==1)
			{
				System.out.println(strings.get(0));
				break;
			}
			if (i == strings.size() - 1) {
				str.append(" and ");
				str.append(strings.get(i));
			} else {
				str.append(strings.get(i));
				str.append(", ");
			}

		}

		System.out.print(str);
	}
}
