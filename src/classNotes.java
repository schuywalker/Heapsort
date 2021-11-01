public class classNotes {

    //min heap
    //10k largest
    //descending
    // only dif, >= becomes <=

    //load first 10k nums
    //array size is 10k + 1, dont use the 0th location

    //convert array into min heap. linear time op

    //then go read a num from from file. if its <= to the top of the tree, discard. it's <= to the
    //smallest, so it cant be part of the 10k largest.
    /*
    case1 new num is smaller than lowest num in tree A[1]
    if newNum > root of tree, replace green with blue (root of tree replaced by new num), green is just A[1].
    tree might not be a min heap. but the left and right childs subtrees are minheaps.
    call min heap on the left and right child. wait no i think you call it on the top node. insert, process, continue.

    once you have 10k largest nums, you must sort into descend.
    steo by step, do comparisons, if necessary replace top node with current, then call min heapify.

    one single pass of the file

    sorting part
    rewrite heapsort for minheap. maxheap can do ascending.
    take the right most lowest number. swap with root node. call minheapify. reduce heap size by 1. repeat.

     */

}
