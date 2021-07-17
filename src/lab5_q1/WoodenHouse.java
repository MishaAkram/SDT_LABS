package lab5_q1;
public class WoodenHouse extends Building {
@Override
void walls() {
System.out.println("Wooden house walls build");
}
@Override
void foundation() {
System.out.println("Wooden house foundation layed! Start building.");
}
@Override
void pillars() {
System.out.println("Wooden house pillars made");
}
void windows() {
System.out.println("Wooden house windows installed");
}
}