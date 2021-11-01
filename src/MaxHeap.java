

public class MaxHeap {

    public int[] A;
    public int heap_size;
    // will rebuild in a non-static context using heap_size instead of getHeap_Size

    public MaxHeap(int[] A){
        this.A = A;
        this.heap_size = A.length-1;

    }

    public void heapsort(){
        Build_Max_Heap();
        for (int i = A.length-1; i > 1; i--){
            swap(1, i);
            heap_size--;
            Max_Heapify(1);
        }
    }




    public void Build_Max_Heap(){
        heap_size = A.length-1;
        for(int i = (int)Math.floor((A.length-1)/2); i > 0; i--){
            //from lowest, rightmost non-leaf node, down to root
            //Max_Heapify requires that children both be Max_Heaps, so we work from lowest parent to highest
            Max_Heapify(i);
        }

    }

    public void Max_Heapify(int i){
        //children of A[i] are both max-heaps
        //max-heap means when each node looks down, both it's children are smaller
        //not necessarily sorted

/* From Assignment:::
Work on A[i]:
1 pick and move the largest one among A[i] and its child(ren) to A[i]
2 move A[i] to the position of the picked child
2 Recursively move to and work on the node at the picked child’s old position.
3 Recursion exit conditions:
 (1) The one picked is A[i] itself.
 (2) A[i] is a leaf
 (Both conditions indicate the subtree rooted A[i] is already a max-heap)
*/

// we can skip A[floor(n/2)+1....n] because they are all leaf nodes

    if (i == 0) {return;}//array index 0 not used

    if (i >= A.length) throw new IllegalArgumentException("i cannot be greater than array size");

    if(isLeafNode(i)){
        return; //if i is leaf node
    }

    int largestNode;

    int leftChildIndex = getLeftChildIndex(i);//i is seatNum
    int rightChildIndex = getRightChildIndex(i);

    if (rightChildIndex != -1 && A[i] < A[rightChildIndex]){
        largestNode = rightChildIndex;//if right child bigger, pointer moves to right child
    }
    else {
        largestNode = i;
    }
    if (leftChildIndex != -1 && A[largestNode] < A[leftChildIndex]){
        largestNode = leftChildIndex;//if left child bigger, move pointer to left child
    }

        // if we end up making a swap, largestNode is != i, and we now need to check this child
        // because they could have had but lost maxHeap status.
        // of course if its a leaf node, then this is not necessary. leaf node seatNum will be >= floor(heapsize/2) (because nodes at each level double everytime)
    if (largestNode != i){

        swap(largestNode,i);

        //heap may be damaged. repair
            Max_Heapify(largestNode);



    }



    }

    public void swap(int idx, int idx2){
        int temp = A[idx];
        A[idx] = A[idx2];
        A[idx2] = temp;
    }

    public int getLeftChildIndex(int SeatNum){
        int ret = SeatNum*2;
        if (ret > getHeap_size(A)) {//heap_size is array index -1, adjusts for A index 0
            return -1;
        }
        //Seat number is actually just the array index location;
        else return SeatNum*2;
    }
    public int getRightChildIndex(int SeatNum){
        int ret = SeatNum*2 + 1;
        if (ret > getHeap_size(A)) { //heap_size is array index -1, adjusts for A index 0
            return -1;
        }

        return ret;
    }
    public int getParentIndex(int SeatNum){
        return (int)Math.floor(SeatNum/2);
    }

    public void printA(){
        for (int i=1; i < A.length; i++){
            System.out.print(A[i]+", ");
        }
        System.out.println();
    }

    public boolean isLeafNode(int i){
//        if(i > ((int)((A.length-1)/2))){ //-1 adjusts for A index 0
        if(i > (this.heap_size/2)){ //-1 adjusts for A index 0
            return true;
        }
        else return false;
    }

    public int getHeap_size(int[] A){
//        return A.length-1;
        return this.heap_size;
    }

    //not currently using this method
    public int getNodeHeight(int nodesSeat){
        // node and nodesSeat are both actually just an array index.
        //node height is number of edges
        //will be == floor(log2 (nodesSeat)
        // root node = 2^0 which has no edges
        // 2nd row is 2 or 3 which = 2^1
        // 3rd row is max 7. floor of log is 2^2... etc
        return (int) (Math.log(nodesSeat) / Math.log(2));
    }

}
