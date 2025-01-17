import java.util.*;

public class Main
{
    public static <T> void printUnique(Collection<T> list)
    {
        Set<T> set = new HashSet<T>(list);
        for(T item : set) System.out.print(item + " ");
    }

    public static <T> int countOccurences(Collection<T> items, T element)
    {
        int count = 0;
        for(T item : items) if(item.equals(element)) count++;
        return count;
    }

    public static <T> ArrayList<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2)
    {
        ArrayList<T> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    public static <T> TreeSet<T> findElementsInRange(TreeSet<T> set, T lowerBound, T upperBound)
    {
        if(set.contains(lowerBound) && set.contains(upperBound))
        {
            while(set.first() != lowerBound) set.remove(set.first());
            while(set.last() != upperBound) set.remove(set.last());
        }
        else System.out.println("Zły przedział");
        return set;
    }

    public static <T> boolean isPalindrome(LinkedList<T> list)
    {
        int size = list.size();
        for(int i = 0; i < size / 2; i++) if(list.get(i) != list.get(size - 1 - i)) return false;
        return true;
    }

    public static <T> HashSet<T> findUniqueElements(List<T> list)
    {
        return new HashSet<T>(list);
    }

    public static <K, V> TreeMap<K, V> subMapInRange(TreeMap<K, V> map, K startKey, K endKey)
    {
        return new TreeMap<K, V>(map.subMap(startKey, true, endKey, true));
    }

    public static <K, V> HashMap<V, Integer> countValueOccurences(HashMap<K, V> map)
    {
        HashMap<V, Integer> result = new HashMap<>();
        Set<K> keys = map.keySet();
        for(K i : keys)
        {
            V j = map.get(i);
            if(!result.containsKey(j)) result.put(j, 1);
            else result.put(j, result.get(j) + 1);
        }
        return result;
    }

    public static void main(String[] args)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 1);
        map.put('d', 3);
        map.put('a', 4);
        map.put('e', 2);
        map.put('f', 1);
        HashMap<Integer, Integer> n = countValueOccurences(map);
        System.out.println(n);
    }
}
