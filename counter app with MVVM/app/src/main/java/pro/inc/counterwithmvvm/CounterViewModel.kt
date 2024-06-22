package pro.inc.counterwithmvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel(){
//    private val _count = mutableStateOf(0) // Mutable state to hold the count value this is private to avoid direct access. only the view model can access it
    private val _repository: CounterRepository =  CounterRepository() // Repository to hold the counter model
    private val _count = mutableStateOf(_repository.getCounter().count) // use the repository of countermodel to get the initial value of the count
    val count: MutableState<Int> = _count  // Exposing the mutable state as immutable state to the view

    fun increment(){
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }

    fun decrement(){
        _repository.decrementCounter()
        _count.value = _repository.getCounter().count
    }

}