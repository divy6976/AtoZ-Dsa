class Solution {
    int left[];   // Declare left[] and right[] globally
    int right[];

    void leftmaxi(int[] height) {
        left = new int[height.length];  // Initialize the left array
        left[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
    }

    void rightmaxi(int[] height) {
        right = new int[height.length];  // Initialize the right array
        right[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }
    }

    public int trap(int[] height) {
        leftmaxi(height);  // Fill the left[] array
        rightmaxi(height); // Fill the right[] array
        int total = 0;

        for (int i = 0; i < height.length; i++) {
            if (height[i] < left[i] && height[i] < right[i]) {
                total += Math.min(left[i], right[i]) - height[i];
            }
        }

        return total;
    }
}