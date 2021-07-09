package lab4_eg;

public class WorkoutFacade {
	 /**
	 * Creates an instance of UpperBody and calls setWorkout() and viewWorkout()
	 */
	 public void viewUpperBodyWorkout() {
	 Workout workout = new UpperBody();
	 workout.setWorkout();
	 workout.viewWorkout();
	 }
	 /**
	 * Creates an instance of LowerBody and calls setWorkout() and viewWorkout()
	 */
	 public void viewLowerBodyWorkout() {
	 Workout workout = new LowerBody();
	 workout.setWorkout();
	 workout.viewWorkout();
	 }
	}

