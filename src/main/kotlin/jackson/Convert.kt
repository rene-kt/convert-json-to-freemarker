package jackson

import models.Screen
import com.fasterxml.jackson.module.kotlin.*

class Convert {
    private val mapper = jacksonObjectMapper()
    fun teste(){
        val json = """{"id": 1,"name":"teste","startScreen":true, "size": {
                    "width": 448,
                    "height": 838
                }}"""
        var screen: Screen = mapper.readValue<Screen>(json)
        println(screen)
    }
}