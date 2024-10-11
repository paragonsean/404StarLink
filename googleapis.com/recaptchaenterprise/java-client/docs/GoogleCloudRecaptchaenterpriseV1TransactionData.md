

# GoogleCloudRecaptchaenterpriseV1TransactionData

Transaction data associated with a payment protected by reCAPTCHA Enterprise. All fields are optional.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**billingAddress** | [**GoogleCloudRecaptchaenterpriseV1TransactionDataAddress**](GoogleCloudRecaptchaenterpriseV1TransactionDataAddress.md) |  |  [optional] |
|**cardBin** | **String** | The Bank Identification Number - generally the first 6 or 8 digits of the card. |  [optional] |
|**cardLastFour** | **String** | The last four digits of the card. |  [optional] |
|**currencyCode** | **String** | The currency code in ISO-4217 format. |  [optional] |
|**gatewayInfo** | [**GoogleCloudRecaptchaenterpriseV1TransactionDataGatewayInfo**](GoogleCloudRecaptchaenterpriseV1TransactionDataGatewayInfo.md) |  |  [optional] |
|**items** | [**List&lt;GoogleCloudRecaptchaenterpriseV1TransactionDataItem&gt;**](GoogleCloudRecaptchaenterpriseV1TransactionDataItem.md) | Items purchased in this transaction. |  [optional] |
|**merchants** | [**List&lt;GoogleCloudRecaptchaenterpriseV1TransactionDataUser&gt;**](GoogleCloudRecaptchaenterpriseV1TransactionDataUser.md) | Information about the user or users fulfilling the transaction. |  [optional] |
|**paymentMethod** | **String** | The payment method for the transaction. The allowed values are: * credit-card * debit-card * gift-card * processor-{name} (If a third-party is used, for example, processor-paypal) * custom-{name} (If an alternative method is used, for example, custom-crypto) |  [optional] |
|**shippingAddress** | [**GoogleCloudRecaptchaenterpriseV1TransactionDataAddress**](GoogleCloudRecaptchaenterpriseV1TransactionDataAddress.md) |  |  [optional] |
|**shippingValue** | **Double** | The value of shipping in the specified currency. 0 for free or no shipping. |  [optional] |
|**transactionId** | **String** | Unique identifier for the transaction. This custom identifier can be used to reference this transaction in the future, for example, labeling a refund or chargeback event. Two attempts at the same transaction should use the same transaction id. |  [optional] |
|**user** | [**GoogleCloudRecaptchaenterpriseV1TransactionDataUser**](GoogleCloudRecaptchaenterpriseV1TransactionDataUser.md) |  |  [optional] |
|**value** | **Double** | The decimal value of the transaction in the specified currency. |  [optional] |



