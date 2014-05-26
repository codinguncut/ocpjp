# OCPJP Syllabus

## 03 Class Design
* fundamentals
    * constructor
    * access
        * public
        * package
        * default
        * private
* overloading
    * method
    * constructor
* inheritance
    * runtime polymorphism
    * covariant return types
    * overriding
    * superclass methods
    * type conversion
        * upcast, downcast
    * instanceof
* packages
    * static imports

## 04 Advanced Class Design
* abstract classes
* final
* static
* nested classes
* enum

## 05 Object Orientation
* interfaces
* composition
* patterns
    * singleton
    * factory
    * DAO

## 06 Generic Collections
* generics
    * diamond
    * raw types
    * methods
    * subtyping
    * wildcard
* collection
    * "components"
        * ArrayList
        * LinkedList
        * HashSet
        * TreeSet
        * HashMap
        * TreeMap
        * PriorityQueue
    * Iterator
    * algorithms
        * sort
        * search
        * shuffle
    * arrays


## 07 Strings
* processing
    * search
    * parsing
* regexp
* formatting

## 08 IO
* console
* streams
    * char streams
    * byte streams

## 09 NIO
* path
    * getting
    * comparing
* files class
    * properties, metadata
    * copying
    * moving
    * deleting
* walking
* finding
* watching

## 10 JDBC
* connecting
* querying
    * statement
* transactions
    * rowset

## 11 Exceptions Assertions
* overview
    * throwing
    * unhandled
* try with
* exception types
    * exception
    * runtimeexception
    * error
    * throws clause
* custom exceptions
* assertions

## 12 Localization
* locales
* resource bundle
    * PropertyResourceBundle
    * ListResourceBundle
    * loading
* formatting for local culture
    * NumberFormat
    * DateFormat

## 13 Threads
* states
* access problems
    * synchronization
    * deadlocks
    * wait, notify

## 14 Concurrency
* java.util.concurrent
    * semphore
    * CountDownLatch
    * Exchanger
    * CyclicBarrier
    * Phaser
    * Concurrent Collections
* Atomic Variables and Locks
    * atomic variables
    * locks
    * conditions
* Executor, Threadpools
    * executor
    * Callable, Executor, ExecutorService, ThreadPool, Future
    * ThreadFactory
    * ThreadLocalRandom
    * TimeUnit
* Parallel Fork/Join

# TODO
## Prio 1
* IO 
    * Console
    * Byte Stream, Char Stream
* NIO
    * Path
        * relativize
        * check, delete, copy, move
        * read attributes
        * recurse
        * PathMatcher
    * Files
    * Tree Visitor
    * PatchMatcher
* JDBC
    * Statement
    * Connection
    * execute
        * ...Query
        * ...Update
    * ResultSet
    * Savepoint, commit, autocommit, rollback
* Localization
    * Locale
    * resource bundle, list
    * NumberFormat, DateFormat
* Concurrency
    * atomic vars
    * overview of java.util.concurrent
    * fork, join
    * locks
    * TimeUnit
    * ThreadLocalRandom
* Collections
    * iterable
        * collection
        * list
        * set
        * queue
    * map
    * sort/search arrays and lists

## Prio 2
* Strings
    * StringBuffer
    * StringBuilder
* regex
    * pattern
    * matcher
* JDBC 2
    * RowSet
        * Factory
        * Provider
* NIO 2
    * WatchService
* Concurrency 2
    * Executor, ThreadPool
    * Exchanger
    * CyclicBarrier
    * Phaser
    * Concurrent Collections
    * Atomics Vars/Locks
    * Conditions
    * Callable
    * Future
    * ExecutorService
    * ThreadFactory

## Prio 3
* Exceptions
    * chained
    * rethrow
* DAO
* Factory
* Autocloseable vs. Closeable
* Inheritance
    * (dynamic) downcast?
    * UML diagram
    * can you call outer class constructor from inner?
* Generics
    * Raw types interop. with generics
* comparator, comparable
* virtual method invocation?
* Other
    * BigDecimal

## Other
* double brace syntax. done 

## Resources
* http://docs.oracle.com/javase/tutorial/reallybigindex.html
