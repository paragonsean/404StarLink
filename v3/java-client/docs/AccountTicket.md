

# AccountTicket

JSON template for an Analytics account ticket. The account ticket consists of the ticket ID and the basic information for the account, property and profile.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**account** | [**Account**](Account.md) |  |  [optional] |
|**id** | **String** | Account ticket ID used to access the account ticket. |  [optional] |
|**kind** | **String** | Resource type for account ticket. |  [optional] |
|**profile** | [**Profile**](Profile.md) |  |  [optional] |
|**redirectUri** | **String** | Redirect URI where the user will be sent after accepting Terms of Service. Must be configured in APIs console as a callback URL. |  [optional] |
|**webproperty** | [**Webproperty**](Webproperty.md) |  |  [optional] |



