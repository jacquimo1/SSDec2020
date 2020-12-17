package com.ss.assignment.day5.assignment5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Assignment5 {
	private static int sumTarget;
	private static List<Integer> integers;

	/* Method adds each integer and its frequency to a linked hash map, then 
	 * multiplies each one by its frequency to create a list that replaces all
	 * adjacent identical integers with their sums.
	 */
	
	public static boolean groupSumClump(int start, int[] array, int target) {
		sumTarget = target;
		LinkedHashMap<Integer, Integer> adjId = new LinkedHashMap<Integer, Integer>();
		if (target == 0) {
			return false;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target ) {
				return true;
			}
			adjId.put(array[i], 1);
			if (i > 0 && array[i] == array[i - 1]) {
				adjId.put(array[i], adjId.get(array[i]) + 1);
			}
		}

		sumAdjacentIdenticals(adjId);
		
		return hasAddendsForSumOfTarget(0);
		
	}
	
	static void sumAdjacentIdenticals(LinkedHashMap<Integer, Integer> ai) {
		integers = new ArrayList<Integer>();
		for (Map.Entry<Integer, Integer> entry : ai.entrySet() ) {
			integers.add(entry.getKey() * entry.getValue());
		}
	}
	
	
	/* Recursive method takes an int for its starting place in list of integers
	 * to check for addends to reach the target sum.
	 * 
	 * For each integer of a static list, the integer is removed from a local 
	 * copy of the list, then incremented by its remaining integers until it
	 * exceeds the target value;
	 * 
	 * If each integer of the list has been tried, a digit is removed from the 
	 * static list, and it repeats.
	 */
	
	static boolean hasAddendsForSumOfTarget(int next) {
		if (integers.size() == 1 && integers.get(0) != sumTarget) return false;
		if (next == integers.size())  {
			integers.remove(0);
			next = 0;
		}
		int current = integers.get(next);
		next++;
		List<Integer> local = new ArrayList<Integer>(integers);
		if (next > local.size()-1) {
			return false;
		}
		local.remove(next);
		for (int i = 0; i < local.size(); i++) {
			current += local.get(i);
			if (current == sumTarget) return true;
			if (current > sumTarget) break;
		}
		return hasAddendsForSumOfTarget(next);

	}
	
}
