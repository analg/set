import structures.SetI;

import java.util.LinkedList;

public class Set<E> extends LinkedList<E> implements SetI<E> {

	/**
	 * Adds a Set of values to the set.
	 * @param other set
	 */
	@Override
	public void addAll(SetI<E> other) {
		for (E value: other) {
			add(value);
		}
	}

	/**
	 * Adds a value to the set.
	 * @param value to add
	 * @return whether value was added
	 */
	@Override
	public boolean add(E value) {
		if (!contains(value)) {
			return super.add(value);
		}
		return false;
	}

	/**
	 * Removes all values of a Set from the set.
	 * @param other set
	 */
	@Override
	public void removeAll(SetI<E> other) {
		for (E value: other) {
			remove(value);
		}
	}

	/**
	 * Removes all values but those in a Set from the set.
	 * @param other set
	 */
	@Override
	public void retain(SetI<E> other) {
		LinkedList list = new LinkedList();
		for (E value: other) {
			if (contains(value)) {
				list.add(value);
			}
		}
		clear();
		addAll(list);
	}
}
