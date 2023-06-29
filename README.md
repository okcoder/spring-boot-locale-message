## get message from messages.properties

```bash
$ curl -H "Accept-Language: en" "http://localhost:8080/message?id=message1"
Message1%
$ curl -H "Accept-Language: ja" "http://localhost:8080/message?id=message1"
メッセージ１
$ curl -H "Accept-Language: en" "http://localhost:8080/message?id=message1&locale=ja"
メッセージ１
$ curl -H "Accept-Language: ja" "http://localhost:8080/message?id=message1&locale=en"
Message1
$ curl -H "Accept-Language: ja" "http://localhost:8080/message?id=message1&locale=ja"
メッセージ１
```

## Validation messages

```bash
$ curl -s -H "Accept-Language: en" "http://localhost:8080/message" |jq -r ".[].defaultMessage"
Id is required.
$ curl -s -H "Accept-Language: ja" "http://localhost:8080/message" |jq -r ".[].defaultMessage"
ID が必須項目です。
$ curl -s -H "Accept-Language: en" "http://localhost:8080/message?locale=ja" |jq -r ".[].defaultMessage"
ID が必須項目です。
$ curl -s -H "Accept-Language: ja" "http://localhost:8080/message?locale=en" |jq -r ".[].defaultMessage"
Id is required.
$ curl -s -H "Accept-Language: ja" "http://localhost:8080/message?locale=ja" |jq -r ".[].defaultMessage"
ID が必須項目です。
```
