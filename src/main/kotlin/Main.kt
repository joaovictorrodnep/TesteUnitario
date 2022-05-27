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
//    val message = getMessage(20, "comum", "XL213214")
//    print(message)
//    address(state = "rj", city = "abc", number = null)
    address("rj", "abc", "54654564", 20, 5)
    printName()
}

fun address(city: String, state: String, zipcode: String = "", number: Int? = 0) {

}

fun <T> address(vararg parameters: T) {
    var sum = 0
    for (parameter in parameters) {
        if (parameter is Int) {
            sum += parameter
        }
        if (parameter is String) {
            print("$parameter, ")
        }
    }
    println()
    println(sum)
}

fun printName() {
    print("Rafael")
}

fun getName(): String {
    return "Rafael"
}

fun isValidAge(age: Int): Boolean {
    return age in 18..200
}

fun isValidInviteType(type: String): Boolean {
    val types: ArrayList<String> = arrayListOf("comum", "premium", "luxo")
    return types.contains(type.lowercase())

}

fun isValidInviteCode(code: String): Boolean {
    if (code.contains(" ")) {
        return false
    }
    val codesPrefix: ArrayList<String> = arrayListOf("XL", "XT")
    for (codePrefix in codesPrefix) {
        if (code.startsWith(codePrefix)) {
            return true
        }
    }
    return false
}

fun getMessage(age: Int, type: String, code: String): String {
    if (isValidAge(age) && isValidInviteType(type) && isValidInviteCode(code)) {
        return "Bem Vindo"
    }
    return "Acesso Negado"
}