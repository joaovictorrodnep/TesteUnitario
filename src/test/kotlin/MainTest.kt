import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun testAge() {
        Assertions.assertAll(
            {Assertions.assertTrue(isValidAge(18))},
            {Assertions.assertTrue(isValidAge(200))},
            {Assertions.assertFalse(isValidAge(-10))},
            {Assertions.assertFalse(isValidAge(10))},
            {Assertions.assertFalse(isValidAge(500))},
            {Assertions.assertFalse(isValidAge(201))}
        )
    }


}