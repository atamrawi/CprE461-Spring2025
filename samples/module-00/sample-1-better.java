/**
 * Finds a the smallest prefix subarray of <code>values</code> with an average greater than the threshold <code>targetValue</code>.
 * 
 * @param values A list of {@link Float}s.
 * @param averageThreshold A threshold average {@link Float} value that the returned sub-array must at least exceed.
 * @return A lisf of {@link Float}s.
 */
float[] findSubarrayWithAvgAboveThreshold(float[] array, float averageThreshold) {
    // Validate input
    if (array == null || array.length == 0) {
        return new float[0]; // Return an empty array for invalid input
    }

    float sum = 0; // To store the running sum of elements
    for (int i = 0; i < array.length; i++) {
        sum += array[i]; // Update running sum

        // Calculate the average of the current prefix
        float avg = sum / (i + 1);

        // Check if the average exceeds the threshold
        if (avg > averageThreshold) {
            // Return a subarray up to the current index
            return java.util.Arrays.copyOfRange(array, 0, i + 1);
        }
    }

    // If no subarray meets the condition, return an empty array
    return new float[0];
}