package com.example.hw4_andrewmalmstead

import java.lang.Exception

class problem1 {
    var stacksize=100
    var buffer= IntArray(stacksize*3)
    var stackpointer=arrayOf(-1,-1,-1)
fun push(stacknum:Int, value:Int){
if(stackpointer[stacknum]+1>=stacksize)
    throw Exception("Out of Space.")
    stackpointer[stacknum]++
    val index=absTopOfStack(stacknum)
    buffer[index]=value

}
    fun pop(stackNum: Int):Int{
        if(stackpointer[stackNum]==-1)
            throw Exception("Trying to pop an empty stack.")
        val value= buffer[absTopOfStack(stackNum)]
        buffer[absTopOfStack(stackNum)]=0
        stackpointer[stackNum]--
        return value
    }

    fun peek(stackNum: Int):Int{
        val index=absTopOfStack(stackNum)
        return buffer[index]
    }
fun isEmpty(stackNum:Int):Boolean{
    return  (stackpointer[stackNum]==-1)
}
    fun absTopOfStack(stackNum:Int):Int{
        return stackNum*stacksize+stackpointer[stackNum]
    }

}