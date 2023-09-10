# Personal Financial Control

setup postgreSQL docker container:
```BASH
$ docker-compose -f ./docker/docker-compose up -d
```

---

- [x] ***It should be possible to create a new transaction, by following this request body:***

 ```JSON
{
  "description": "string",
  "amount": 0.0,
  "type": "INCOME"
}
```

- [x] ***It should be possible to list the transactions:***

```JSON
[
  {
    "description": "string",
    "amount": 0.0,
    "type": "INCOME"
  },
  {
    "description": "string",
    "amount": 0.0,
    "type": "OUTCOME"
  }
]
```

- [x] ***It shoud be possible get a balance:***

```JSON
{
    "balance": 0.0,
    "transactions": [
        {
            "id": "string",
            "description": "string",
            "type": "INCOME",
            "amount": 0.0
        },
        {
            "id": "string",
            "description": "string",
            "type": "OUTCOME",
            "amount": 0.0
        }
    ]
}
```