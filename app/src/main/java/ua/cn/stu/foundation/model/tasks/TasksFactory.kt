package ua.cn.stu.foundation.model.tasks

import ua.cn.stu.foundation.model.Repository

typealias TaskBody<T> = () -> T

interface TasksFactory : Repository{

    fun <T> async(body: TaskBody<T>): Task<T>

}