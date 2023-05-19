

# SweepConfiguration


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**balanceAccountId** | **String** | The unique identifier of the destination or source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).   You can only use this for periodic sweep schedules such as &#x60;schedule.type&#x60; **daily** or **monthly**. |  [optional] |
|**id** | **String** | The unique identifier of the sweep. |  [readonly] |
|**merchantAccount** | **String** | The merchant account that will be the source of funds. You can only use this if you are processing payments with Adyen. This can only be used for sweeps of &#x60;type&#x60; **pull** and &#x60;schedule.type&#x60; **balance**. |  [optional] |
|**schedule** | [**SweepConfigurationSchedule**](SweepConfigurationSchedule.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.    |  [optional] |
|**sweepAmount** | [**Amount**](Amount.md) | The amount that must be pushed out or pulled in. You can configure either &#x60;sweepAmount&#x60; or &#x60;targetAmount&#x60;, not both. |  [optional] |
|**targetAmount** | [**Amount**](Amount.md) | The amount that must be available in the balance account after the sweep. You can configure either &#x60;sweepAmount&#x60; or &#x60;targetAmount&#x60;, not both. |  [optional] |
|**transferInstrumentId** | **String** | The unique identifier of the destination or source [transfer instrument](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/transferInstruments__resParam_id).  You can also use this in combination with a &#x60;merchantAccount&#x60; and a &#x60;type&#x60; **pull** to start a direct debit request from the source transfer instrument. To use this feature, reach out to your Adyen contact. |  [optional] |
|**triggerAmount** | [**Amount**](Amount.md) | The threshold amount that triggers the sweep. If not provided, by default, the amount is set to zero. The &#x60;triggerAmount&#x60; is evaluated according to the specified &#x60;schedule.type&#x60;.  * For &#x60;type&#x60; **pull**, if the balance is less than or equal to the &#x60;triggerAmount&#x60;, funds are pulled in to the balance account.  * For &#x60;type&#x60; **push**, if the balance is more than or equal to the &#x60;triggerAmount&#x60;, funds are pushed out of the balance account. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PULL | &quot;pull&quot; |
| PUSH | &quot;push&quot; |



