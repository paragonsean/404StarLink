

# CardInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authentication** | [**Authentication**](Authentication.md) |  |  [optional] |
|**brand** | **String** | The brand of the physical or the virtual card. Possible values: **visa**, **mc**. |  |
|**brandVariant** | **String** | The brand variant of the physical or the virtual card. &gt;Contact your Adyen Implementation Manager to get the values that are relevant to your integration. Examples: **visadebit**, **mcprepaid**. |  |
|**cardholderName** | **String** | The name of the cardholder.  Maximum length: 26 characters. |  |
|**_configuration** | [**CardConfiguration**](CardConfiguration.md) |  |  [optional] |
|**deliveryContact** | [**Contact**](Contact.md) |  |  [optional] |
|**formFactor** | [**FormFactorEnum**](#FormFactorEnum) | The form factor of the card. Possible values: **virtual**, **physical**. |  |



## Enum: FormFactorEnum

| Name | Value |
|---- | -----|
| PHYSICAL | &quot;physical&quot; |
| UNKNOWN | &quot;unknown&quot; |
| VIRTUAL | &quot;virtual&quot; |



