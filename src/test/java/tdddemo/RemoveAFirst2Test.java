package tdddemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveAFirst2Test {
	
	RemoveAs s;
	

	
	
	@Test
	void length0case() {
		s=new RemoveAs();
		String res=s.remove("");
		assertEquals("", res);
	}
	
	@Test
	void length1withAcase() {
		s=new RemoveAs();
		String res=s.remove("A");
		assertEquals("", res);
	}
	
	@Test
	void length1withoutAcase() {
		s=new RemoveAs();
		String res=s.remove("5");
		assertEquals("5", res);
	}
	
	@Test
	void lengthgreater2withAcase() {
		s=new RemoveAs();
		String res=s.remove("A5saf");
		assertEquals("5saf", res);
	}
	
	@Test
	void lengthgreater2withoutAcase() {
		s=new RemoveAs();
		String res=s.remove("695saf");
		assertEquals("695saf", res);
	}
	

}
