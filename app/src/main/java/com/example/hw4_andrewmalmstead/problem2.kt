package com.example.hw4_andrewmalmstead

class problem2 {
    fun searchR(strings:Array<String>, str:String, first: Int, last:Int):Int{
        if(first>last) return -1
        var mid=(last+first)/2
        if(strings[mid].isEmpty()){
            var left=mid-1
            var right=mid+1
            while(true){
                if(left<first&&right>last)
                    return -1
                else if(right <=last && !strings[right].isEmpty()){
                    mid =right
                    break
                }else if(left >=last && !strings[left].isEmpty()){
                    mid =left
                    break
                }
                right++
                left--
            }
        }
        return when {
            str.equals(strings[mid]) -> mid
            strings[mid].compareTo(str)<0 -> searchR(strings,str,mid+1,last)
            else -> searchR(strings, str, first, mid-1)
        }
    }
    fun search(strings:Array<String>,str:String):Int{
        if(strings.isEmpty()||str.isEmpty())
            return -1
        return searchR(strings,str,0,strings.size-1)
    }
}