package bubble;

import java.util.Scanner;

public class Bubble {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("숫자 몇 개를 정렬하시겠습니까?");
    int total = sc.nextInt();
    int[] nums = new int[total];

    System.out.println("정렬할 숫자를 입력 후 엔터를 눌러주세요.");
    for (int i = 0; i < total; i++) {
      nums[i] = sc.nextInt();
    }

    for(int j = 0; j < nums.length; j++) {
      for (int k = j + 1; k < nums.length; k++) {
        if(nums[j] > nums[k]) {
          int temp = nums[k];
          nums[k] = nums[j];
          nums[j] = temp;
        }
      }
    }

    System.out.println("정렬 결과를 확인하세요");
    for(int l = 0; l < nums.length; l++) {
      System.out.print(nums[l]);
    }
  }
}
