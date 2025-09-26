public class DebugPen {
    private String color;
    private String point;

      public DebugPen() {
         color = "black";
         point = "fine";
    }
       public DebugPen(String color, String point) {
         this.color = color;   
         this.point = point;   
     }

       public String getColor() {
          return color;
     }
        public String getPoint() {
          return point;
    }
        public static void main(String[] args) {
          DebugPen p1 = new DebugPen();               
          DebugPen p2 = new DebugPen("blue", "medium"); 

           System.out.println("Pen 1: " + p1.getColor() + ", " + p1.getPoint());
           System.out.println("Pen 2: " + p2.getColor() + ", " + p2.getPoint());
    }
}
