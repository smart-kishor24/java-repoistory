/*package kishor;
import java.util.*;
class EventDemo1{
	String name;
	int marks;
	EventDemo1(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
	@Override 
public String toString() {
		return name+ " " + marks;
	}
}
class AIML{
	public static void main(String[] args) {
		List<EventDemo1> students=new ArrayList<>();
		students.add(new EventDemo1("kishor",22));
		students.add(new EventDemo1("Rahul",24));
		Comparator<EventDemo1>byName=(s1,s2)->
		s1.name.compareTo(s2.name);
students.sort(byName);
		System.out.println(students);
	}
}

		// comprable with string include with a method , constructor, comparative and output 


package kishor;

import java.util.*;

class EventDemo implements Comparable<EventDemo> {
    String name;

    EventDemo(String name) {
        this.name = name;
    }

    public int compareTo(EventDemo other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return name;
    }
}

class AIML {
    public static void main(String[] args) {

        List<EventDemo> employees = new ArrayList<>();

        employees.add(new EventDemo("kishor"));
        employees.add(new EventDemo("Koti"));
        employees.add(new EventDemo("chandan"));

        System.out.println("Before sorting:");
        for (EventDemo employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees);

        System.out.println("After sorting:");
        for (EventDemo employee : employees) {
            System.out.println(employee);
        }
    }
}



package kishor;
import java.util.*;
class Employee implements Comparable <Employee>{
	String name;
	int salary;
	 Employee(String name,int salary) {
		 this.name=name;
		 this.salary=salary;
	 }
	 public int compareTo(Employee other){
		 int result=Integer.compare(this.salary, other.salary);
		 if(result!=0) {
			 return result;
		 }
		 return this.name.compareTo(other.name);
		 
	 }
	 public String toString(){
	 return"name"  + name + "salary" + salary;
		 
 		 
	 }
	 
}
class AIML{
	public static void main(String[] args) {
		List<Employee> employee=new ArrayList<>();
		employee.add(new Employee("Kishor",50000));
		employee.add(new Employee("Koti",40000));
		employee.add(new Employee("vishnu",30000));
		System.out.println("before sorting");
		for(Employee employees:employee) {
			System.out.println(employee);
		}
		Collections.sort(employee);
		System.out.println("/n After sorting");
		for(Employee em:employee) {
			System.out.println(em);
		}
	}
}


package kishor;
class AIML{
	public static void main(String[] args) {
		Thread t1=new Thread(()->{
			System.out.println("task 1 running");
		});
		Thread t2=new Thread(()->{
			System.out.println("task 2 running");
		});		
		t1.start();
		t2.start();
	}
}

package kishor;
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread is running");
		
		
	}
	
}
class AIML{
	public static void main(String[] args) {
		MyThread thread=new MyThread();
		thread.start();
	}
}

package kishor;
class MyThread implements Runnable{
	@Override
	public void run() {
		System.out.println("task running");
	}


}
class AIML{
	public static void main(String[] args) {
		Thread thread=new Thread(new MyThread());
		thread.start();
	}
}


package kishor;

public class AIML {
    public static void main(String[] args) {
        Thread t = new Thread(()-> {
            System.out.println("Thread is running...");
        });

        t.start();
    }
}

package kishor;
class AIML{
	public static void main(String[] args) {
		System.out.println("Start task");
		try {
			Thread.sleep(8000);
			
		}
		catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("task complete");
	}
}

package kishor;
class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println(e);{
		}
			
		}
	}
}

class AIML {
	public static void main (String[]args) {
		MyThread t1=new MyThread();
		MyThread t2= new MyThread();
		t1.setName("Kishor");
		t2.setName("potti frnd");
				
		t1.start();
		t2.start();
		
	}

}

package kishor;
class Mytask extends Thread{
	public void run() {
		System.out.println("task is running");
		
	}
}
class AIML{
	public static void main(String[] args) {
		Mytask t1 = new Mytask();
		Mytask t2 = new Mytask();
		t1.start();
		t2.start();
	}
}


package kishor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class AIML{
	public static void main(String[]args) {
		ExecutorService executor=Executors.newFixedThreadPool(3);
		//submit task 1
		executor.submit(()->{
			System.out.println("task1 executes by "+ Thread.currentThread().getName());
		});
		//submit task 2
		executor.submit(()->{
			System.out.println("task2 executes by "+ Thread.currentThread().getName());
		});
		//submit task3 
		executor.submit(()->{
			System.out.println("task3 executes by "+ Thread.currentThread().getName());
		});
		//submit task4 
				executor.submit(()->{
					System.out.println("task4 executes by "+ Thread.currentThread().getName());
				});
		executor.shutdown();
	}
}


package kishor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    private String taskName;
    MyTask(String taskName) {
        this.taskName = taskName;
    }
    public void run() {
        System.out.println(taskName + " " + Thread.currentThread());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class AIML {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(new MyTask("Task-A"));
        executor.submit(new MyTask("Task-B"));
        executor.submit(new MyTask("Task-C"));
        executor.shutdown();
    }
}

package kishor;

import java.util.concurrent.*;

public class AIML {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Running in  " + Thread.currentThread().getName());
            return 100; 
        }, executor);

        future.thenApply(value -> value + 50).thenAccept(result -> {
        
        System.out.println("Result from future: " + result);
        }).join();
        executor.shutdown();
    }
}

package kishor;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AIML{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        List<Integer> evennumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evennumbers);
    }
}


package kishor;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AIML{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "alice", "bob");

        List<String> result = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("result");
    }
}

package kishor;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class AIML{
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
            "John", "Alexander", "Bob", "Michael", "Emma", "David"
        );

        List<String> result = names.stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}


package kishor;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AIML {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
            5, 20, 15, 30, 20, 8, 25, 15, 12, 30, 7, 40
        );

        List<Integer> result = numbers.stream()
                .distinct()                    // Remove duplicate values
                .filter(n -> n > 10)            // Keep numbers greater than 10
                .map(n -> n)                    // Process/map the numbers
                .sorted((a, b) -> b - a)        // Sort in descending order
                .limit(3)                       // Take first 3 numbers
                .collect(Collectors.toList());

        int sum = result.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println("First three numbers: " + result);
        System.out.println("Sum: " + sum);
    }
}

package kishor;

interface Calculator {
	int add(int a, int b);
}
public class AIML {
	public static void main(String[]args) {
       Calculator c = (a,b)->a+b;
       int result = c.add(10,20);
       System.out.println(result);
       System.out.println(c.add(29,31));
	}
}

package kishor;

interface Message {
	void show(String msg);
}
public class AIML {
	public static void main(String[]args) {
    Message m = msg -> System.out.println(msg);
    m.show("hello");
    }
}




package kishor;
interface Addition {
    int add(int a, int b);
}

public class AIML {
    public static void main(String[] args) {

        Addition obj = (a, b) -> a + b;

        int result = obj.add(10, 20);

        System.out.println("Result = " + result);
    }
}*/

// DSA Starting Here //


 









