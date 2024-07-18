package algorithms;

public class SegmentTree{
    long [] seg;
    int n;
    public void buildSegmentTree(long [] a){
        n = a.length;
        seg = new long[n*4];
        buildTree(0,0,n-1,a);
    }

    private void buildTree(int idx, int l, int r, long[] a) {
        if(l==r){
            seg[idx] = a[l];
            return;
        }
        buildTree(idx*2+1,l,(l+r)/2,a);
        buildTree(idx*2+2,(l+r)/2+1,r,a);
        seg[idx] = seg[idx*2+1]+ seg[idx*2+2];
    }
    public void update (int pos,long value){
        updateValue(pos,value,0,0,n-1);
    }

    private void updateValue(int pos, long value, int node, int l, int r) {
        if(l==r){
            seg[node] = value;
            return;
        }
        int mid = (l+r)/2;
        if(pos<=mid){
            updateValue(pos,value,node*2+1,l,mid);
        }else{
            updateValue(pos,value,node*2+2,mid+1,r);
        }
        seg[node] = seg[node*2+1] +seg[node*2+2];
    }
    public long query(int start,int end){
        return RSQ(0,0,n-1,start,end);
    }

    private long RSQ(int idx,int l, int r, int start, int end) {
        if(l>end || r<start)return 0;
        if(l>=start && r<=end)return seg[idx];
        long leftSubTree = RSQ(idx*2+1,l,(l+r)/2,start,end);
        long rightSubTree = RSQ(idx*2+2,(l+r)/2+1,r,start,end);
        return leftSubTree+rightSubTree;
    }
}