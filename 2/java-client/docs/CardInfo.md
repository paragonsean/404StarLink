

# CardInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authentication** | [**Authentication**](Authentication.md) | Contains the card user&#39;s password and mobile phone number. This is required when you issue cards that can be used to make online payments within the EEA and the UK, or can be added to digital wallets. Refer to [3D Secure and digital wallets](https://docs.adyen.com/issuing/3d-secure-and-wallets) for more information. |  [optional] |
|**brand** | **String** | The brand of the physical or the virtual card. Possible values: **visa**, **mc**. |  |
|**brandVariant** | **String** | The brand variant of the physical or the virtual card. &gt;Contact your Adyen Implementation Manager to get the values that are relevant to your integration. Examples: **visadebit**, **mcprepaid**. |  |
|**cardholderName** | **String** | The name of the cardholder.  Maximum length: 26 characters. |  |
|**_configuration** | [**CardConfiguration**](CardConfiguration.md) | Settings required when creating a physical or a virtual card.   Reach out to your Adyen contact to get the values that you can send in this object. |  [optional] |
|**deliveryContact** | [**DeliveryContact**](DeliveryContact.md) | The delivery contact (name and address) for physical card delivery. |  [optional] |
|**formFactor** | [**FormFactorEnum**](#FormFactorEnum) | The form factor of the card. Possible values: **virtual**, **physical**. |  |



## Enum: FormFactorEnum

| Name | Value |
|---- | -----|
| PHYSICAL | &quot;physical&quot; |
| UNKNOWN | &quot;unknown&quot; |
| VIRTUAL | &quot;virtual&quot; |



