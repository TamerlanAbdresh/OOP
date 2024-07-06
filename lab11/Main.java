import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        task1GenericLinearSearch();
        task2MaximumElementInArray();
        task3LargestElementInArrayList();
        task4RemoveDuplicatesInArrayList();
        task5SortPointsInPlane();
        task6LinkedListIteratorTest();
    }

    // Задание 1
    public static void task1GenericLinearSearch() {
        Integer[] array = {1, 2, 3, 4, 5};
        int index = linearSearch(array, 3);
        System.out.println("Task 1: Index of key 3: " + index);
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }

    // Задание 2
    public static void task2MaximumElementInArray() {
        Integer[] numbers = {10, 5, 8, 20, 15};
        Integer maxNumber = max(numbers);
        System.out.println("Task 2: Max number in array: " + maxNumber);
    }

    public static <E extends Comparable<E>> E max(E[] list) {
        if (list == null || list.length == 0) {
            return null;
        }
        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) {
                max = list[i];
            }
        }
        return max;
    }

    // Задание 3
    public static void task3LargestElementInArrayList() {
        ArrayList<Double> doubles = new ArrayList<>(Arrays.asList(2.5, 3.8, 1.0, 4.2, 2.1));
        Double maxDouble = max(doubles.toArray(new Double[0]));
        System.out.println("Task 3: Max double in ArrayList: " + maxDouble);
    }

    // Задание 4
    public static void task4RemoveDuplicatesInArrayList() {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana"));
        ArrayList<String> distinctStrings = removeDuplicates(strings);
        System.out.println("Task 4: Distinct elements in ArrayList: " + distinctStrings);
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        HashSet<E> set = new HashSet<>();

        for (E item : list) {
            if (set.add(item)) {
                result.add(item);
            }
        }

        return result;
    }

    // Задание 5
    public static void task5SortPointsInPlane() {
        Point[] points = generateRandomPoints(10);

        System.out.println("\nTask 5: Points sorted by x-coordinates:");
        Arrays.sort(points);
        for (Point point : points) {
            System.out.println(point);
        }

        System.out.println("\nPoints sorted by y-coordinates:");
        Arrays.sort(points, new CompareY());
        for (Point point : points) {
            System.out.println(point);
        }
    }

    static class Point implements Comparable<Point> {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point other) {
            if (this.x != other.x) {
                return Integer.compare(this.x, other.x);
            } else {
                return Integer.compare(this.y, other.y);
            }
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    static class CompareY implements Comparator<Point> {
        @Override
        public int compare(Point p1, Point p2) {
            if (p1.y != p2.y) {
                return Integer.compare(p1.y, p2.y);
            } else {
                return Integer.compare(p1.x, p2.x);
            }
        }
    }

    private static Point[] generateRandomPoints(int count) {
        Random rand = new Random();
        Point[] points = new Point[count];
        for (int i = 0; i < count; i++) {
            int x = rand.nextInt(100); // Example range for x-coordinate
            int y = rand.nextInt(100); // Example range for y-coordinate
            points[i] = new Point(x, y);
        }
        return points;
    }

    // Задание 6
    public static void task6LinkedListIteratorTest() {
        LinkedList<Integer> linkedList = generateRandomLinkedList(1000000);

        long startTime = System.nanoTime();
        iterateWithIterator(linkedList);
        long iteratorTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        iterateWithGet(linkedList);
        long getTime = System.nanoTime() - startTime;

        System.out.println("\nTask 6: Time using iterator: " + iteratorTime / 1000000.0 + " ms");
        System.out.println("Task 6: Time using get(index): " + getTime / 1000000.0 + " ms");
    }

    private static LinkedList<Integer> generateRandomLinkedList(int size) {
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }
        return list;
    }

    private static void iterateWithIterator(LinkedList<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }

    private static void iterateWithGet(LinkedList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i);
        }
    }
}
