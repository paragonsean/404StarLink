

# TransferInstrumentInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankAccount** | [**BankAccountInfo**](BankAccountInfo.md) |  |  |
|**legalEntityId** | **String** | The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the transfer instrument. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of transfer instrument.  Possible value: **bankAccount**. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BANK_ACCOUNT | &quot;bankAccount&quot; |
| RECURRING_DETAIL | &quot;recurringDetail&quot; |



