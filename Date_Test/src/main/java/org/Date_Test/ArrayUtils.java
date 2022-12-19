package org.Date_Test;

import java.util.Map;

public class ArrayUtils {

    public static boolean isSameLength(int[] a, int[] b){ return org.apache.commons.lang3.ArrayUtils.isSameLength(a, b);}

    public static <T> T[] addFirst(T[] array, T element){return org.apache.commons.lang3.ArrayUtils.addFirst(array, element);}

    //Gets the nTh element of an array or a default value if the index is out of bounds.
    public static <T> T get(T[] array, int index, T defaultValue){return org.apache.commons.lang3.ArrayUtils.get(array, index, defaultValue);}

    //Removes the elements at the specified positions from the specified array.
    public static <T> T[] removeAll(T[] array, int... indices){ return org.apache.commons.lang3.ArrayUtils.removeAll(array, indices);}

    public static Map<Object, Object> toMap(Object[] array) { return org.apache.commons.lang3.ArrayUtils.toMap(array);}
}
