import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/*
c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam
com “XT”. Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite
inválido.”.
 */



class MainTest {

    @Test
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
    fun testInviteType() {
        Assertions.assertAll(
            { Assertions.assertTrue(isValidInviteType("comum")) },
            { Assertions.assertTrue(isValidInviteType("premium")) },
            { Assertions.assertTrue(isValidInviteType("luxo")) },
            { Assertions.assertFalse(isValidInviteType("abc")) },
            { Assertions.assertFalse(isValidInviteType("")) },

            )
    }

    @Test
    fun testInviteCode() {

        Assertions.assertAll(
            { Assertions.assertTrue(isValidInviteCode("XL5646")) },
            { Assertions.assertTrue(isValidInviteCode("XT87456")) },
            { Assertions.assertTrue(isValidInviteCode("XL #~!")) },
            { Assertions.assertFalse(isValidInviteCode("37XL#~!")) },
            { Assertions.assertFalse(isValidInviteCode("8974651!XT")) },
            { Assertions.assertFalse(isValidInviteCode("")) },

        )


    }

}