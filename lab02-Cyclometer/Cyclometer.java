//Mason Chin
//February 5th
//CSE002
//The program will record the time elapsed of a bicycle in seconds and the number of rotations of the front wheel during that time.
//

public class Cyclometer {
    public static void main(String[] args) {
        
    // variables that will store number of seconds and number of counts for each trip
        int secsTrip1=480;
        int secsTrip2=3220;
        int countsTrip1=1561;
        int countsTrip2=9037;
        
    // variables for constants and storing distances
        double wheelDiameter=27.0,
        PI=3.14159,
        feetPerMile=5280,
        inchesPerFoot=12,
        secondsPerMinute=60;
        double distanceTrip1, distanceTrip2, totalDistance;
    
    //print variables that store number of seconds and the counts
        System.out.println("Trip 1 took"+
            (secsTrip1/secondsPerMinute)+"minutes and had"+
            countsTrip1+" counts.");
            
        System.out.println("Trip 2 took"+
            (secsTrip2/secondsPerMinute)+" minutes and had"+
            countsTrip2+" counts.");
            
    //compute the values for the distances
    
        distanceTrip1=countsTrip1*wheelDiameter*PI;  //gives distance in inches
        distanceTrip1/=inchesPerFoot*feetPerMile;    //gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
    //print out distances
        System.out.println("Trip 1 was"+ distanceTrip1+ "miles");
        System.out.println("Trip 2 was"+ distanceTrip2+ "miles");
        System.out.println("The total distance was"+ totalDistance +"miles");
    }

}