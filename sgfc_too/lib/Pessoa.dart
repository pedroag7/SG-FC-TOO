abstract class Pessoa {
  String _nome;
  String _sobrenome;
  DateTime _dataNascimento;
  int _idade = 0;

  Pessoa({
    required String nome,
    required String sobrenome,
    required DateTime dataNascimento,
  })  : _nome = nome,
        _sobrenome = sobrenome,
        _dataNascimento = dataNascimento;

  // Getters
  String get nome => _nome;
  String get sobrenome => _sobrenome;
  DateTime get dataNascimento => _dataNascimento;
  int get idade => _idade;

  // Setters
  set nome(String nome) => _nome = nome;
  set sobrenome(String sobrenome) => _sobrenome = sobrenome;
  set dataNascimento(DateTime dataNascimento) =>
      _dataNascimento = dataNascimento;

  int calcularIdade() {
    final hoje = DateTime.now();
    _idade = hoje.year - _dataNascimento.year;
    if (hoje.month < _dataNascimento.month ||
        (hoje.month == _dataNascimento.month &&
            hoje.day < _dataNascimento.day)) {
      _idade--;
    }
    return _idade;
  }

  void bonusSalario(); // método abstrato
  void exibirDados();  // método abstrato
}
