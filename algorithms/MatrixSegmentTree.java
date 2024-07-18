package algorithms;

public class MatrixSegmentTree {
    int [][] seg;
    int [][] a;
    int m,n;
    public void buildTree(int [][] a){
        this.a = a;
        m = a.length;
        n = a[0].length;
        seg = new int[4*m][4*n];
        buildX(0,0,m-1);
    }

    private void buildX(int nodeX, int startX, int endX) {
        if(startX==endX){
            buildY(nodeX,0,0,n-1,startX,endX);
        }else{
            int mid = (startX + endX)/2;
            buildX(nodeX*2+1,startX,mid);
            buildX(nodeX*2+2,mid+1,endX);
            buildY(nodeX,0,0,n-1,startX,endX); // intermediate segment tree construction.
        }
    }

    private void buildY(int nodeX,int nodeY, int startY, int endY, int startX,int endX) {
        if(startY == endY){
            if(startX==endX) // here i am handling leaf segment tree.
                seg[nodeX][nodeY] = a[startX][endY];
            else // intermediate segment tree.
                seg[nodeX][nodeY] = seg[nodeX*2+1][nodeY] + seg[nodeX*2+2][nodeY];
        }else{
            int mid = (startY + endY)/2;
            buildY(nodeX,nodeY*2+1,startY,mid,startX,endX);
            buildY(nodeX,nodeY*2+2,mid+1,endY,startX,endX);
            seg[nodeX][nodeY] = seg[nodeX][nodeY*2+1] + seg[nodeX][nodeY*2+2];
        }
    }

    public int query(int x1,int y1,int x2,int y2){
        return queryX(0,m-1,0,x1,x2,y1,y2);
    }

    private int queryX(int startX,int endX,int nodeX,int x1, int x2, int y1, int y2) {
        if(endX<x1 || x2<startX)return 0;
        if(startX>=x1 && endX<=x2){
            return queryY(0,n-1,nodeX,0,y1,y2);
        }

        int mid = (startX + endX)/2;
        int left = queryX(startX,mid,nodeX*2+1,x1,x2,y1,y2);
        int right = queryX(mid+1,endX,nodeX*2+2,x1,x2,y1,y2);
        return left+right;

    }

    private int queryY(int startY, int endY, int nodeX, int nodeY, int y1, int y2) {
        if(endY<y1 || y2<startY)return 0;
        if(startY>=y1 && endY<=y2)return seg[nodeX][nodeY];

        int mid = (startY + endY)/2;
        int left = queryY(startY,mid,nodeX,nodeY*2+1,y1,y2);
        int right = queryY(mid+1,endY,nodeX,nodeY*2+2,y1,y2);
        return left+right;
    }
}