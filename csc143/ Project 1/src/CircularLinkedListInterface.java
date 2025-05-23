/**
 * Interface to convey required methods and signatures for the TreeMap class.
 * @param <K>       the data type for keys in the map.
 * @param <V>       the data type for values in the map.
 */
public interface TreeMapInterface<K, V> {

    /**
     * Retrieves the number of key/value pair elements managed by the map
     * @return      number of elements
     */
    public int size();

    /**
     * Clears the existing tree, removing any and all existing key/value pairs.
     */
    public void clear();

    /**
     * Retrieves the corresponding value for the specified key.
     * @param key       key of interest.
     * @return          value corresponding to the specified key, or null if the key is not found.
     */
    public V get(K key);

    /**
     * Adds a key/value pair to the tree map.
     * @param key       the key. If not already in the tree, the key/value pair is added.  If already in the
     *                  tree, the existing value is replaced with the one specified here.
     * @param value     the value in the key/value pair.
     */
    public void put(K key, V value);

    /**
     * Checks the tree to see if it contains the specified key.
     * @param key       the key to search for.
     * @return          true, if the key is in the tree map; false, if not.
     */
    public boolean containsKey(K key);

    /**
     * Retrieves an array of key data from the map, in order,
     * @param array to fill in.  If smaller than the map's size, a new array will be created.  If larger than the
     *              map's size, data will be filled in from index 0, with a null reference just after the copied-in data.
     * @return      a reference to the filled-in array; may be a different array than the one passed in.
     */
    public K[] toKeyArray(K[] array);

}
