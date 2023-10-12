package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class ToDoModel(
    val Id: String,
    val check: String,
    val task: String
)