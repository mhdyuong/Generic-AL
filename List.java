
public interface List<K extends Comparable<K>,V> {
	
	public abstract boolean add(K key,V value);
	
	public abstract V remove(K key);
	
	public abstract V remove(int n);
	
	public abstract V remove();
	
	public abstract V lookup(K key);
	
	public abstract int size();
	
	public abstract V get(int n);

}