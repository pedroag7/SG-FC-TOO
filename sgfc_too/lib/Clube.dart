import '../atleta.dart';
import '../partida.dart';
import '../funcionario.dart';

class Clube {
  String _nome = '';
  DateTime? _criacao;
  final List<Atleta> _atletas = [];
  final List<Partida> _partidas = [];
  final List<Funcionario> _funcionarios = [];

  // Getters e setters
  String get nome => _nome;
  set nome(String value) => _nome = value;

  DateTime? get criacao => _criacao;
  set criacao(DateTime? value) => _criacao = value;

  List<Atleta> get atletas => _atletas;
  List<Partida> get partidas => _partidas;
  List<Funcionario> get funcionarios => _funcionarios;

  // Métodos para adicionar
  void adicionarAtleta(Atleta atleta) {
    _atletas.add(atleta);
  }

  void adicionarPartida(Partida partida) {
    _partidas.add(partida);
  }

  void adicionarFuncionario(Funcionario funcionario) {
    _funcionarios.add(funcionario);
  }

  // Métodos para exibir
  void exibirAtletas() {
    print('Atletas:');
    for (var atleta in _atletas) {
      print(atleta);
    }
  }

  void exibirPartidas() {
    print('Partidas:');
    for (var partida in _partidas) {
      print(partida);
    }
  }

  void exibirFuncionarios() {
    print('Funcionários:');
    for (var funcionario in _funcionarios) {
      print(funcionario);
    }
  }
}
