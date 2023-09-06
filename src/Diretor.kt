class Diretor(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: Int,
    val plr: Double
) {
    fun bonificacao(): Double {
        return salario * 0.2
    }
    fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }

}
