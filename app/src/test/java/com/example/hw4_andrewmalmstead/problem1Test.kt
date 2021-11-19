package com.example.hw4_andrewmalmstead

import junit.framework.TestCase
import org.junit.Test
import java.util.*
import java.util.stream.IntStream.range

class problem1Test : TestCase() {
    //purpose can we get stack size initially at 100

    fun testGetStacksize() {
        val myClass=problem1()
        assertEquals(100,myClass.stacksize)
    }
//purpose can we change the stack size
    fun testSetStacksize() {
    val myClass=problem1()
    val temp= IntArray(600)
    //re-init buffer
    myClass.buffer=temp.clone()
    //set the size of each stack
    myClass.stacksize=200
    assertEquals(200,myClass.stacksize)
    assertEquals(600,myClass.buffer.size)


    }
//Purpose: To give the buffer some space via push, then we will validate that space.
    fun testGetBuffer() {
        val myClass=problem1()
        for(x in range(0,10)){
            myClass.push(0,x)
        }
        val expected=myClass.buffer.clone()
        for(x in range(0,10)){
         assertEquals(x,expected[x])
        }
    }
//Purpose: To set the buffer an see that it give us an expected result.
    fun testSetBuffer() {
        val temp= IntArray(10,{ i ->i+1})
        val myClass=problem1()
    myClass.stackpointer[0]=9
myClass.buffer=temp.clone()
        for(x in 0..temp.size-1){
            assertEquals(temp[9-x],myClass.pop(0) )
        }
    }
//purpose to fill each stack with element and see if it keep tracks of indexies
    fun testGetStackpointer() {
        val myClass=problem1()
        for(x in range(0,10)){
            myClass.push(0,x)
        }
        for(x in range(0,10)){
            myClass.push(1,x)
        }
        for(x in range(0,10)){
            myClass.push(2,x)
        }
        val temp=myClass.stackpointer
        for(x in temp){
            assertEquals(9,x)
        }
    }
//Purpose: To fill the stack then set the current index to a smaller value so that we can test tail end cutting
    fun testSetStackpointer() {
        val myClass=problem1()
        for(x in range(0,10)){
            myClass.push(0,1)
        }
        var count=0
        myClass.stackpointer[0]=6
        while(!myClass.isEmpty(0)){
           count++
           myClass.pop(0)
        }
        assertEquals(7,count)
    }
//push a single element into the stack and see if it's there.
    fun testPush() {
        val myClass=problem1()
myClass.push(0,2)
        assertEquals(2,myClass.buffer[0])
    }
//push into each stack then pop them
    fun testPop() {
        val myClass=problem1()
        myClass.push(0,2)
        assertEquals(myClass.pop(0),2)

        myClass.push(1,2)
        assertEquals(myClass.pop(1),2)
        myClass.push(2,2)
        assertEquals(myClass.pop(2),2)
    }
//push each stack a set of elements ranging from 0 to 10, then use the built in function to peek each stack.
    fun testPeek() {
        val myClass=problem1()

        for(x in range(0,10)){
            myClass.push(0,0)
        }
        for(x in range(0,10)){
            myClass.push(1,1)
        }
        for(x in range(0,10)){
            myClass.push(2,2)
        }
        for(x in 0..2){
            assertEquals(x,myClass.peek(x))
        }
    }
//To check if the stack is initially empty then pushed to check if its not empty.
    fun testIsEmpty() {
        val myClass=problem1()
        assertEquals(true,myClass.isEmpty(0))
        myClass.push(0,2)
        assertEquals(false,myClass.isEmpty(0))
    }
//add into each stack and check their respective current index.
    fun testAbsTopOfStack() {
        val myClass=problem1()

        for(x in range(0,10)){
            myClass.push(0,x)
        }
        for(x in range(0,10)){
            myClass.push(1,x)
        }
        for(x in range(0,10)){
            myClass.push(2,x)
        }
        for(x in 0..2){
            assertEquals((9+100*x),myClass.absTopOfStack(x))
        }
    }
}