import '../pessoa.dart';

class Funcionario extends Pessoa {
  String _funcao;
  DateTime _dataContratacao;
  double _salario;

  Funcionario({
    required String nome,
    required String sobrenome,
    required DateTime dataNascimento,
    required String funcao,
    required DateTime dataContratacao,
    required double salario,
  })  : _funcao = funcao,
        _dataContratacao = dataContratacao,
        _salario = salario,
        super(
          nome: nome,
          sobrenome: sobrenome,
          dataNascimento: dataNascimento,
        );

  // Getters e setters
  String get funcao => _funcao;
  set funcao(String value) => _funcao = value;

  DateTime get dataContratacao => _dataContratacao;
  set dataContratacao(DateTime value) => _dataContratacao = value;

  double get salario => _salario;
  set salario(double value) => _salario = value;

  int get tempoCasa {
    final hoje = DateTime.now();
    int tempo = hoje.year - _dataContratacao.year;
    if (hoje.month < _dataContratacao.month ||
        (hoje.month == _dataContratacao.month &&
            hoje.day < _dataContratacao.day)) {
      tempo--;
    }
    return tempo;
  }

  @override
  void bonusSalario() {
    if (tempoCasa >= 5 && tempoCasa < 10) {
      _salario += _salario * 0.3;
    } else if (tempoCasa >= 10) {
      _salario += _salario * 0.5;
    }
  }

  @override
  void exibirDados() {
    print('Nome: $nome');
    print('Função: $_funcao');
    print('Data de Contratação: $_dataContratacao');
    print('Salário: $_salario');
  }

  @override
  String toString() {
    return 'Nome: $nome, Função: $_funcao';
  }
}
