/*Activity 1 – Practicing Dart
100 points

1.) Write a program that prints "Hello, World!" to the console.
2.) Declare variables of different types (int, double, String, bool) and print their values.
3.) Create a program that checks if a number is even or odd.
4.) Write a program to determine the equivalent grade of a student using if-else:
* A = More than 95
* B = More than 90
* C = 85 and above
* Continue this pattern...
5.) Write a program that creates a list of numbers and a list of strings, then prints all the elements.*/
void main() {
  var ageList = [6, 14, 19, 20];

  for (var ages in ageList){
    print(ages);
  }

  var nameList = ["Ken", "Kenny", "Maddy"];

  for (var names in nameList){
    print(names);
  }
}