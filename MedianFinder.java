import java.util.*;
class MedianFinder {
    PriorityQueue<Integer> left =
        new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> right =
        new PriorityQueue<>();

    public MedianFinder() {
    }
    public void addNum(int num) {
        left.add(num);
        right.add(left.poll());

        if (right.size() > left.size()) {
            left.add(right.poll());
        }
    }
    public double findMedian() {
        if (left.size() > right.size()) {
            return left.peek();
        }
        return (left.peek() + right.peek()) / 2.0;
    }
}
