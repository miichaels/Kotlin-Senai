data class aluno(var codigo : Int, var nome : String, var cpf : String, var turma : String) {
    init {
        println()
        println("Cadastro finalizado com sucesso!!!")
        println()
    }
    fun mostrar(){
        println("Nome do Aluno: " + this.nome)
        println("Codigo: " + this.codigo)
        println("CPF: " + this.cpf)
        println("Turma: " + this.turma)
    }

    fun mostrar1():String{
        return  "\nNome do Aluno: " + this.nome  +
                "\nCodigo: " + this.codigo +
                "\nCPF: " + this.cpf +
                "\nTurma: " + this.turma
    }

}