

# CapabilitySettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amountPerIndustry** |  | The maximum amount a card holder can spend per industry. |  [optional] |
|**authorizedCardUsers** | **Boolean** | The number of card holders who can use the card. |  [optional] |
|**fundingSource** | [**List&lt;FundingSourceEnum&gt;**](#List&lt;FundingSourceEnum&gt;) | The funding source of the card, for example **debit**. |  [optional] |
|**interval** | [**IntervalEnum**](#IntervalEnum) | The period when the rule conditions apply. |  [optional] |
|**maxAmount** | [**Amount**](Amount.md) |  |  [optional] |



## Enum: List&lt;FundingSourceEnum&gt;

| Name | Value |
|---- | -----|
| CREDIT | &quot;credit&quot; |
| DEBIT | &quot;debit&quot; |
| PREPAID | &quot;prepaid&quot; |



## Enum: IntervalEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;daily&quot; |
| MONTHLY | &quot;monthly&quot; |
| WEEKLY | &quot;weekly&quot; |



