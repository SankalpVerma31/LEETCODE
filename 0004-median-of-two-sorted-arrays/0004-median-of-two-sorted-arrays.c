//Sankalp

double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int arr[nums1Size+nums2Size];
    int i;
    for(i=0;i<nums1Size;i++){
        arr[i] = nums1[i];
    }
    for(int j =0;j<nums2Size;j++){
        arr[i+j]=nums2[j];
    }
    int len = sizeof(arr) / sizeof(arr[0]); 
    for(int k=0;k<len;k++){
        for(int m=0;m<len;m++){
            if(arr[k]>arr[m]){
                int temp = arr[m];
                arr[m]=arr[k];
                arr[k]=temp;
            }
            else{
                continue;
            }
        }
    }
    double median;
    if (len%2==0&&len!=0){
        median = (arr[len/2] + arr[(len/2)-1]) / 2.0;
    }
    else if(len%2==0){
        median=0;
    }
    else{
        median = (arr[len/2]);
    }
    return median;
}