package lab4_eg;

public class WorkoutClient {
	 public static void main(String[] args){
	 WorkoutFacade workoutFacade = new WorkoutFacade();
	 workoutFacade.viewUpperBodyWorkout();
	 System.out.println();
	 workoutFacade.viewLowerBodyWorkout();
	 }
	}
