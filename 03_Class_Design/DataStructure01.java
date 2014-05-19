/*
* start from file http://docs.oracle.com/javase/tutorial/java/javaOO/examples/DataStructure01.java
    * Define a method named print(DataStructure01Iterator iterator). Invoke this method with an instance of the class EvenIterator so that it performs the same function as the method printEven.
    * Invoke the method print(DataStructure01Iterator iterator) so that it prints elements that have an odd index value. Use an anonymous class as the method's argument instead of an instance of the interface DataStructure01Iterator.
    * Define a method named print(java.util.Function<Integer, Boolean> iterator) that performs the same function as print(DataStructure01Iterator iterator). Invoke this method with a lambda expression to print elements that have an even index value. Invoke this method again with a lambda expression to print elements that have an odd index value.
    * Define two methods so that the following two statements print elements that have an even index value and elements that have an odd index value:

    DataStructure01 ds = new DataStructure01()
    // ...
    ds.print(DataStructure01::isEvenIndex);
    ds.print(DataStructure01::isOddIndex);
*/


/*
 * Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
 
public class DataStructure01 {
    
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
   
    private int getSize() {
        return SIZE;
    }

    private int[] getArray() {
        return arrayOfInts;
    }
 
    public DataStructure01() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
   
    public void print(DataStructure01Iterator iter) {
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
    }

    /*
    // I only have 1.7 installed..
    public void print(java.util.Function<Integer, Boolean> iterator) {
        for (int i = 0; i < SIZE; i++) {
            if (iterator.apply(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    */
 
    public void printEven() {
        
        // Print out values of even indices of the array
        DataStructure01Iterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    interface DataStructure01Iterator extends java.util.Iterator<Integer> { } 

    // Inner class implements the DataStructure01Iterator interface,
    // which extends the Iterator<Integer> interface
    
    private class EvenIterator implements DataStructure01Iterator {
        
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
        
        public boolean hasNext() {
            
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }        
        
        public Integer next() {
            
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }

        /* added remove because it is required by interface */
        public void remove() {
            throw new RuntimeException();
        }
    }
    
    public static void main(String s[]) {
        
        // Fill the array with integer values and print out only
        // values of even indices
        // TODO: "final" is evil work-around re: anonymous inner class
        final DataStructure01 ds = new DataStructure01();
        ds.printEven();
        ds.print(ds.new EvenIterator());
        ds.print(ds.new EvenIterator() {
            // TODO does not handle container with less than 2 elements 
            private int next = 1;
            public Integer next() {
                Integer retValue = Integer.valueOf(ds.getArray()[next]);
                next += 2;
                return retValue;
            }

            public boolean hasNext() {
                return (next <= ds.getSize() - 1);
            }

            /* added remove because it is required by interface */
            public void remove() {
                throw new RuntimeException();
            }
        });
    }
}
