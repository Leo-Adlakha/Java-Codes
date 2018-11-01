package Codechef_Problems;

/*Tree Walk Problem Code: TREEWLK2
Add problem to Todo list
Submit
Tweet
  
Read problems statements Mandarin , Bengali , Hindi , Russian and Vietnamese as well.
There are two people walking along a tree with N
 nodes (numbered 1
 through N
), each of them with speed 1 edge per second.

The walk of the first person is described by a sequence of nodes u1,u2,…,uK
. This person appears in node u1
 at time 0
 and walks to node u2
 using the shortest path; then, immediately after reaching u2
, walks to node u3
 using the shortest path, and so on, until reaching uK
, when this person disappears.

The walk of the second person is described by another sequence v1,v2,…,vL
in the same manner.

Count how many times these two people meet — in other words, how many times they reach the same node (including the first and last nodes of their walks) at the same time.

Input
The first line of the input contains a single integer T
 denoting the number of test cases. The description of T
 test cases follows.
The first line of each test case contains three space-separated integers N
, K
and L
.
Each of the next N−1
 lines contains two space-separated integers p
 and q
describing an edge between node p
 and node q
.
The following line contains K
 space-separated integers u1,u2,…,uK
.
The last line contains L
 space-separated integers v1,v2,…,vL
.
Output
For each test case, print a single line containing one integer — the number of times the two people meet.

Constraints
1≤T≤1,000
2≤N,K,L≤105
1≤p,q≤N
1≤ui≤N
 for each valid i
1≤vi≤N
 for each valid i
ui≠ui+1
 for each valid i
vi≠vi+1
 for each valid i
the sum of N
 in all test cases does not exceed 5⋅105
the sum of K
 in all test cases does not exceed 5⋅105
the sum of L
 in all test cases does not exceed 5⋅105
Subtasks
Subtask #1 (30 points):

2≤N,K,L≤103
the sum of N
 in all test cases does not exceed 5⋅103
the sum of K
 in all test cases does not exceed 5⋅103
the sum of L
 in all test cases does not exceed 5⋅103
Subtask #2 (70 points): original constraints

Example Input
1
5 4 3
1 2
2 3
2 4
4 5
1 4 3 5
1 3 5
Example Output
3*/

public class Tree_Walk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
