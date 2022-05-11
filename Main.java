
import java.util.Scanner;
class Matrix{
int a[][]={{2,3,5},{1,3,7},{4,2,1}};
   
        int b[][]={{1,2,3},{5,3,1},{3,2,9}};
    void add(int a[][],int b[][]){
int c[][]=new int[4][4];
      for(int i=0;i<3;i++){
       for(int j=0;j<3;j++){
       c[i][j]=a[i][j]+b[i][j];
       }
      }
      System.out.println(" after addition resultant matrix is:");
for(int i=0;i<3;i++){
       for(int j=0;j<3;j++){
      System.out.print(c[i][j]+" ");
    }
    System.out.println();
}
}
void mul(int a[][],int b[][]){
int c[][]=new int[4][4];
for(int i=0;i<3;i++){
       for(int j=0;j<3;j++){
        c[i][j]=0;
        for(int k=0;k<3;k++){
         c[i][j]+=a[i][k]*b[k][j];
        }
}
}
System.out.println("the result is:");
for(int i=0;i<3;i++){
       for(int j=0;j<3;j++){
  System.out.print(c[i][j]+" ");
       }
 System.out.println();
}
}
}
class Main{
 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
int a[][]={{2,3,5},{1,3,7},{4,2,1}};
    int b[][]={{1,2,3},{5,3,1},{3,2,9}};
    
     Matrix m=new Matrix();
     System.out.println("1.Addition 2.multiplication \n enter ur chioce");
     int ch=sc.nextInt();
     switch(ch){
      case 1:m.add(a,b);
             break;
      case 2:m.mul(a,b);
             break;
     }
    }
}
   
