**VOP Exam June 10, 2024**

This exam contains 3 programming exercises, which weighs 100% of the final grade in the
VOP course. We have provided a ZIP file called **VOPExam24-Exercise.zip**.
UNZIP this file. You will find a maven project `VOPExam24-Exercise`.
Open the maven project `VOPExam24-Exercise` to see the packages containing the code snippets of the programming exercises.

To open the project, go to File -> open in IntelliJ and navigate to the `pom.xml` file in the unzipped project folder. After clicking `pom.xml` file, select the option `open as project`. It will open the project in IntelliJ.
You can find the instructions for completing the exam exercises in the file **ReadMe.md**.

**Submission**

At the end of the exam, the solution must be handed over to the Digital Exam:
- Zip your project folder and name the zip file after your SDU Username such as `abcd17.zip`
- Upload the zip file
- Just to be on safe side, download the zip file and unzip it to verify that you uploaded the right file.

**Hint**: Please read the instructions carefully before you start working on the solution.

**Exercise 1**
In this exercise, you will implement a recursive method and then and create a simple GUI interface for viewing the result.

**Task 1a**: (**marks 10**)

In this task, you are supposed to compute sum of odd numbers from `1` to `10` using recursive approach. To do this, we have provided a class called `Main.java` in `recursion` package .
`Main.java` is partially implemented and responsible for computing the sum of odd numbers from `1` to `10`, using both iterative and recursive approach.

**Provided Code**:

- An `iterativeOddSum()` method is already implemented to compute the sum of odd numbers from `1` to `10` using iterative approach.
- A `main()` method is already implemented.

Complete the implementation of the class.
- Implement `recursiveOddSum()` method to compute the sum of odd numbers from `1` to `10` using recursive approach.
- Run `Main.java` to test your implementation.

**The output should look like the following:**


    Sum of odd numbers from 1 to 10 (iterative):
    25
    Sum of odd numbers from 1 to 10 (recursive):
    25

**Task 1b**: `public class PrimaryController implements Initializable` (**marks 20**)

In this task, we have provided two classes and an FXML document namely `Application.java`, `PrimaryController.java` and `primary.fxml` respectively.
The two classes can be found in the `org.example` package while the `primary.fxml` can be found in the `org.example` package under the `resources` folder.
The `PrimaryController.java` is the controller class for the `primary.fxml` document.
Both files will be used to implement this task.

- Create the layout that can be seen below in `primary.fxml` document with the following items:

<img src="images/gui.png" alt="gui" width="320"/>

- A static `Label` that shows the text `Sum of Odd Numbers`.
- Two `RadioButtons` with `fx:id="iterativeRadio"`, `fx:id="recursiveRadio"` for selecting the relevant method to compute the sum of Odd numbers from start to end.
- Make sure the RadioButtons are in the same toggle group, and `iterativeRadio` is selected `true` by default.
- 3 static `labels` that show the text `Start`, `End,` `Output` respectively.
- Create two `TextFields` with `fx:id “start”` and `fx:id “end”` respectively.
- A `TextArea`with `fx:id="output"` for showing the sum of odd numbers from `start` to `end` based on selected radio button.
- A `Button` called `Execute` and associate it with a `executeAction()` actionHandler.
- A `Button` called `Clear` and associate it with a `clearAction()` actionHandler.

**Provided Code**:

- The `@FXML` annotated attributes for `RadioButtons` (iterativeRadio, recursiveRadio), `TextFields` (start, end), `TextArea`
  (output) are already created to make them accessible within your `PrimaryController` class.
- We have declared the actionHandlers `executeAction()` and `clearAction()`, but implementation is missing.

Complete the implementation of the `PrimaryController.java` class as follows:
- Implement `executeAction()` method
    - if `iterativeRadio` radiobutton is selected: (**Hint**: `if (iterativeRadio.isSelected())`)
        - Set the text `Sum of odd numbers from start to end (iterative)` in the `output` TextArea. (**Hint**: Get values of `start` and `end` from `TextFields`)
        - Invoke `iterativeOddSum()` of `Main.java` and append the result to the `output` TextArea. (**Hint**: Pay attention to `Integer-String`/`String-Integer` conversion (`String.valueOf()`/`Integer.parse()`))
    - if `recursiveRadio` radiobutton is selected:
        - Set the text `Sum of odd numbers from start to end (recursive)` in the `output` TextArea.
        - Invoke `recursiveOddSum()` of `Main.java` and append the result to the `output` TextArea. (**Hint**: Pay attention to `Integer-String`/`String-Integer` conversion (`String.valueOf()`/`Integer.parse()`))
