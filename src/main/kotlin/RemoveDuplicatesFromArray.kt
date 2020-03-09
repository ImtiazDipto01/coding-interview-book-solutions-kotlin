import java.util.*

fun main(){

    //removeDuplicatesValueWithTwoArray()
    removeDuplicatesValueWithSingleArray()
}

private fun removeDuplicatesValueWithTwoArray() {
    var myInputArray = arrayOf(1, 1, 2, 2, 4, 5)
    var myNewArray = IntArray(myInputArray.size)
    var index = 0

    for (i in 0..myInputArray.size - 1) {
        if (!myNewArray.contains(myInputArray.get(i))) {
            myNewArray.set(index, myInputArray.get(i))
            index++
        }
    }
    println(Arrays.toString(myNewArray))
}


private fun removeDuplicatesValueWithSingleArray(){
    var index = 0
    var myInputArray = arrayOf("a", "a", "b")

    for (i in 0 until myInputArray.size) {

        val currentValue = myInputArray.get(i)
        if(i == 0){
            myInputArray.set(index, currentValue)
            index ++
        }
        else if(!myInputArray.get(index - 1).equals(currentValue)){
            myInputArray.set(index, currentValue)
            index ++
        }

    }
    for(i in 0 until index){
        println(myInputArray.get(i))
    }

}