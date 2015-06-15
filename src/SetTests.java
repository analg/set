import org.junit.Test;
import structures.SetI;

import java.util.Arrays;

import static junit.framework.Assert.*;

public class SetTests {
	@Test
	public void setnInitializes() {
		Set set = new Set();
	}

	@Test
	public void setAdds() {
		SetI<String> set = new Set<String>();
		set.add("Hello");
	}

	@Test
	public void setContains() {
		SetI<String> set = new Set<String>();
		set.add("Hello");
		assertTrue(set.contains("Hello"));
	}

	@Test
	public void setCanConvertToArray() {
		SetI<String> set = new Set<String>();
		set.add("Hello");
		set.add("Hello");
		set.add("Test");
		set.add("Test");
		set.add("Test");
		set.add("Goodbye");
		set.add("Next time");
		set.add("Au revoir");
		set.add("Goodbye");
		assertTrue(Arrays.equals(set.toArray(), new String[] {
			"Hello", "Test", "Goodbye", "Next time", "Au revoir"
		}));
	}

	@Test
	public void setCanDetermineEmpty() {
		SetI<String> set = new Set<String>();
		assertTrue(set.isEmpty());
		set.add("Hello");
		assertFalse(set.isEmpty());
		set.remove("Hello");
		assertTrue(set.isEmpty());
	}

	@Test
	public void setCanGetSize() {
		SetI<String> set = new Set<String>();
		set.add("Hello");
		set.add("Hello");
		set.add("Test");
		set.add("Test");
		set.add("Test");
		set.add("Goodbye");
		set.add("Next time");
		set.add("Au revoir");
		set.add("Goodbye");
		assertEquals(set.size(), 5);
	}

	@Test
	public void setCanRemove() {
		SetI<String> set = new Set<String>();
		set.add("Hello");
		set.add("Hello");
		set.add("Test");
		set.add("Test");
		set.add("Test");
		set.add("Goodbye");
		set.add("Next time");
		set.add("Au revoir");
		set.add("Goodbye");
		assertTrue(set.remove("Hello"));
		assertFalse(set.remove("Hello"));
		assertEquals(set.size(), 4);
		assertTrue(Arrays.equals(set.toArray(), new String[] {
			"Test", "Goodbye", "Next time", "Au revoir"
		}));
	}

	@Test
	public void setCanClear() {
		SetI<String> set = new Set<String>();
		set.add("Hello");
		set.add("Hello");
		set.add("Test");
		set.add("Test");
		set.add("Test");
		set.add("Goodbye");
		set.add("Next time");
		set.add("Au revoir");
		set.add("Goodbye");
		set.clear();
		assertEquals(set.size(), 0);
		assertTrue(set.isEmpty());
		assertFalse(set.remove("Hello"));
		assertTrue(Arrays.equals(set.toArray(), new String[] {}));
	}
	
	@Test
	public void setCanAddAll() {
		SetI<String> set = new Set<String>();
		set.add("Hello");
		set.add("Hello");
		set.add("Test");
		set.add("Test");
		set.add("Test");
		set.add("Goodbye");
		set.add("Next time");
		set.add("Au revoir");
		set.add("Goodbye");
		
		SetI<String> other = new Set<String>();
		other.add("Hello");
		other.add("A");
		other.add("B");
		other.add("Goodbye");
		
		set.addAll(other);

		assertEquals(set.size(), 7);
		assertTrue(Arrays.equals(set.toArray(), new String[] {
			"Hello", "Test", "Goodbye", "Next time", "Au revoir", "A", "B"
		}));
	}

	@Test
	public void setCanRemoveAll() {
		SetI<String> set = new Set<String>();
		set.add("Hello");
		set.add("Hello");
		set.add("Test");
		set.add("Test");
		set.add("Test");
		set.add("Goodbye");
		set.add("Next time");
		set.add("Au revoir");
		set.add("Goodbye");

		SetI<String> other = new Set<String>();
		other.add("Hello");
		other.add("A");
		other.add("B");
		other.add("Goodbye");

		set.removeAll(other);

		assertEquals(set.size(), 3);
		assertTrue(Arrays.equals(set.toArray(), new String[] {
			"Test", "Next time", "Au revoir"
		}));
	}

	@Test
	public void setCanRetain() {
		SetI<String> set = new Set<String>();
		set.add("Hello");
		set.add("Hello");
		set.add("Test");
		set.add("Test");
		set.add("Test");
		set.add("Goodbye");
		set.add("Next time");
		set.add("Au revoir");
		set.add("Goodbye");

		SetI<String> other = new Set<String>();
		other.add("Hello");
		other.add("A");
		other.add("B");
		other.add("Goodbye");

		set.retain(other);

		assertEquals(set.size(), 2);
		assertTrue(Arrays.equals(set.toArray(), new String[] {
			"Hello", "Goodbye"
		}));
	}
}
