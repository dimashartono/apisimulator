# apisimulator
Api Simulator Back End 


Request : 

{
    "pan":"000189391234",
    "processingCode":"26000",
    "transactionAmount":"1000000",
    "transmissionDateTime":"202205290001",
    "systemTraceAuditNumber":"000001",
    "localTransactionDateTime":"202205290001",
    "settlementDate":"20221929",
    "captureDate":"20221929",
    "merchantType":"6017",
    "posEntryMode":"011",
    "feeType":"C",
    "feeAmount":"12345",
    "acquirerId":"000008",
    "postalCode":"12270",
    "customerPan":"666777889999"
}

Response : 

{
    "resMessage": "SUCCESS",
    "data": {
        "status": "1030",
        "amount": 3000000.0
    }
}


<img width="527" alt="image" src="https://github.com/dimashartono/apisimulator/assets/45741186/0b03f976-7f65-43a3-8635-c0fed24629b5">

