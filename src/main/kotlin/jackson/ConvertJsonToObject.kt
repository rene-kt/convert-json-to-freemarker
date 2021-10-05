package jackson

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import models.Screen

class ConvertJsonToObject {
    private val mapper = jacksonObjectMapper()
    private val  jsonIgnore = """{
    "message": "OK",
    "application": {
        "screens": ["""

    fun convert(json: String): Screen {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper.readValue<Screen>(json.replace(jsonIgnore, ""))
    }
}