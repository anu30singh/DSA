#include<stdio.h>
#include<stdlib.h> //linear search 
// int main () {
// int a[50] , i , n, k;
// printf("enter size of array:");
// scanf("%d" , &n);
// printf("Enter %d elements in array :" , n);
// for (int i=0; i < n ; i++) {
//     scanf("%d" , &a[i] );
// }
// printf ("element to be searched : ");
// scanf ("%d" , &k);
// int flag=0;
// for (int i=0; i<n ; i++) {
//     if (a[i] == k) {
//         printf ("element found at %d index " , i);
//         flag=1;
//         break;
//     }
// }
// if (flag==0) {
//     printf("element not found");
// }
// return 0;
// }
int main () {
    int a[10] , first , last , mid , k;
    printf ( "enter 10 array elements ");
    for (int i=0; i <10 ; i++) {
        scanf ( "%d" , &a[i]);
    }
    printf ("enter element to be searched :");
    scanf("%d" , &k);
    first =0;
    last =9;
    mid = (first+last)/2;
    while (first <= last) {
        if (a[mid] < k ) first = mid+1;
        else if (a[mid]== k) 
        {
printf ( "element found at position" , mid+1);
break;
        }
        else {
            last = mid-1;
            mid= (first+last)/2; 
        }
        if (first>last) {
            printf("element not found");
        }
    }
return 0;
}