// ---------- QUESTION 1 -----------
// Make a function that given three double values - start, stop and stepSize,
//  return a list of double values where the first element is the start value, the
//  last element is less than or equal to the stop value and all the elements are
//  the values in between, increased or decreased by the specified step size.
// Example: start=4, stop=5, stepSize=0.1 -> Return {4, 4.1, 4.2, 4.3, 4.4, 5}.
// Example: start=8, stop=-1.2, stepSize=-0.5 -> Return {8, 7.5, 7, 6.5, 6, 6.5, 5, 4.5, 4, 3.5, 3, 2.5, 2, 1.5, 1, 0.5, 0, -0.5, -1}
import java.util.ArrayList; 
import java.util.*;
class Main {
  static List<Double> rangeList(double start, double stop, double stepSize) {
    ArrayList<Double> list = new ArrayList<Double>();
    while (true) {
    list.add(start);
    if (stepSize < 0) {
      for (int i = 0;; i += 1) {
        list.add(start += stepSize); 
        if (list.get(i) == stop) {
          break;
        }
      }
    }
    if (stepSize > 0) {
    for (int i = 1;; i += 1) {
      if (list.get(i) <= stop) {
        break;
      } else {
        list.add(start += stepSize); {
      }
    }
    }
}
    return list;
  }
  }
  

  
  public static void main(String[] args) {
    System.out.println(rangeList(4.0, 2.0, -1.0));
  }
}