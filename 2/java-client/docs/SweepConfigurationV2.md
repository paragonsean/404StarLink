

# SweepConfigurationV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**category** | [**CategoryEnum**](#CategoryEnum) | The type of transfer that results from the sweep.  Possible values:   - **bank**: Sweep to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  Required when setting &#x60;priorities&#x60;. |  [optional] |
|**counterparty** | [**SweepCounterparty**](SweepCounterparty.md) | The destination or the source of the funds, depending on the &#x60;type&#x60;.  Either a &#x60;balanceAccountId&#x60;, &#x60;transferInstrumentId&#x60;, or &#x60;merchantAccount&#x60; is required. |  |
|**currency** | **String** | The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**.  The sweep currency must match any of the [balances currencies](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__resParam_balances). |  |
|**description** | **String** | The message that will be used in the sweep transfer&#39;s description body with a maximum length of 140 characters.  If the message is longer after replacing placeholders, the message will be cut off at 140 characters. |  [optional] |
|**id** | **String** | The unique identifier of the sweep. |  [readonly] |
|**priorities** | [**List&lt;PrioritiesEnum&gt;**](#List&lt;PrioritiesEnum&gt;) | The list of priorities for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. You can provide multiple priorities. Adyen will try to pay out using the priority listed first, and if that&#39;s not possible, it moves on to the next option in the order of provided priorities.  Possible values:  * **regular**: For normal, low-value transactions.  * **fast**: Faster way to transfer funds but has higher fees. Recommended for high-priority, low-value transactions.  * **wire**: Fastest way to transfer funds but has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: Instant way to transfer funds in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: High-value transfer to a recipient in a different country.  * **internal**: Transfer to an Adyen-issued business bank account (by bank account number/IBAN).  Set &#x60;category&#x60; to **bank**. For more details, see [optional priorities setup](https://docs.adyen.com/marketplaces-and-platforms/payout-to-users/scheduled-payouts#optional-priorities-setup). |  [optional] |
|**reason** | [**ReasonEnum**](#ReasonEnum) | The reason for disabling the sweep. |  [optional] [readonly] |
|**schedule** | [**SweepConfigurationV2Schedule**](SweepConfigurationV2Schedule.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.    |  [optional] |
|**sweepAmount** | [**Amount**](Amount.md) | The amount that must be pushed out or pulled in. You can configure either &#x60;sweepAmount&#x60; or &#x60;targetAmount&#x60;, not both. |  [optional] |
|**targetAmount** | [**Amount**](Amount.md) | The amount that must be available in the balance account after the sweep. You can configure either &#x60;sweepAmount&#x60; or &#x60;targetAmount&#x60;, not both. |  [optional] |
|**triggerAmount** | [**Amount**](Amount.md) | The threshold amount that triggers the sweep. If not provided, by default, the amount is set to zero. The &#x60;triggerAmount&#x60; is evaluated according to the specified &#x60;schedule.type&#x60;.  * For &#x60;type&#x60; **pull**, if the balance is less than or equal to the &#x60;triggerAmount&#x60;, funds are pulled in to the balance account.  * For &#x60;type&#x60; **push**, if the balance is more than or equal to the &#x60;triggerAmount&#x60;, funds are pushed out of the balance account. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account. |  [optional] |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| BANK | &quot;bank&quot; |
| INTERNAL | &quot;internal&quot; |
| PLATFORM_PAYMENT | &quot;platformPayment&quot; |



## Enum: List&lt;PrioritiesEnum&gt;

| Name | Value |
|---- | -----|
| CROSS_BORDER | &quot;crossBorder&quot; |
| DIRECT_DEBIT | &quot;directDebit&quot; |
| FAST | &quot;fast&quot; |
| INSTANT | &quot;instant&quot; |
| INTERNAL | &quot;internal&quot; |
| REGULAR | &quot;regular&quot; |
| WIRE | &quot;wire&quot; |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| AMOUNT_LIMIT_EXCEEDED | &quot;amountLimitExceeded&quot; |
| APPROVED | &quot;approved&quot; |
| COUNTERPARTY_ACCOUNT_BLOCKED | &quot;counterpartyAccountBlocked&quot; |
| COUNTERPARTY_ACCOUNT_CLOSED | &quot;counterpartyAccountClosed&quot; |
| COUNTERPARTY_ACCOUNT_NOT_FOUND | &quot;counterpartyAccountNotFound&quot; |
| COUNTERPARTY_ADDRESS_REQUIRED | &quot;counterpartyAddressRequired&quot; |
| COUNTERPARTY_BANK_TIMED_OUT | &quot;counterpartyBankTimedOut&quot; |
| COUNTERPARTY_BANK_UNAVAILABLE | &quot;counterpartyBankUnavailable&quot; |
| ERROR | &quot;error&quot; |
| NOT_ENOUGH_BALANCE | &quot;notEnoughBalance&quot; |
| REFUSED_BY_COUNTERPARTY_BANK | &quot;refusedByCounterpartyBank&quot; |
| ROUTE_NOT_FOUND | &quot;routeNotFound&quot; |
| UNKNOWN | &quot;unknown&quot; |



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



