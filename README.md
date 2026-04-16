# 📌ユーザーCRUD API

Spring Bootを使用して開発されたシンプルなユーザー管理用REST APIです。
基本的なCRUD操作(作成・取得・更新・削除)を実装しています。

## 🚀使用技術

- Java 21
- Spring Boot
- Spring Data JPA
- Lombok
- H2 Database (開発環境用)
- Maven

## 🧠アーキテクチャ　(設計)

- Controller -> Service -> Repository -> Database
- Controller（コントローラー） → HTTPリクエストの受付
- Service（サービス） → ビジネスロジック（業務処理）
- Repository（リポジトリ） → データベース操作
- Entity（エンティティ） → データベースのテーブル定義

## 🌎 備考 (びこう)　note

本プロジェクトは基本的なCRUD構造の理解を目的として作成されてます。

＊　構造 こうぞう　structure, construction　/　実装　じっそう　implementation