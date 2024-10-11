

# Card


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authentication** | [**Authentication**](Authentication.md) |  |  [optional] |
|**bin** | **String** | The bank identification number (BIN) of the card number. |  [optional] |
|**brand** | **String** | The brand of the physical or the virtual card. Possible values: **visa**, **mc**. |  |
|**brandVariant** | **String** | The brand variant of the physical or the virtual card. &gt;Contact your Adyen Implementation Manager to get the values that are relevant to your integration. Examples: **visadebit**, **mcprepaid**. |  |
|**cardholderName** | **String** | The name of the cardholder.  Maximum length: 26 characters. |  |
|**_configuration** | [**CardConfiguration**](CardConfiguration.md) |  |  [optional] |
|**cvc** | **String** | The CVC2 value of the card. &gt; The CVC2 is not sent by default. This is only returned in the &#x60;POST&#x60; response for single-use virtual cards. |  [optional] |
|**deliveryContact** | [**Contact**](Contact.md) |  |  [optional] |
|**expiration** | [**Expiry**](Expiry.md) |  |  [optional] |
|**formFactor** | [**FormFactorEnum**](#FormFactorEnum) | The form factor of the card. Possible values: **virtual**, **physical**. |  |
|**lastFour** | **String** | Last last four digits of the card number. |  [optional] |
|**number** | **String** | The primary account number (PAN) of the card. &gt; The PAN is masked by default and returned only for single-use virtual cards. |  [readonly] |



## Enum: FormFactorEnum

| Name | Value |
|---- | -----|
| PHYSICAL | &quot;physical&quot; |
| UNKNOWN | &quot;unknown&quot; |
| VIRTUAL | &quot;virtual&quot; |



