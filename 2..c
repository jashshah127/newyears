#include <stdio.h>
#include <stdlib.h>

int main() {
	int number;
	float amount;
	
	number = 20;
	
	amount=26.985+785.6;
	
	printf("%d\n", number);
	printf("%5.4f", amount);         //5.4f means that the value should be printed in floating point format.The format specification %5.4 means five places in all and four places to the right of the decimal point
	return 0;
}
