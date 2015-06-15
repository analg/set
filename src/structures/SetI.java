package structures;

/**
 * A set is a type of collection that contains only unique elements.
 * @param <E> element type
 */
public interface SetI<E> extends CollectionI<E> {
	void addAll(SetI<E> another);
	void removeAll(SetI<E> another);
	void retain(SetI<E> another);
}