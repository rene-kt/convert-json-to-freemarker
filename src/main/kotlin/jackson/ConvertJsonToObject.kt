package jackson

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import models.Screen

class ConvertJsonToObject {
    private val mapper = jacksonObjectMapper()
    private val  jsonIgnore = """{
    "message": "OK",
    "application": {
        "screens": ["""

    /**
     * Get a given JSON from KnowCode API and converts to a Screen object
     *
     * @param json the JSON from the API.
     */
    fun convert(json: String): Screen {
        return mapper.readValue<Screen>(json.replace(jsonIgnore, ""))
    }
}