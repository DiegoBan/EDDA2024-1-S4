/* Bubble sort
Compara repetidamente pares de elementos adyacentes y los intercambia si están en el orden incorrecto. 
Este proceso se repite hasta que no se necesitan más intercambios, lo que indica que el arreglo está ordenado.
y selectionSort

Input: 
Un arreglo de enteros A=[A1, A2, A3, A4, ..., An] y su tamaño N.

Output: 
El mismo arreglo A ordenado de forma ascendente, es decir, A1 <= A2 <= A3 <= ... <= An.

* Tiempo de ejecucion:  O(n2)       orden inverso
                        omega(n)    ordenado
                        Inplace
                        Estable
*/

/* Selection Sort
Selecciona repetidamente el elemento más pequeño (o más grande, según sea necesario)
del arreglo restante y lo coloca al principio del arreglo ordenado.

Input: 
Un arreglo de enteros A=[A1, A2, A3, A4, ..., An] y su tamaño N.

Output: 
El mismo arreglo A ordenado de forma ascendente, es decir, A1 <= A2 <= A3 <= ... <= An.

* Tiempo de ejecucion:  O(n2)       siempre
                        omega(n2)   siempre
                        Inplace
                        No Estable
*/

/* Insertion Sort
Construye el arreglo ordenado uno por uno, insertando cada elemento en su posición correcta dentro de la parte ya ordenada del arreglo.

Input: 
Un arreglo de enteros A=[A1, A2, A3, A4, ..., An] y su tamaño N.

Output: 
El mismo arreglo A ordenado de forma ascendente, es decir, A1 <= A2 <= A3 <= ... <= An.

* Tiempo de ejecucion:  O(n2)       orden inverso
                        omega(n)    ordenado
                        Inplace
                        Estable
*/

/* Merge sort
Input:
Arreglo de enteros A=[A1, A2, A3, A4, ..., An]

Output:
Un arreglo "A" que es una permutacion P1, P2, P3, ..., Pn de A donde los elementos están
ordenados de forma: A1 <= A2 <= A3 <= ... <= An

* Es un algoritmo "Divide and Conquer":
    1)  Divide: dividir el problema en subproblemas de menor tamaño que el problema original, es decir,
        dividir el arreglo [p:r] donde "p" es el indice de inicio y "r" es el indice de termino en 2 subarreglos.

       A[p:q] y A[q+1:r] donde q=(p+r)/2

       .- Siempre se divide de manera entera y se aproxima al numero más bajo
       .- Un conjunto de tamaño 1 o vacio siempre esta ordenadao
       .- Se deja de hacer ramas cuando tenemos tamaño 1 en cada rama

    2)  Conquer: resolver los subproblemas de manera RECURSIVA hasta llegar al caso base, es decir,
        ordenar los subarreglos A[p:q] y A[q+1:r].

    3)  Combine: combinar las soluciones a los subproblemas para dar solucion al problema original, es decir,
        mezclar las soluciones y retornar A[p:r] ordenado.

* Tiempo de ejecucion:  O(n log n)  siempre a la mitad
                        omega(n log n)    siempre a la mitad
                        No Inplace
                        Estable
*/


/* Quick Sort
Input:
Arreglo de enteros A=[A1, A2, A3, A4, ..., An], p, r indices de inicio y término

Output:
Subarreglo A[p:r] ordenado de manera ascendente


* Es un algoritmo "Divide and Conquer":
    1)  Divide: escoger un pivote q en A[p:r]. Puede ser el ultimo elemento del subarreglo A[r]. Mover los elemetos menores a q a la izquierda en
        A[p:r] y los mayores a la derecha. (Partitioning)

    2)  Conquer: ordenar de manera recursiva con divide: A[p:q-1] y A [q+1:r]

    3)  Combine: no hacer nada.

* Tiempo de ejecucion:  O(n2)           mal pivote
                        omega(n log n)  pivote al medio
                        Inplace
                        No Estable


* Como crear funcion:
QuickSort(A,P,r)
    Si p>=r -> return
    q = Partitioning(A,P,r)
    quickSort(A,P,q-1)
    quickSort(A,q+1,r)

QuickSort(a,p,r){
 1. if p>=r -> return
 2. instanciar q con valor Partitioning(a,p,r)*
 3. QuickSort(q,p,q-1)
 4. QuickSort(q,q+1,r)
}

Partioning
    input:  A arreglo
            p indice de inicio
            r indice de término
    output: pivote q de forma que todos los elementos A[p:q-1] son menores o iguales que
    q y todos los elementos a la derecha A[q+1:r] son mayores que q.
    
    * Tiempo de ejecucion:  O(n)
                            omega(n)
                            teta(n)

    1. Instanciar q con valor r
    2. For u=p ; u<r ; u se incrementa en 1
        si A[q]>=A[u] entonces swap entre A[u] y A[p], luego p se incrementa en uno
    3. Swap entre A[q] y A[p]. Retornar p

*/
