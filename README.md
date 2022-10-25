# Book manager

書籍管理システム

## 技術スタック

- ビルドツール: [Gradle](https://docs.gradle.org)
- フレームワーク: [Spring Boot](https://spring.io/projects/spring-boot)
- O/R マッパー: [MyBatis](https://mybatis.org/mybatis-3/ja/)
- DB: [MySQL](https://www.mysql.com/jp/)

## アーキテクチャ

[オニオンアーキテクチャ](https://jeffreypalermo.com/2008/07/the-onion-architecture-part-1/) の思想をベースにしている。

| パッケージ名                               | 役割                   |
|--------------------------------------|----------------------|
| presentation(User Interface)         | フロントエンドとやりとりをする      |
| infrastructure(Infrastructure)       | I/O に関する実装を担う        |
| application(Application Service)     | アプリケーション固有のロジックを表現する |
| domain(Domain Model, Domain Service) | ドメインに関する状態と振る舞いを定義する |

## 開発

MySQL コンテナを起動してデータの永続化をする。

```shell
# 生成と起動
docker-compose -f ./docker/docker-compose.yml up -d

# 停止
docker-compose -f ./docker/docker-compose.yml stop
```
