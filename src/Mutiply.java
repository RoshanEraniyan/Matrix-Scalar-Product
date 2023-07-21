import java.util.*;


class Multiply
{
    public static void scalarMultiply(int[][] array,int b)
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[0].length;j++)
            {
                array[i][j]=array[i][j]*b;
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] array=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        int b=sc.nextInt();
        scalarMultiply(array,b);
    }
}
