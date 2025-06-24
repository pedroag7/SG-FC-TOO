class Stats {
  int _gols = 0;
  int _assists = 0;
  int _partidas = 0;
  int _quantMvp = 0;
  int _soma = 0;
  int _media = 0;

  // Getters e setters
  int get gols => _gols;
  set gols(int value) => _gols = value;

  int get assists => _assists;
  set assists(int value) => _assists = value;

  int get partidas => _partidas;
  set partidas(int value) => _partidas = value;

  int get quantMvp => _quantMvp;
  set quantMvp(int value) => _quantMvp = value;

  int get soma => _soma;
  int get media => _media;

  // Métodos
  void calcularSomaGA() {
    _soma = _gols + _assists;
  }

  void calcularMediaGA() {
    if (_partidas > 0) {
      _media = _soma ~/ _partidas; // ~/ = divisão inteira
    } else {
      _media = 0;
    }
  }

  @override
  String toString() {
    return 'Stats{Gols: $_gols, Assistências: $_assists, Partidas: $_partidas, MVPs: $_quantMvp, Soma G/A: $_soma, Média G/A: $_media}';
  }
}
