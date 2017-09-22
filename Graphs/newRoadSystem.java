boolean newRoadSystem(boolean[][] roadRegister) {
    int l=roadRegister.length;
    int[][] a=new int[l][2];
    for(int i=0;i<l;i++){
        for(int j=0;j<l;j++){
            if(roadRegister[i][j]==true){
                a[i][0]+=1;
                a[j][1]+=1;
        }
      }
    }
  for(int i=0;i<a.length;i++){
      if(a[i][0]!=a[i][1])
          return false;
 }
    return true;
}
