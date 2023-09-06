fun main() {
    println("Bem vindo ao Bytebank!\n")

    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao()}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println()
    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao()}")

    if(fran.autentica(1234)){
        println("autenticou com sucesso")
    } else {
        println("falha na autentição")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4570.0,
        senha = 1234,
        plr = 500.0
    )

    println()
    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("plr ${gui.plr}")
    println("bonificação ${gui.bonificacao()}")

}

