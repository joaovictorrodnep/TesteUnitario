/*
4 Escreva um programa para ser usado na de portaria de um evento.
a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
permitidos.”.
b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não
seja nenhum destes. Mensagem: “Negado. Convite inválido.”.
c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam
com “XT”. Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite
inválido.”.
d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”.
*/

fun main() {
    println("asdas")
}

fun isValidAge(age: Int): Boolean {
    return age in 18..200
}

fun isValidInviteType(type: String): Boolean {
    val types: ArrayList<String> = arrayListOf("comum", "premium", "luxo")
    return types.contains(type)

}

fun isValidInviteCode(code: String): Boolean {
    val codesPrefix: ArrayList<String> = arrayListOf("XL", "XT")
    for (codePrefix in codesPrefix) {
        if (code.startsWith(codePrefix)) {
            return true
        }
    }
    return false
}