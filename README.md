### PROJECT SUMMARY FOR FUNCTIONAL INTERFACES

* [Link to official documentation](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)

````
SUPPLIER
``````
* It accepts not param but an argument is returned
* If filter does not return anything use this to return dummy values

````
Function<T,R>
``````
  - map takes in a function 
  - It accepts a particular type T and returns the result of type R
 ``````````
 Predicate<T>
 ```````````
  - It represents a boolean valued function of and argument
  -test methods returns a boolean value
  - filter takes in a predicate
  - It takes in a input T and applies condition to it 
  ````
 Consumer<T>
````
 - It accepts a single input and returns nothing
 - has two methods accept(accepts data)
 - andThen() which applies another consumer on top of another
 - forEach accepts a Consumer too 
 ````
 reduce() 
 ````
  - reduce takes in a BinaryOpeartor 
  - takes to input and applies logical expression to them

``````
FUNCTIONAL INTERFACE
``````
* Has only one abstract method but can have many static and default methods
* lambda can be applied to create any anonymous function impl to the abstract method

````
forEach
````
 - collections can be iterated using for each
 - it accepts a consumer(takes an input returns nothing.
 - map.forEach((k,v)-> sout(k+"  "+v);
 - internal structure of foreach for(String s:list) consumer.accept(s1);

````
sorted()
````
* Is used to sort a stream
* ASC - sorted() -for primitves
* DESC -sorted(Comparator.reverseOrder()) - for primitives
* For custom sort on manual objects pass a comparator impl in sorted()
* or use Comparator.comparing(Function<T,R>) and pass to sorted()
* Eg : Comparator.comparing(emp->emp.getfName()) // sort on basis of name


``````
map() and flatmap()
``````
- map takes in a function<T,R>
- flatMap() takes Stream<Stream> and returns a Stream as output
- map is a one to one mapping means one T as input and return type as R
- flatMap is a one to many mapping 
- use Flat map when single input is giving multiple values like single customer has multiple phoneNumbers
