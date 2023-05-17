

# SweepCounterparty


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**balanceAccountId** | **String** | The unique identifier of the destination or source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).   You can only use this for periodic sweep schedules such as &#x60;schedule.type&#x60; **daily** or **monthly**. |  [optional] |
|**merchantAccount** | **String** | The merchant account that will be the source of funds, if you are processing payments with Adyen. You can only use this with sweeps of &#x60;type&#x60; **pull** and &#x60;schedule.type&#x60; **balance**. |  [optional] |
|**transferInstrumentId** | **String** | The unique identifier of the destination or source [transfer instrument](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/transferInstruments__resParam_id).  You can also use this in combination with a &#x60;merchantAccount&#x60; and a &#x60;type&#x60; **pull** to start a direct debit request from the source transfer instrument. To use this feature, reach out to your Adyen contact. |  [optional] |



