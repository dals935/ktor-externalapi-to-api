package com.example.config

import java.sql.Connection
import java.sql.DriverManager

class toDoConfig {
    fun connect(): Connection {
        val url = "jdbc:postgresql://localhost:5432/postgres"

        val username = "postgres"

        val password = "root"

        return DriverManager.getConnection(url,username,password)
    }
}