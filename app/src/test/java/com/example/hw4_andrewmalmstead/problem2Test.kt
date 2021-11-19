package com.example.hw4_andrewmalmstead

import junit.framework.TestCase
import java.lang.Exception

class problem2Test : TestCase() {

    //Purpose 1:backwards array
    fun testBackwards(){
        var myclass=problem2()
        val ar= arrayOf("d","c","b","a")
        assertEquals(3,myclass.search(ar.clone(),"a"))
    }
    //Purpose 2:sorted array with spaces
    fun testSpace(){
        var myclass=problem2()
        val ar= arrayOf("a","b","","d")
        assertEquals(myclass.search(ar,"a"),0)
    }
    //Purpose 3:sorted numbers and letters array.
    fun testNumberLetters(){
        var myclass=problem2()
        val ar= arrayOf("a1","a2","a3","a4")
        assertEquals(myclass.search(ar,"a2"),1)
    }
    //Purpose 4:sorted numbers
    fun testNumbers(){
        var myclass=problem2()
        val ar= arrayOf("1","2","3","4")
        assertEquals(myclass.search(ar,"4"),3)
    }
    //Purpose 5:sorted letters
    fun testLetters(){
        var myclass=problem2()
        val ar= arrayOf("a","b","c","d")
        assertEquals(myclass.search(ar,"c"),2)
    }

    //Purpose 6:sorted words
    fun testWords(){
        var myclass=problem2()
        val ar= arrayOf("and","bob","charlie","daddy")
        assertEquals(myclass.search(ar,"bob"),1)
    }
    //Purpose 7:-1 case when there is an empty array
    fun testEmptyArray(){
        var myclass=problem2()
        val ar= arrayOf("")
        assertEquals(myclass.search(ar,"c"),-1)
    }
    //Purpose 8:-1 case when the element is empty
    fun testEmptyElement(){
        var myclass=problem2()
        val ar= arrayOf("a","b","c","d")
        assertEquals(myclass.search(ar,""),-1)
    }
    //Purpose 9:-1 case when element is not the array.
    fun testNotPresent(){
        var myclass=problem2()
        val ar= arrayOf("a","b","c","d")
        assertEquals(myclass.search(ar,"e"),-1)
    }
    //Purpose 10:Unsorted list. it doesn't have to be sorted for worse case where it take O(N) operations.
    fun testUnsorted(){
        var myclass=problem2()
        val ar= arrayOf("c","b","d","a")
        assertEquals(1,myclass.search(ar,"b"))
    }
    //Purpose 11:unsupported object type
    fun testObject(){
        try{
        var myclass=problem2()
        val ar= arrayOf(1,2,3,4)
    }catch (E:Exception){}

    }
}