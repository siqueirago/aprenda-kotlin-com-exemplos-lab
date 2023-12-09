// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

//enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

//Criando classe Aluno
class Aluno(
    val nome: String ,
    val Email: String ,
    val idade: Int
)
// Criando a classe conteudo
data class ConteudoEducacional(
    var titulo: String, 
    val duracaoHoras: Int)

data class Formacao(
    val nome: String,
    var nivel: String,
    var conteudosEducacionais: List<ConteudoEducacional>) {
    
    
    fun matricular(aluno: Aluno) {
        println("O aluno ${aluno.nome} foi matriculado no Curso:$nome - $nivel")
    }
}
fun main() {
    //Criando conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 20)
    val conteudo2 = ConteudoEducacional("Desenvolvendo Android com  Kotlin", 50)
    // Criando a Formação
    val formacaoKotlin = Formacao("Formação Kotlim","Intermediário",listOf(conteudo1, conteudo2))
    
    //Criando Alunos
    val aluno = Aluno("Júlio", "julio@email.com", 45)
    
    //matriculando aluno na formação de Kotlin
    formacaoKotlin.matricular(aluno)
    
}
