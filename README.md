
プログラミングの手順

1. コンピュータに行わせたいことを理解する
2. 理解したことを説明できるレベルまで整理する
3. コンピュータにわかる言葉に翻訳する



## lesson5 のまとめ

* インターフェイスとは、オブジェクトの操作に対する振る舞いを規定するものである
* インターフェイスを実現するクラスを作成することをインターフェイスを実装するという
* インターフェイスを利用することで、メソッドの呼び出し方を変えることなく実際の動作を変えることができる
* 実際の処理を他のクラスに任せてしまうことを委譲と呼ぶ
* インターフェイスを通すことで、利用する側からインターフェイスの実装クラスを隠蔽することができる。その結果、利用者はインターフェイスを実現する具体的なクラスを意識しなくて済むようになる


## lesson6のまとめ

### モデリングの手順

1. 仕様を文章化する。
2. 仕様の文章から、名詞を抽出する。(名詞抽出法)
3. 抽出した名詞から、クラスになりそうなものを選ぶ。
4. クラス間の関連を洗い出す。
    各クラスについて、現時点でわかることの説明を書く。 
    説明を元に、クラス間の関連を見つけ、クラス同士を結ぶ線として書き出す。
5. 処理の流れを、オブジェクト間のメッセージとして図に表してみる。
6. クラスごとで、受けたメッセージとそれに対する振る舞いを洗い出す。
7. 各クラスの属性を洗い出す。
   ・他のクラスからの操作によって影響を受けるオブジェクト固有の状態
   ・他のクラスから必要とされるオブジェクト固有の情報
8. クラス名、属性、操作を図にまとめる。
9. シーケンス図で、処理の流れを書き出す。
10. プログラムを実装する。


モデリングをする上で特に気をつけること

操作とは、オブジェクトがメッセージを受け取った後の振る舞いのことである

・どのクラスからどのクラスにメッセージを送るのか
・どのようなメッセージを送るのか
・メッセージを受け取った結果、どのように振る舞うのか

を整理する必要があることを意識する。