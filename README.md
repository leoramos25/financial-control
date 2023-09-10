# Personal Financial Control

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