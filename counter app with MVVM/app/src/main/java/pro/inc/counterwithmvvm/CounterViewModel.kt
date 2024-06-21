package pro.inc.counterwithmvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel(){
    private val _count = mutableStateOf(0) // Mutable state to hold the count value this is private to avoid direct access. only the view model can access it

    val count: MutableState<Int> = _count  // Exposing the mutable state as immutable state to the view

    fun increment(){
        _count.value++
    }

    fun decrement(){
        _count.value--
    }

}