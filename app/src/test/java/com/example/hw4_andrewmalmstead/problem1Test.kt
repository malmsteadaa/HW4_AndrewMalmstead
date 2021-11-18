package com.example.hw4_andrewmalmstead

import junit.framework.TestCase

class problem1Test : TestCase() {
    //purpose can we get stack size initially at 100
    fun testGetStacksize() {
        val myClass=problem1()
        assertEquals(100,myClass.stacksize)
    }
//purpose can we change the stack size
    fun testSetStacksize() {
    val myClass=problem1()
    //re-init buffer
    myClass.buffer= arrayOf<Int>(200*3)
    //set the size of each stack
        myClass.stacksize=200
    assertEquals(200,myClass.stacksize)
    assertEquals(600,myClass.buffer.size)

    }

    fun testGetBuffer() {}

    fun testSetBuffer() {}

    fun testGetStackpointer() {}

    fun testSetStackpointer() {}

    fun testPush() {}

    fun testPop() {}

    fun testPeek() {}

    fun testIsEmpty() {}

    fun testAbsTopOfStack() {}
}