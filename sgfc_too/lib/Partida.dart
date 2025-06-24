import '../atleta.dart';

class Partida {
  String _resultado = '';
  String _adversario = '';
  int _golsPro;
  int _golsContra;
  DateTime? _data;
  final List<Atleta> _escalacao = [];
  Atleta? _mvp;

  Partida({
    required int golsPro,
    required int golsContra,
  })  : _golsPro = golsPro,
        _golsContra = golsContra {
    _calcRes();
  }

  // Getters e Setters
  String get resultado => _resultado;
  set resultado(String value) => _resultado = value;

  String get adversario => _adversario;
  set adversario(String value) => _adversario = value;

  int get golsPro => _golsPro;
  set golsPro(int value) => _golsPro = value;

  int get golsContra => _golsContra;
  set golsContra(int value) => _golsContra = value;

  DateTime? get data => _data;
  set data(DateTime? value) => _data = value;

  List<Atleta> get escalacao => _escalacao;

  Atleta? get mvp => _mvp;
  set mvp(Atleta? value) => _mvp = value;

  void addEscalacao(Atleta atleta) {
    _escalacao.add(atleta);
  }

  String _calcRes() {
    if (_golsPro > _golsContra) {
      _resultado = 'Vitória';
    } else if (_golsPro == _golsContra) {
      _resultado = 'Empate';
    } else {
      _resultado = 'Derrota';
    }
    return _resultado;
  }

  @override
  String toString() {
    return 'Adversário: $_adversario, Resultado: $_resultado';
  }
}
