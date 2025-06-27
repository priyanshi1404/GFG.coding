

class Solution {
    // Function to calculate stock span values
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length; // ✅ define n from array length
        int[] spans = new int[n];
        spans[0] = 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int day = 1; day < n; day++) {
            while (!stack.isEmpty() && arr[day] >= arr[stack.peek()]) {
                stack.pop();
            }

            spans[day] = stack.isEmpty() ? day + 1 : day - stack.peek();
            stack.push(day);
        }

        // Convert int[] to ArrayList<Integer>
        ArrayList<Integer> result = new ArrayList<>();
        for (int span : spans) {
            result.add(span);
        }

        return result;
    }
}
