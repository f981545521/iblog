package cn.acyou.interview.algorithm;

import java.util.Arrays;

import org.junit.Test;

public class ErFen {
	public static void main(String[] args) {
		
		int[] arr = new int[]{22,63,4,15,96,7,12,21,54,67,123};
		Arrays.sort(arr);
		System.out.println("排序后：" + Arrays.toString(arr));
		int i = search(arr, 99);
		System.out.println("下标为：" + i);
		//test1();
	}

	
	
	public static void test1(){
		int[] arr = new int[]{22,63,4,15,96,7,12,21,54,67,123};
		Arrays.sort(arr);
		System.out.println("排序后：" + Arrays.toString(arr));
		int i = 9;//要查找的数
		//Arrays.binarySearch();方法不存在返回负数；
		int t = Arrays.binarySearch(arr, i);
		System.out.println("Arrays二分法API搜索结果：" + t);
		
		
		//二分法查找，假设 i在arr中是存在的；
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max)/2;
        while(arr[mid] != i && max > min){
            if(arr[mid] > i){
                max = mid + 1;
            }else if(arr[mid] < i){
                min = mid + 1;
            }
            mid = (min + max)/2;
        }
        System.out.println(arr[mid]!=i?-1:mid);
        System.out.println(arr[mid] + "下标为：" + mid);

		
	}
	
	
    public static int search(int[] arr, int num) {  
        int min = 0;  
        int max = arr.length - 1;  
        while (min <= max) {  
            int mid = (min + max) / 2;  
            if (num > arr[mid]) {  
                min = mid + 1;  
            } else if (num < arr[mid]) {  
                max = mid - 1;  
            } else {  
                return mid;  
            }  
        }  
        return -1;  
    }

}
