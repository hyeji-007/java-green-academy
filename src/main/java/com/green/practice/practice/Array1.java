package com.green.practice.practice;

public class Array1 {
    /*
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int idx = 0;
        for (int number : numbers) {
            answer[idx++] = number * 2;
        }
        return answer;
    }
     */
    public class ManualSortExample {
        public static void main(String[] args) {
            int[] array = {5, 2, 8, 1, 3};

            // 오름차순 정렬
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        // 두 요소를 교환
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }

            System.out.print("오름차순 정렬: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }

    }
    public class ManualSortExample2 {
        public static void main(String[] args) {
            int[] array = {5, 2, 8, 1, 3};

            // 내림차순 정렬
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] < array[j + 1]) {
                        // 두 요소를 교환
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }

            System.out.print("내림차순 정렬: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
    }




    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int idx = 0;
        for (int number : numbers) {
            answer[idx++] = number * 2;
        }
        return answer;
    }






}
