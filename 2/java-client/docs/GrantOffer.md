

# GrantOffer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountHolderId** | **String** | The identifier of the account holder to which the grant is offered. |  |
|**amount** | [**Amount**](Amount.md) | The principal amount of the grant. |  [optional] |
|**contractType** | [**ContractTypeEnum**](#ContractTypeEnum) | The contract type of the grant offer. Possible value: **cashAdvance**, **loan**. |  [optional] |
|**expiresAt** | **Object** |  |  [optional] |
|**fee** | [**Fee**](Fee.md) | Details of the fee configuration. |  [optional] |
|**id** | **String** | The unique identifier of the grant offer. |  [optional] |
|**repayment** | [**Repayment**](Repayment.md) | Details of the repayment configuration. |  [optional] |
|**startsAt** | **Object** |  |  [optional] |



## Enum: ContractTypeEnum

| Name | Value |
|---- | -----|
| CASH_ADVANCE | &quot;cashAdvance&quot; |
| LOAN | &quot;loan&quot; |



