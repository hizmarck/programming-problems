
# Weird Sort Problem

Having a sequence of _N_ integers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>N</sub>, you need to order them in a way when
no  two consecutive integers have consecutive values. In other words, for all _i_, where _0<i<N_, condition 
__a<sub>1</sub>__+1 ≠ __a<sub>1+1</sub>__ should be satisfied for the final sequence.


## Sample

__Sample Input__
- 1 2
- 1 2 3 4 5 6
- 1 1 2 2 3 3

__Sample Output__
- 2 1
- 1 3 2 4 6 5
- 1 1 3 3 2 2


[WeirdSortTest.java](../src/test/java/com/hizmarck/exercises/WeirdSortTest.java)