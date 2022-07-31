public class AssignmentQ1 {
    public static void main(String[] args) {
        int n=10;
        for(int i=0; i<n; i++){

//             Letter I
            for(int j=0; j<n; j++){
                if(i==0 || j==(n-1)/2 || i==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // Letter N
            for(int j=0; j<n; j++){
                if(j==0 || j==n-1 || i-j==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // Latter E
            for(int j=0; j<n; j++){
                if(i==0 || i==n-1 || i==(n-1)/2 || j==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

            //Letter U
            for(int j=0; j<n; j++){
                if(j==0 || j==n-1 || i==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

            //          letter R
            for(int j=0; j<n; j++){
                if(j==0||  i==0 || i==(n-1)/2 || (i<(n-1)/2&&j==(n-1)/2+n/2) || i-j==(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

            //          letter O
            for(int j=0; j<n; j++){
                if(j==0||  i==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

            // Letter N
            for(int j=0; j<n; j++){
                if(j==0 || j==n-1 || i-j==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

    // Letter A

//            for(int j=0; j<n; j++){
//                if(j==0||  i==0 || i==(n-1)/2 || j==n-1){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }


            System.out.println(" ");
        }
    }
}
