import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail
import kotlin.test.fail


class MainTest {

    @Test
    @DisplayName("teste de idade valida")
    fun testAge() {
        Assertions.assertAll(
            { Assertions.assertTrue(isValidAge(18)) },
            { Assertions.assertTrue(isValidAge(200)) },
            { Assertions.assertFalse(isValidAge(-10)) },
            { Assertions.assertFalse(isValidAge(10)) },
            { Assertions.assertFalse(isValidAge(500)) },
            { Assertions.assertFalse(isValidAge(201)) }
        )
    }

    @Test
    @DisplayName("teste do tipo de convite")
    fun testInviteType() {
        Assertions.assertAll(
            { Assertions.assertTrue(isValidInviteType("Comum")) },
            { Assertions.assertTrue(isValidInviteType("PREMIUM")) },
            { Assertions.assertTrue(isValidInviteType("lUxo")) },
            { Assertions.assertFalse(isValidInviteType("abC")) },
            { Assertions.assertFalse(isValidInviteType("")) },

            )
    }

    @Test
    fun testInviteCode() {

        Assertions.assertAll(
            { Assertions.assertTrue(isValidInviteCode("XL5646")) },
            { Assertions.assertTrue(isValidInviteCode("XT87456")) },
            { Assertions.assertFalse(isValidInviteCode("XL #~!")) },
            { Assertions.assertFalse(isValidInviteCode("37XL#~!")) },
            { Assertions.assertFalse(isValidInviteCode("8974651!XT")) },
            { Assertions.assertFalse(isValidInviteCode("")) },
            { Assertions.assertFalse(isValidInviteCode(" XL #~! ")) },
            { Assertions.assertFalse(isValidInviteCode("XL #~!")) },
            { Assertions.assertFalse(isValidInviteCode(" XL5646")) },
        )
    }

    @Test
    fun testMessage() {
        Assertions.assertAll(
            { Assertions.assertEquals(getMessage(18, "comum", "XLABC"), "Bem Vindo") },
            { Assertions.assertEquals(getMessage(200,"luxo", "XLA"), "Bem Vindo") },
            { Assertions.assertEquals(getMessage(70,"premium", "XT1"), "Bem Vindo") },
            { Assertions.assertEquals(getMessage(-18,"comum", "XLA23"), "Acesso Negado") },
            { Assertions.assertEquals(getMessage(201,"comum", "XL5028"), "Acesso Negado") },
            { Assertions.assertEquals(getMessage(18,"comum"," XL "), "Acesso Negado") },
        )
    }

    @Test
    @Disabled
    fun test() {
        fail("teste a implementar")
    }

}