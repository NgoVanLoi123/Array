import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập so dòng ma tran 1:");
        int n=sc.nextInt();
        System.out.print("Nhập số cột ma tran 1:");
        int m=sc.nextInt();
        int [][]array1 =new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("a["+i+"]["+j+"]=");
                array1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(array1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.print("Nhập so dòng ma tran 2:");
        int p=sc.nextInt();
        System.out.print("Nhập số cột ma tran 2:");
        int q=sc.nextInt();
        int [][]array2 =new int[p][q];
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                System.out.print("a["+i+"]["+j+"]=");
                array2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println();
        }

        if(n==p && m==q){
            int [][]array3=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    array3[i][j]=array1[i][j]+array2[i][j];
                }
            }
            System.out.println("Tổng 2 ma tran là:");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(array3[i][j]+ "\t");
                }
                System.out.println();
            }
        }


    }
}
