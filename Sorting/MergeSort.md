# Merge Sort Projesi

## **[16,21,11,8,12,22]**

### 1-Diziyi Merge Sort'a göre sıralayınız
                 [16,21,11,8,12,22]
                [16,21,11]  [8,12,22]
            [16] [21,11]      [8] [12,22]
        [16] [21] [11]         [8] [12] [22]
        [16] [11,21]              [8] [12,22]   
        [11,16,21]                  [8,12,22]
                  [8,11,12,16,21,22]


### 2-Big-O gösterimini yazınız 

Dizinin sürekli ikiye bölünmesinden dolayı 2^x=n 'den x=n*logn olacaktır.

**O(nlogn)**