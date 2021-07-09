package lab4_eg;
import java.util.ArrayList;
import java.util.List;
public class LowerBody implements Workout {
 private List<Exercise> exercises = new ArrayList<>();
 /**
 * Add lower body exercises to an ArrayList
 */
 @Override
 public void setWorkout() {
 exercises.add(new Exercise(1, "Squats"));
 exercises.add(new Exercise(2, "Calf raises"));
 exercises.add(new Exercise(3, "Lunges"));
 }
 /**
 * Loop through the list of exercises and print them out
 */
 @Override
 public void viewWorkout() {
 System.out.println("LowerBody Workout");
 for(Exercise exercise : exercises){
 System.out.println("Exercise: " + exercise.getName());
 }
 }}
