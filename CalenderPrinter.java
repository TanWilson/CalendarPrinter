public class CalenderPrinter {
    public static void main (String[] args) {
        int x = 1;
        String y = "September ";
        String z = "";
        while ( x < 31 )
        {
            if ( x == 7 )
            {
                z = " - NO SCHOOL (LABOR DAY)";
            }
            else if ( x == 25 )
            {
                z = " - END OF THE MARKING PERIOD";
            }
            else if ( (x+1)%7 == 0 || (x+2)%7 == 0 )
            {
                z = " - WEEKEND";
            }
            else
            {
                z = "";
            }    
            System.out.println ( y + x + z ) ;
            x++;
        }    
    }
}    