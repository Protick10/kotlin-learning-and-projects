package pro.inc.counterappusingmvvm

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.room.util.copy

class CounterViewModel : ViewModel() {
    private var _count = mutableStateOf(0)
    public var count = _count

    fun increment() {
        _count.value += 1
    }

    fun decrement() {
        _count.value -= 1
    }

}