// A Trip has three constructors
// When one argument is passed,
// it is the trip destination
// When two arguments are passed,
// they are the destination and departure cities
// When three arguments are passed,
// the last one is the mode of transportation for the trip
 public class DebugTrip {
     private String destination;
     private String departure;
     private String mode;

     private static final String DEFAULT_CITY = "Atlanta";
     private static final String DEFAULT_MODE = "car";

     // One-argument constructor
      public DebugTrip(String destination) {
         this(destination, DEFAULT_CITY, DEFAULT_MODE);
    }
 
     // Two-argument constructor
      public DebugTrip(String destination, String departure) {
         this(destination, departure, DEFAULT_MODE);  // FIXED
    }

    // Three-argument constructor
     public DebugTrip(String destination, String departure, String mode) {
         this.destination = destination;
         this.departure = departure;
         this.mode = mode;
    }

      public String getDestination() {
         return destination;
    }

      public String getDepartureCity() {
         return departure;
    }

      public String getMode() {
         return mode;
    }

    
     public static void main(String[] args) {
         DebugTrip t1 = new DebugTrip("Paris");
         DebugTrip t2 = new DebugTrip("Tokyo", "New York");
         DebugTrip t3 = new DebugTrip("Rome", "Chicago", "plane");

          System.out.println("Trip 1: " + t1.getDestination() + " from " + t1.getDepartureCity() + " by " + t1.getMode());
          System.out.println("Trip 2: " + t2.getDestination() + " from " + t2.getDepartureCity() + " by " + t2.getMode());
          System.out.println("Trip 3: " + t3.getDestination() + " from " + t3.getDepartureCity() + " by " + t3.getMode());
    }
}
