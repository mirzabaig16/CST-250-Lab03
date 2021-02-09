/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ru.binarysearch2;

public class MainClass {

// Method for Searching The given integer value in the given array of integer
// Argunments that need to be passed to given method are
// int arr[] : array of integer in which you want to search any number.
// int first: first index of array
// int last: last index of array
// int key: number which you want to search in given array
 public static void binarySearch(int arr[], int first, int last, int key){
 // Method Start
 // finding the mid of indexes (e.g in the given example if your first index is 0 and last is 4 then mid will be 2)
   int mid = (first + last)/2;
    // its means we are dividing the given array into two parts.
   // Iterate untill first variable is less than or equal to last variable
   while( first <= last ){
   //Iteration Start
   //Conditions Start
   
  
   // if number in the array at mid position is less that the key (value which you are searching ) this part of code will work
      if ( arr[mid] < key ){
	  // re assigning value to first by adding 1 in the mid.
	
        first = mid + 1; 
// its means the number which we are searching is in the 2nd half of the array.
// as you know we divide array into two half start to mid-1 and 2nd half is mid+1 to last
// so next time we will search that part so we are changing our first value to mid+1
      }
	  // if above condition didn't work than number in the array at mid position is equal to the key (value which you are searching ) then this part of code will work
	  else if ( arr[mid] == key ){
	  // so if you found the value this line will be printed with the index number.
        System.out.println("Element is found at index: " + mid);
		// if you found then you will stop the itteration by using break keyword ( which is usually using to stop the itterations). So if this line will work the next line wihich will be executed is after the Itteration End line.
        break;
      }
	  // if both above condition didn't work (means if number in array at mid is greater than the number which you are searching)then this part of code will work.
	  else{
	  // re assing the last value by subtracting 1 from mid value.
         last = mid - 1;
		 // its means the number which we are searching is in the 1st half of the array.
// as you know we divide array into two half start to mid-1 and 2nd half is mid+1 to last
// so next time we will search that part so we are changing our last value to mid-1. in this way we are ignorinh the 2nd half of array.
      }
	  //Conditions End
	  
	  // re assign the mid value as first or last value changed in above conditions
      mid = (first + last)/2;
	  //Iteration End
   }
   //if first varible value is greater than last which means your searching number is not found in the above itteration.
   if ( first > last ){
   // so it will print when you will not found the number which you are searching in the given array.
      System.out.println("Element is not found!");
   }
   //Method End
 }
 //Main method which will be executed on first run.
 //Main method Start
 public static void main(String args[]){
 //Given Array of integer.
		int arr[] = {10,20,30,40,50};
		// Given number which you want to search in given array.
		int key = 30;
		// Last index of array. e.g. in this example it will be 4
        int last=arr.length-1;
		// Calling the function which we decalred on the top to search the given value in the given array.
		// parameters/arguments we are passing as arr: given array , 0 as first index of array, last as last index of array, key as key which we need to search
		binarySearch(arr,0,last,key);	
 }
 //Main method End

    }
    