- Implement `clearAction()` method
    - Clear both text fields `start` and `end`.
    - Clear text area `output`.
- Test your implementation by running the `Application.java` class in the `org.example` package. Enter `start=1` and `end=20`.
- Example of correct outputs in Figure (a) – (d).
    - Figure (a) shows the result when `Application.java` is run.

<img src="images/gui.png" alt="a" width="320"/>


- Figure (b) shows the result when `start=1` and `end=20` is entered and `Execute` button is clicked.

<img src="images/b.png" alt="b" width="320"/>


- Figure (c) shows the result when `Recursive` radio button is selected and `Execute` button is clicked.

<img src="images/c.png" alt="c" width="320"/>


- Figure (d) shows the result when `Clear` button is clicked.


<img src="images/d.png" alt="d" width="320"/>


**Exercise 2**

Economic gender inequality has long been a pervasive issue, manifesting in disparities in pay, job opportunities, and wealth accumulation between men and women. This task employs a dataset which provides gender economic inequality across the globe over a period spanning from 1981 to 2016.
In this regard, a comma-separated file called `data.csv` is provided.
Each row in the file (data.csv) represents `country`, `code`, `year`, `gender_wage_gap`. These fields can be seen as the
first entry in the `data.csv` file. This exercise is divided into four subtasks, where you need to read CSV file and sort the data with respect to different attributes.


**Task 2a**: `public class EconomicInequalityData implements Comparable <EconomicInequalityData>` (**marks 10**)


In this subtask, we have provided a class called `EconomicInequalityData.java` in the package `gender_economic_disparity`. An instance/object of the class should represent one entry in `data.csv` file. Complete the implementation of the class.
(**Hint**: Remember to use the right access modifiers for variables, constructor and methods).
- Declare 4 variables for `country(String)`, `code(String)`, `year(int)`, `wageGap(double)`.
- Create a 4 argument Constructor to initialize 4 variables.
- Create 4 Getter methods for retrieving the values of all the 4 variables. A Getter method should return the value of the variable. An example of a Getter method is given below for `getCountry(String)`:


    public String getCountry() 
    { 
      return country; 
    }

- Implement a compareTo() method, i.e., compare the `wageGap` of two `EconomicInequalityData` objects. Use the corresponding Getter methods for this implementation.
- A `toString()` method is already implemented but commented out. Uncomment this code and ensure that the called Getter methods in the `toString()` method corresponds to the ones you have created.
- A `main()` method is already implemented but the lines of code in the method are commented out. Uncomment the code under **Task 2a** only to test your implementation so far.

**The output should look like the following:**


    Sorting based on Wage Gap
    [Argentina 	 	 ARG 	 	 2004 	 	 2,08
    , Uruguay 	 	 URY 	 	 1989 	 	 22,22
    , Brazil 	 	 BRA 	 	 1981 	 	 34,21
    ]

**Task 2b**: Sorting with Comparator (**marks 10**)

