# Exercises, day 09

## The exercise sheet [exercises_d9.pdf](exercises_d9.pdf) 

# 1 Integer Binary Tree

Done up to 1.3 Depth:
* [IntegerTreeNode.java](1_Integer_Binary_Tree/IntegerTreeNode.java) the class implementing a binary tree of integers
* [TestIntegerTreeNode.java](1_Integer_Binary_Tree/TestIntegerTreeNode.java) Testing program (output captured in its git commit messages).


## 1.4 Deletion of elements (*)
* Implemented (see above). Not trivial. Trees require some bookeeping!

## 1.5 Balancing a tree (**)
* This is interesting could not see how to do it. So asked Google and the answer
is Tree Rotation: [Wikipedia page on tree rotation](http://en.wikipedia.org/wiki/Tree_rotation). Do not
have time to work on this!

# 2 Tree as sets

## 2.1 Interface

The interface as per instruction [IntSet.java](2_Trees_as_Sets/IntSet.java)

## 2.2 Implementation as tree

* [TreeIntSet.java](2_Trees_as_Sets/TreeIntSet.java) has **IntSet** implementation as a tree. Uses 
  [IntegerTreeNode.java](2_Trees_as_Sets/IntegerTreeNode.java) to do the work. This is modified
  version of the class from exercise 1 to cope with sets and new requirements, originally I wrote
  a new class but the same code can be used.
* [TestIntSets.java](2_Trees_as_Sets/TestIntSets.java) testing script initially just for **TreeIntSet** but
  will be extended for the linked list implementation (next). *See git commit message for the output
  of the script*.


## 2.3 Implementation as list

* [ListIntSet.java](2_Trees_as_Sets/ListIntSet.java) provides **IntSet** implementation as a linked list,
  using [ListIntSetNode.java](2_Trees_as_Sets/ListIntSetNode.java). 
* Testing script for both implementations [TestIntSets.java](2_Trees_as_Sets/TestIntSets.java) shows
  that the tree implementation requires far fewer comparisons to check the the set (see git commit for output).

# 3 Trees as (sorted) lists

## 2.1 Interface

The interface as per instruction [IntSortedList.java](2_Trees_as_Sets/IntSortedList.java)

## 2.2 Implementation as tree

* [TreeIntSortedList.java](2_Trees_as_Sets/TreeIntSortedList.java) once again uses an extended
  [IntegerTreeNode.java](2_Trees_as_Sets/IntegerTreeNode.java) to do the work. Tree is
  automatically sorted on input with only a small number of operations.
* Testing script [TestIntSortedList.java](2_Trees_as_Sets/TestIntSortedList.java) works
  fine - see git commit message for the output.

## 3.3 Implementation as list

* [ListIntSortedList.java](2_Trees_as_Sets/ListIntSortedList.java) re-uses a modified
  [ListIntSetNode.java](2_Trees_as_Sets/ListIntSetNode.java).
* Testing script [TestIntSortedList.java](2_Trees_as_Sets/TestIntSortedList.java) applies
  the same test to both the tree and linked list implementation. Test shows things are
  fine - see git commit message for the output.



# 4 Abstract syntax tree (*)

* Interesting and could actually be useful in my work. No time at present.


# 5 Git internals (**)
  



