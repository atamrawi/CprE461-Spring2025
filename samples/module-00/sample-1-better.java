List<Float> findSubListExceedingTargetAverage(List<Float> values, Float targetAverage) {
    Float sum = 0.0;
    List<Float> result = new ArrayList<Float>();
    for(Float value: values) {
        result.add(value);
        sum += value;
        Float average = sum / (Float) result.size();
        if(average > targetAverage) {
            break;
        }
    }
    return result;
}
