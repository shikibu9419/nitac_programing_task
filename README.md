# nitac_programming_task
マインスイーパ...?

## ゲームのスタート
```shell
> javac Minesweeper.java
> java Minesweeper
# or
> ./run.sh
```

## プログラムの構成
```
nitac_programming_task
|-- Minesweeper.java
|-- control                       ゲームシステム関連
|   |-- Information.java
|   |-- Field.java
|   `-- UnitAction.java
|-- models                        データ関連
|   |-- Cell.java
|   |-- Flatland.java
|   |-- Mine.java
|   `-- Unit.java
|-- ui                            ユーザインターフェース関連
|   |-- Color.java
|   |-- Display.java
|   |-- InputReceiver.java
|   `-- animations                アニメーション関連
|       |-- Animation.java
|       `-- ExplodeAnimation.java
|-- configs                       コンフィグ関連
|   |-- Difficulty.java
|   |-- GameMode.java
|   `-- UnitType.java
`-- algorithm                     アルゴリズム関連
    `-- Opponent.java
```

## コードを書く時...
- 何をしてるかわかりやすいようにできればコメントを書いてね!
- できればどこにどんなクラスを配置したかREADMEに書いてね!
- gitでの操作手順を`git.txt`に書いたのでわからなくなったら見てみてね!
- .bashrcをホームディレクトリに置くとgit操作がとっても楽になるよ!
  ```shell
  # .bashrcの配置
  > cp .bashrc ~/
  # git add
  > ga
  # git commit -m
  > gc
  ...
  ```
