# İnsertion Sort Projesi

## **[22,27,16,2,18,6]** 

### 1-Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.


1. [2,27,16,22,18,6]
2. [2,6,16,22,18,27]
3. [2,6,16,22,18,27]
4. [2,6,16,18,22,27]
5. [2,6,16,18,22,27]

### 2-Big-O gösterimini yazınız.

n+(n-1)+(n-2)+(n-3)+1 = (n*(n-1))/2 => (n^2-n)/2

**O(n^2)**

### 3-Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.


Worst Case: [27,22,18,16,6,2]

Best Case: [2,6,16,18,22,27]

### 4-Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.

18 sayısı, dizi sıralanması sonunda ([2,6,16,18,22,27]) dizinin ortasında olmasından dolayı avarage case olarak nitelendirilebilir.


## **[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.**

1. [2,3,5,8,7,94,15,6]
2. [2,3,5,8,7,9,4,15,6]
3. [2,3,4,8,7,9,5,15,6]
4. [2,3,4,5,7,9,8,15,6]
