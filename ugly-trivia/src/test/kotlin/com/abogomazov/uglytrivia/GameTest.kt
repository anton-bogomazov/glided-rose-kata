package com.abogomazov.uglytrivia

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class GameTest {
    @Test
    fun `2 or more players can play the game`() {
        Game(listOf("Ben", "Ten"))
    }

    @Test
    fun `cannot create a game for 1 player`() {
        assertThrows<IllegalArgumentException> {
            Game(listOf("Joe"))
        }
    }

    @Test
    fun `cannot create a game without players`() {
        assertThrows<IllegalArgumentException> {
            Game(emptyList())
        }
    }
}