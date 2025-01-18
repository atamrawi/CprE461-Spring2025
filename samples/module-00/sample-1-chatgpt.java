// Function to process an input array and return a subarray meeting a specific condition
float[] processArray(float[] array, float threshold) {
    // Validate input
    if (array == null || array.length == 0) {
        return new float[0]; // Return an empty array if input is null or empty
    }

    float[] resultArray = null;

    // Iterate over subarray sizes starting from 1
    for (int i = 1; i <= array.length; i++) {
        // Create a subarray of size 'i'
        float[] subArray = new float[i];
        System.arraycopy(array, 0, subArray, 0, i);

        // Calculate the average of the subarray
        float avg = average(subArray);

        // Check if the average exceeds the threshold
        if (avg > threshold) {
            resultArray = subArray; // Update result with the current subarray
            break; // Stop further processing
        }
    }

    // Return the last valid subarray or null if none meet the condition
    return resultArray != null ? resultArray : new float[0];
}

/**
 * Helper function to calculate the average of a float array
 * 
 * @param array Input array
 * @return The average of the array elements
 */
float average(float[] array) {
    if (array == null || array.length == 0) {
        return 0; // Return 0 for null or empty arrays
    }

    float sum = 0;
    for (float value : array) {
        sum += value;
    }
    return sum / array.length;
}
