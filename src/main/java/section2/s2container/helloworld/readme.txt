これは、S2Containerの動きを理解するためのサンプルです。
Mainクラスを実行すると、結果が表示されます。

＜Componentの実行＞
IMessageProviderを実装したクラスの(HelloMessageProvider)getMessageメソッドに、
IMessageTargetを実装したクラスの(DefaultMessageTargetクラス)getName()メソッドがはいる。
↓
実装したクラスが、それぞれ１つずつの場合は、呼ばれるメソッドが一意に決められる。

app.diconファイルにコンポーネントとして登録されているクラス

＜Componentの差し替え＞
