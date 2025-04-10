#include <stdio.h>
#include <stdlib.h>

// Example struct for "Factors"
typedef struct {
    double net;  // Or float, or whatever type "net" should be
} Factors;

// Example struct for "Discounts"
typedef struct {
    Factors *factors;
} Discounts;

// Example struct for "Rates"
typedef struct {
    Discounts *discounts;
} Rates;

int main(void) {
    // 1. Define the number of rates
    int rateCount = 5;
    
    // 2. Allocate arrays for baseRate and netRate
    double *baseRate = (double *)malloc(rateCount * sizeof(double));
    double *netRate  = (double *)malloc(rateCount * sizeof(double));
    
    // 3. Allocate Rates and its substructures
    Rates *rates = (Rates *)malloc(sizeof(Rates));
    rates->discounts = (Discounts *)malloc(sizeof(Discounts));
    rates->discounts->factors = (Factors *)malloc(sizeof(Factors));
    
    // 4. Set some example values in your arrays and structures
    //    (In real code, these might come from user input or a file)
    rates->discounts->factors->net = 0.85; // Example discount factor
    for (int i = 0; i < rateCount; i++) {
        baseRate[i] = 100.0 + i * 10.0;  // Just an example
    }
    
    // 5. Compute netRate
    for (int i = 0; i < rateCount; i++) {
        netRate[i] = baseRate[i] * rates->discounts->factors->net;
    }
    
    // 6. Print out results (for verification)
    for (int i = 0; i < rateCount; i++) {
        printf("Index %d: baseRate=%.2f, netRate=%.2f\n",
               i, baseRate[i], netRate[i]);
    }
    
    // 7. Free all allocated memory
    free(rates->discounts->factors);
    free(rates->discounts);
    free(rates);
    free(baseRate);
    free(netRate);

    return 0;
}
