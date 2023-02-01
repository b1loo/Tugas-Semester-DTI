/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.akhir.dti;

/**
 *
 * @author Asus TUF
 */
public class TugasAkhirDTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=5;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(i==2&&j==1)
                    System.out.print("  ");
                    else if(i==4&&j==5)
                    System.out.print("  ");
                    else if(i==1||i==3||i==n||j==n||j==1)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                for(int j=1;j<=7;j++)
                {
                    if(j==1||j==7)
                    System.out.print("  ");
                    else if(i==1||i==3||i==n||j==6)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                for(int j=1;j<=n;j++)
                {
                    if(j==1||j==n||j==i)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                System.out.println();

}
    }
}
