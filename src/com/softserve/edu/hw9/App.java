package com.softserve.edu.hw9;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers1 = List.of(1, 2, 1, 2, 1, 2, 3, 4, 5, 102, 105, 111);
        List<Integer> numbers2 = List.of(1, 2, 1, 8, 3, 6, 5, 10, 11, 3, 25, 2, 3, 111, 1);
        List<Integer> commonNumbers = combineListWithCommonElements(numbers1, numbers2);

        for (Integer number : commonNumbers) {
            System.out.println(number);
        }
    }

    // customCrutchMethod
    private static <T> List<T> combineListWithCommonElements(List<T> l1, List<T> l2) {
        List<T> tempList = new ArrayList<>(l1);
        List<T> result = new ArrayList<>();
        for (int i = 0; i < tempList.size(); i++) {
            if (l2.contains(tempList.get(i))) {
                T temp = tempList.get(i);
                result.add(temp);
                i -= 1;
                tempList.removeAll(List.of(temp));
            }
        }
        return result;
    }
}
