#include <stdio.h>

int main() {
    int count = 10;
    int a[10];

    int i = 0;
    while (i < count) {
        a[i] = i;
        i = i + 1;
    }

    // Print the array to verify the values
    printf("Array elements:\n");
    for (i = 0; i < count; i++) {
        printf("a[%d] = %d\n", i, a[i]);
    }

    return 0;
}
