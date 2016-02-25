package myUtil;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetOps {

	// ==================================================================================
	// Common set operations: union, intersection, difference, symmetric difference, is subset, is superset	
		public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
			Set<T> tmp = new TreeSet<T>(set1);
			tmp.addAll(set2);
			return tmp;
		}

		public static <T> Set<T> intersection(Set<T> setA, Set<T> setB) {
		    Set<T> tmp = new TreeSet<T>();
		    if (setA.size() > 0 && setB.size() > 0) {
		    	for (T x : setA)
				      if (setB.contains(x))		tmp.add(x);
				        
			} 
		    return tmp;
		  }

		public static <T> Set<T> difference(Set<T> setA, Set<T> setB) {
			Set<T> tmp = new TreeSet<T>(setA);
			tmp.removeAll(setB);
			return tmp;
		}

		public static <T> Set<T> symDifference(Set<T> setA, Set<T> setB) {
			Set<T> tmpA;
			Set<T> tmpB;
		
			tmpA = union(setA, setB);
			tmpB = intersection(setA, setB);
			return difference(tmpA, tmpB);
		}

		public static <T> boolean isSubset(Set<T> setA, Set<T> setB) {
			return setB.containsAll(setA);
		}

		public static <T> boolean isSuperset(Set<T> setA, Set<T> setB) {
			return setA.containsAll(setB);
		}

		/**
		 *  check if two sets of numbers are equal (though they may be different in element order)
		 *	(e.g. {3,2,1} is the same as {1,2,3}) 
		 *	Idea: if they are actually the same set and differ only in permutation
		 *	then their sorted versions should be the same
		 */
		public static <T> boolean isEqual(Set<T> setA, Set<T> setB) {
			if (setA.size() != setB.size()) {
				return false;
			} 
			else {
				T[] a = null ;
				setA.toArray(a);	Arrays.sort(a);
				T[] b = null;
				setB.toArray(b);	Arrays.sort(b);
				return Arrays.equals(a, b);
			}
		}
	

}
