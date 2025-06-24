import '../Pessoa.dart';
import '../Stats.dart';
import '../Posicao.dart';

class Atleta extends Pessoa {
  String _nCamisa;
  double _valorMercado;
  DateTime _dataContratacao;
  DateTime _fimContrato;
  Stats _sstats;
  Posicao _pposicao;
  double _salario;

  Atleta({
    required String nome,
    required String sobrenome,
    required DateTime dataNascimento,
    required String nCamisa,
    required double valorMercado,
    required DateTime dataContratacao,
    required DateTime fimContrato,
    required Stats sstats,
    required Posicao pposicao,
    required double salario,
  })  : _nCamisa = nCamisa,
        _valorMercado = valorMercado,
        _dataContratacao = dataContratacao,
        _fimContrato = fimContrato,
        _sstats = sstats,
        _pposicao = pposicao,
        _salario = salario,
        super(
          nome: nome,
          sobrenome: sobrenome,
          dataNascimento: dataNascimento,
        );

  // Getters e Setters
  String get nCamisa => _nCamisa;
  set nCamisa(String value) => _nCamisa = value;

  double get valorMercado => _valorMercado;
  set valorMercado(double value) => _valorMercado = value;

  DateTime get dataContratacao => _dataContratacao;
  set dataContratacao(DateTime value) => _dataContratacao = value;

  DateTime get fimContrato => _fimContrato;
  set fimContrato(DateTime value) => _fimContrato = value;

  Stats get stats => _sstats;
  set stats(Stats value) => _sstats = value;

  Posicao get posicao => _pposicao;
  set posicao(Posicao value) => _pposicao = value;

  double get salario => _salario;
  set salario(double value) => _salario = value;

  @override
  void bonusSalario() {
    if (_pposicao == Posicao.Atacante && _sstats.gols > 50 && _sstats.gols < 100) {
      _salario += _salario * 0.3;
    } else if (_pposicao == Posicao.Atacante && _sstats.gols > 100) {
      _salario += _salario * 0.6;
    }
  }

  @override
  void exibirDados() {
    print('Nome: $nome');
    print('Idade: ${calcularIdade()}');
    print('Posição: $_pposicao');
    print('Número da Camisa: $_nCamisa');
    print('Valor de Mercado: $_valorMercado');
    print('Data de Contratação: $_dataContratacao');
    print('Fim do Contrato: $_fimContrato');
    print('Stats: $_sstats');
  }

  @override
  String toString() {
    return 'Nome: $nome, Posição: $_pposicao';
  }
}
