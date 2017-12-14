import day14.getGroups
import day14.getOccupiedPositionsCount
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day14Test {

    @Test
    fun part1() {
        assertEquals(getOccupiedPositionsCount("flqrgnkx"), 8108)
    }

    @Test
    fun part2() {
        assertEquals(getGroups("flqrgnkx"), 1242)
    }
}