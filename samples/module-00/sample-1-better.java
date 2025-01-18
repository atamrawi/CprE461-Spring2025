import java.util.Collections;
import java.util.List;

/**
 * Finds a first sub-list of <code>values</code> that has an average that is larger than the <code>targetValue</code>.
 * 
 * @param values A list of {@link Float}s.
 * @param targetAverage A target {@link Float} value that the returned sub-list must at least exceed.
 * @return A lisf of {@link Float}s.
 */
List<Float> findSubListExceedingTargetAverage(List<Float> values, Float targetAverage) {
    if(values == null || values.isEmpty()) {
        // If the passed in <code>values</code> list is empty or null, we just return an empty list as a result.
        return Collections.emptyList();
    }
    // The current sum of the values is accumulated in here.
    Float sum = 0.0;

    // A placeholder for the accumulated list of {@link Float}s.
    List<Float> result = new ArrayList<Float>();

    // Iterate through the list, while building the sub-list and checking its average.
    for(Float value: values) {
        result.add(value); // Grow the list with the new number.
        sum += value; // Update the sum.
        Float average = sum / (Float) result.size(); // Get the recent averge for the list.
        if(average > targetAverage) {
            // The sub-list average is larger than the target average, we found our sub-list.
            return result;
        }
    }

    // We have found any sub-list with average larger than the target average, so return an empty list.
    return Collections.emptyList();
}
