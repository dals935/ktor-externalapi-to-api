package com.example.routes

import com.example.controllers.toDoController
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Route.toDoRoute(){
    route("/todo")
    {
        get {
            val toDoValues = toDoController().getToDoData()
            call.respond(toDoValues)
        }
    }
}