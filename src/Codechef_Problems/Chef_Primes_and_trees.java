package Codechef_Problems;

/*Chef, Primes and Trees (Challenge) Problem Code: PRITREE
Add problem to Todo list
Submit
Tweet
  
Read problems statements Hindi , Vietnamese , Mandarin Chinese , Russian and Bengali as well.
Chef loves prime numbers and trees.

One day, Chef received N
 nodes (numbered 1
 through N
) as a gift. There are no edges between them yet, but each node contains a value; let's denote the value in node i
 by Vi
. Since Chef likes trees, he wants to form a tree by adding N−1
edges between these nodes.

Chef defines a subtree as any connected component obtained after deleting an edge. A tree with N
 nodes has 2(N−1)
 subtrees. A prime subtree is a subtree such that the sum of values in its nodes is a prime number.

Since Chef likes prime numbers too, he wants to maximize the number of prime subtrees in the resulting tree. Help him solve this difficult problem!

Input
The first line of the input contains a single integer N
.
The second line contains N
 space-separated integers V1,V2,…,VN
.
Output
Print N−1
 lines. Each of these lines should contain two space-separated integers u
 and v
 (1≤u,v≤N
) denoting an edge between nodes u
 and v
. The graph formed by these edges must be a tree.

Constraints
1≤N≤1,000
1≤Vi≤20,000
 for each valid i
Example Input
4
1 5 2 3
Example Output
1 3
3 2
3 4
Explanation
Example case 1: We can form a tree by adding edges (1,3)
, (3,2)
 and (3,4)
. The sums of values in nodes of its subtrees are 1,3,5,6,8,10
, so there are two prime subtrees (the ones with sums 3
 and 5
).

Scoring
The score for each test case (and therefore each test file) is P/(N−1)
, where P
is the number of prime subtrees. The score of a submission is the sum of its scores for all test files. For the example output, the score would be 2/3≐0.666666
.

If the output of your solution is not a valid tree, its verdict will be Wrong Answer.

Test Generation Process
There are twenty test cases. During the contest, the displayed score will account for exactly four test files, i.e. your score reflects your submission's performance on 20% (4/20) of the test files. However, if your program gets a non-AC verdict on any test file, your submission's verdict will be non-AC. In other words, an AC verdict denotes that your program runs successfully on all the test files. After the end of the contest, your score will be changed to include the sum of your program's scores over the other sixteen test files.

The pseudocode used for generating all tests is given below. Assume that the function rand(l, r) generates a uniformly random integer between l
 and r
(both inclusive).

N := rand(500, 1000)
for i in 1..N:
    V[i] := rand(1, 20000)*/

public class Chef_Primes_and_trees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
