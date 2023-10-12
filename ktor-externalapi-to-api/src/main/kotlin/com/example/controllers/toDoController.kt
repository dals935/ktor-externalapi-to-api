package com.example.controllers

import com.example.models.ToDoModel
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class toDoController {

    suspend fun getToDoData(): String { //change to "List<ToDoModel>" when using functional
        val client = HttpClient(CIO)
        val json = Json {
            ignoreUnknownKeys = true
            prettyPrint = true
        }

        val response: HttpResponse = client.get("https://den-todo-rest-api.vercel.app/api")
        {
            header("Authorization", "Bearer testing123")
        }

        //functional
        //return json.decodeFromString<List<ToDoModel>>(response.body()).also { json.encodeToString(it) }

        // usual naming of variable before access
        val clicont = json.decodeFromString<List<ToDoModel>>(response.body())
        
        val rescli = json.encodeToString<List<ToDoModel>>(clicont)

        return rescli
    }

}