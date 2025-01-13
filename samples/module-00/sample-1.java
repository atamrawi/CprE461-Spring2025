float[] foo(float[] array, float val1) {
    float[] array_2 = null;
    float val2 = 0;
    for(int i = 1; i < array.length; i++) {
        array_2 = new float[i];
        for(int j = 0; j < i; j++) {
            array_2[j] = array[j];
        }
        
        float avg = average(array_2);
        if(avg <= val1) {
            continue;
        } else {
            break;
        }
    }
    return array_2;
} 
