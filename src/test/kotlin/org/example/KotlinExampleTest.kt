package org.example

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class KotlinExampleTest {

    @Test
    fun testSolution() {
        val example = KotlinExample()
        val result = example.solution("Kotlin")
        assertEquals("Hello, Kotlin!", result)
    }
}
