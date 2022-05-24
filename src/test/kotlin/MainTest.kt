import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

//b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não
//seja nenhum destes. Mensagem: “Negado. Convite inválido.”.

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


}