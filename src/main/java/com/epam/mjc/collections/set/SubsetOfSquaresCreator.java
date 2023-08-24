package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> result = new TreeSet<>();
        
        for (Integer num : sourceList) {
            result.add(num * num);
        }
        
        return ((TreeSet<Integer>) result).subSet(lowerBound, true, upperBound, true);
    }
}