- Create a class `YearComparator.java` with the signature `public class YearComparator implements Comparator<EconomicInequalityData>` in the `gender_economic_disparity` package.
    - Implement the `compare()` method to compare two `EconomicInequalityData` objects based on `year` attribute(**Hint**: Remember to use the corresponding Getter methods in the `EconomicInequalityData` object.
- Create another class `CountryComparator.java` with the signature `public class CountryComparator implements Comparator<EconomicInequalityData>` in the `gender_economic_disparity` package.
    - Implement the `compare()` method to compare two `EconomicInequalityData` objects based on `country` attribute(**Hint**: Remember to use the corresponding Getter methods in the `EconomicInequalityData` object.
- Uncomment the code under **Task 2b** in `main()` method of the `EconomicInequalityData` class to test your implementation.

**The output should look like the following:**

    Sorting based on Year
    [Brazil 	 	 BRA 	 	 1981 	 	 34,21
    , Uruguay 	 	 URY 	 	 1989 	 	 22,22
    , Argentina 	 	 ARG 	 	 2004 	 	 2,08
    ]
    Sorting based on Country
    [Argentina 	 	 ARG 	 	 2004 	 	 2,08
    , Brazil 	 	 BRA 	 	 1981 	 	 34,21
    , Uruguay 	 	 URY 	 	 1989 	 	 22,22
    ]

**Task 2c**: `public class ReadCSV` (**marks 15**)

The purpose of this task is to read economic inequality data from a file `data.csv` and return an instance of the `EconomicInequalityData` class with the highest `wageGap`.
We have provided a class `ReadCSV.java` in the `gender_economic_disparity` package.

**Provided Code**

- A private variable `file` of the type `File`, is already declared.
- A constructor `ReadCSV(String fileName)` that initializes `file` variable, is already created.

Complete the implementation of `ReadCSV.java` class as follows:

- Implement the `readFile()` method in the class.
    - Open a file and read each line in the file `data.csv.` Remember that this file is comma separated “,” and relevant fields to be read are `country`, `code`, `year`, `wageGap`.
    - For each line, parse the relevant fields into their appropriate types and create a new instance of `EconomicInequalityData`.


    (**Hint**) 
    - Remember to skip the first line in the file - as it is an information line.
    - Use split() method to extract the relevant fields
    - Pay attention to numeric and double strings (`Integer.parseInt()/Double.parseDouble()`)

- While iterating through the data, compare the `wageGap` of each instance of `EconomicInequalityData` with the highest `wageGap` found so far.
    - Save the instance with the highest `wageGap`.
    - Once all data has been processed, return the instance of `EconomicInequalityData`, which has the highest `wageGap`.
    - Ensure that you enclose the input stream in a try – catch clause and close your input stream after use.
    - Make sure to catch the relevant exceptions that can be thrown.
- Test your implementations, by uncommenting and executing the `main()` method of the `ReadCSV.java`.

**The output should look like the following:**

    The country with the highest wage gap is Vietnam: 10.71

**Exercise 3**

This exercise is based on multithreading, thread synchronization, thread communication and file writing.
In this exercise, you need to create two threads, which write to a text file `file.txt`, such that `thread 1` writes a sentence in the text file `How are you?`
and `thread 2` writes a sentence `I am fine`. You need to guarantee the orderly execution of thread 1, and thread 2, i.e.,
One sentence `How are you?` corresponds to second sentence `I am fine` and so on.

In this task, we have provided 2 classes called `ThreadDemo.java` and `WriteFile.java` in the package multithreading.

**Task 3a**: `public class WriteFile` (**marks 20**)

**Provided Code**

- A private `Boolean` variable `flag` is already declared
- A private `String` variable `fileName` is already declared
- A constructor is already declared to initialize the private variables

Complete the implementation of `WriteFile.java`.

- Implement `write1()` method to write `How are you?` in the text file `file.txt`.
- Implement `write2()` method to write `I am fine` in the text file `file.txt`.

(**Hint for `write1()` and `write2()`**):
- Avoid race condition between threads.
- Use/Update the boolean variable `flag` for waiting/waking up the threads in order to guarantee the orderly execution of threads, i.e., `thread 1` writes first and notify `thread 2`, then `thread 2` writes and notify `thread 1` and so on... This is similar to shared buffer problem, where `producer` thread produces first and then `consumer` thread consumes....
- Ensure that you enclose the output stream in a try – catch clause and close your output stream after use.
- Make sure to catch the relevant exceptions that can be thrown for file/threads.

**Task 3b**: `public class Task1 implements Runnable`, `public class Task2 implements Runnable` (**marks 15**)

(**Hint**: Remember to use the right access modifiers for variables, constructor and methods).

- Create a class `Task1.java` which implements `Runnable` interface in the `multithreading` package.
    - Declare a variable `wr` of type `WriteFile`
    - Create a one argument constructor to initialize the variable `wr`.
    - Implement the `run()` method that invokes `write1()` method of `WriteFile` instance `3` times.

- Create another class `Task2.java` which implements `Runnable` interface in the `multithreading` package.
    - Declare a variable `wr` of type `WriteFile`
    - Create a one argument constructor to initialize the variable `wr`.
    - Implement the `run()` method that invokes `write2()` method of `WriteFile` instance `3` times.

- Test the implementation by running the `ThreadDemo.java`, uncomment the code in the `main()` method.

**The output `file.txt` should look like the following:**


    How are you?
    I am fine
    How are you?
    I am fine
    How are you?
    I am fine
