

# TransactionRuleRestrictions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeNetworkTokens** | [**ActiveNetworkTokensRestriction**](ActiveNetworkTokensRestriction.md) | The total number of tokens that a card can have across different kinds of digital wallets on the user&#39;s phones, watches, or other wearables.  Supported operations: **equals**, **notEquals**, **greaterThanOrEqualTo**, **greaterThan**, **lessThanOrEqualTo**, **lessThan**. |  [optional] |
|**brandVariants** | [**BrandVariantsRestriction**](BrandVariantsRestriction.md) | List of card brand variants and the operation.  Supported operations: **anyMatch**, **noneMatch**. |  [optional] |
|**countries** | [**CountriesRestriction**](CountriesRestriction.md) | List of countries and the operation.  Supported operations: **anyMatch**, **noneMatch**. |  [optional] |
|**dayOfWeek** | [**DayOfWeekRestriction**](DayOfWeekRestriction.md) | List of week days and the operation. Supported operations: **anyMatch**, **noneMatch**. |  [optional] |
|**differentCurrencies** | [**DifferentCurrenciesRestriction**](DifferentCurrenciesRestriction.md) | Compares the currency of the payment against the currency of the payment instrument, and specifies the operation.  Supported operations: **equals**, **notEquals**. |  [optional] |
|**entryModes** | [**EntryModesRestriction**](EntryModesRestriction.md) | List of point-of-sale entry modes and the operation..  Supported operations: **anyMatch**, **noneMatch**. |  [optional] |
|**internationalTransaction** | [**InternationalTransactionRestriction**](InternationalTransactionRestriction.md) | Indicates whether transaction is an international transaction and specifies the operation.  Supported operations: **equals**, **notEquals**. |  [optional] |
|**matchingTransactions** | [**MatchingTransactionsRestriction**](MatchingTransactionsRestriction.md) | The number of transactions and the operation.  Supported operations: **equals**, **notEquals**, **greaterThanOrEqualTo**, **greaterThan**, **lessThanOrEqualTo**, **lessThan**. |  [optional] |
|**mccs** | [**MccsRestriction**](MccsRestriction.md) | List of merchant category codes (MCCs) and the operation.  Supported operations: **anyMatch**, **noneMatch**. |  [optional] |
|**merchantNames** | [**MerchantNamesRestriction**](MerchantNamesRestriction.md) | List of names that will be compared to the merchant name according to the matching type.  Supported operations: **anyMatch**, **noneMatch**. |  [optional] |
|**merchants** | [**MerchantsRestriction**](MerchantsRestriction.md) | List of merchant ID and acquirer ID pairs, and the operation.  Supported operations: **anyMatch**, **noneMatch**. |  [optional] |
|**processingTypes** | [**ProcessingTypesRestriction**](ProcessingTypesRestriction.md) | List of processing types and the operation.  Supported operations: **anyMatch**, **noneMatch**. |  [optional] |
|**timeOfDay** | [**TimeOfDayRestriction**](TimeOfDayRestriction.md) | A start and end time in a time-only ISO-8601 extended offset format. Supported operations: **equals**, **notEquals**. |  [optional] |
|**totalAmount** | [**TotalAmountRestriction**](TotalAmountRestriction.md) | The total amount and the operation.  Supported operations: **equals**, **notEquals**, **greaterThanOrEqualTo**, **greaterThan**, **lessThanOrEqualTo**, **lessThan**. |  [optional] |



