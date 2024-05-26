public class Advance_patterns {

    public static void hollowRect(int totRows, int totCols){
        //outer loop
        for(int i=1;i<=totRows;i++){
            //inner loop
            for(int j=1;j<=totCols;j++){
                //cell-(i,j)
                if(i==1 ||i==totRows || j==1 ||j==totCols){
                   //boundary cells
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    //output
    //* * * * * * * * * *
    //*                 *
    //*                 *
    //*                 *
    //*                 *
    //* * * * * * * * * *
    public static void invertedAndRotatedHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    //output
    //   *
    //  **
    // ***
    //****

    public static void inverted_half_pyramid_withNumbers(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }
    //output
    //12345
    //1234
    //123
    //12
    //1

    public static void  floyds_triangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    //output
    //1
    //2 3
    //4 5 6
    //7 8 9 10
    //11 12 13 14 15

    public static void zero_one_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    //output
    //1
    //01
    //101
    //0101
    //10101

    public static void butterfly(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //output
    //*      *
    //**    **
    //***  ***
    //********
    //********
    //***  ***
    //**    **
    //*      *

    public static void solid_rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //output
        //        * * * * *
        //      * * * * *
        //    * * * * *
        //  * * * * *
        //* * * * *
    }

    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces in inverted pyramid shape
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //hollow rectangle-stars
            for(int j=1;j<=n;j++){
               if(i==1 ||i==n ||j==1 ||j==n){
                   System.out.print(" *");
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
        //output
        //         * * * * *
        //       *       *
        //     *       *
        //   *       *
        // * * * * *
    }
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=(i+(i-1));j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=(i+(i-1));j++){  //for comparisoni can also use j<=(2*i)-1
                System.out.print("*");
            }
            System.out.println();
        }
        //output
        //   *
        //  ***
        // *****
        //*******
        //*******
        // *****
        //  ***
        //   *
    }

    public static void main(String[] args) {
        hollowRect(6,10);
        //invertedAndRotatedHalfPyramid(4);
        //inverted_half_pyramid_withNumbers(5);
        //floyds_triangle(5);
        //zero_one_triangle(5);
        //butterfly(4);
        //solid_rhombus(5);
        //hollow_rhombus(5);
        //diamond(4);
    }

}
