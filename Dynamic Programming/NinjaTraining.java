public class NinjaTraining {
     static int f(int day , int last , int points[][]) {
        if(day==0) {
            int maxi =0;
            for(int task =0; task<3 ; task++) {
                if(task != last) {
                    maxi = Math.max(maxi , points[0][task] );

                }
            }
            return maxi;

        }
        int maxi =0; 
        for(int task=0; task<3; task++) {
            if(task!=last) {
                int point = points[day][task] +  f (day-1, task , points);
                maxi = Math.max(maxi, point);
            }

        }
        return maxi;

    
    
}
static int ninjaTrainings(int n ,int last,int points[][]) {
    return f(n-1, 3 , points);
}
public static void main(String[] args) {
    
   int points[][] = {{2,3,4} , {4,8,9}};
   int n = points.length;
   ninjaTrainings(n,3,points);
   System.out.println(   ninjaTrainings(n,3,points)   );
}
}