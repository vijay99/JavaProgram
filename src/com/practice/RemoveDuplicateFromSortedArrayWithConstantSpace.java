package com.practice;

// simple java program to remove duplicates from sorted array
//time complexity : O(n)
//Auxiliary Space : O(1)

class RemoveDuplicateFromSortedArrayWithConstantSpace {
    public static void main(String[] args) {
        int inputArray[] = {1, 2, 3, 3, 3, 4, 5, 6, 6, 8, 8, 8};
        int inputArrSize = inputArray.length;
        int distinctArrSize = getDistinctArrSize(inputArray, inputArrSize);
        for (int i = 0; i < distinctArrSize; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }

    private static int getDistinctArrSize(int inputArr[], int inputArrSize) {

        if (inputArrSize == 0 || inputArrSize == 1) {
            return inputArrSize;
        }
        //variable to store unique element index
        int j = 0;
        for (int i = 0; i < inputArrSize - 1; i++) {
            if (inputArr[i] != inputArr[i + 1])
                inputArr[j++] = inputArr[i];
        }
        //we didn't checked last element of inputArray in above loop
        inputArr[j++] = inputArr[inputArrSize - 1];
        return j;
    }
}