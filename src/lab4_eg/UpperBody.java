package lab4_eg;

import java.util.ArrayList;
import java.util.List;
public class UpperBody implements Workout {
 private List<Exercise> exercises = new ArrayList<>();
 /**
 * Add upper body exercises to an ArrayList
  */
  @Override
  public void setWorkout() {
  exercises.add(new Exercise(1, "Bench Press"));
  exercises.add(new Exercise(2, "Push Ups"));
  exercises.add(new Exercise(3, "Inline Bench Press"));
  }
  /**
  * Loop through the list of Exercises and print them out
  */
  @Override
  public void viewWorkout() {
  System.out.println("UpperBody Workout");
  for(Exercise exercise : exercises){
  System.out.println("Exercise: " + exercise.getName());
  }
  }
 }
