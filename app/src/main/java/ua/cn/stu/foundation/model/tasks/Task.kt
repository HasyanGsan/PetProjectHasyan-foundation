package ua.cn.stu.foundation.model.tasks

import ua.cn.stu.foundation.model.FinalResult
import ua.cn.stu.simplemvvm.model.colors.ColorListener

typealias TaskListener<T> = (FinalResult<T>) -> Unit

interface Task<T> {

    fun await(): T

//    Запускается только в главном потоке

    fun enqueue(listener: TaskListener<T>)

    fun cancel()
}