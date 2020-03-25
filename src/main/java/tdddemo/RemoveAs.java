package tdddemo;

public class RemoveAs {
	public String remove(String s) {
		if (s.length()<1) {
			return s;
		}
		else if(s.length()==1) {
			if (s.charAt(0)=='A') {
				return "";
			}else {
				return s;
			}
		}else if(s.length()>=2) {
			char first=s.charAt(0);
			char second=s.charAt(1);
			String res="";
			if (first!='A'){
				res+=first;	
			}
			if(second!='A') {
				res+=second;
			}
			s=s.substring(2);
			s=res+s;
			return s;
			
		}
		return "";
		
	}

}
