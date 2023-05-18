

# AccountHolderInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**balancePlatform** | **String** | The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balancePlatforms/{id}__queryParam_id) to which the account holder belongs. Required in the request if your API credentials can be used for multiple balance platforms. |  [optional] |
|**capabilities** | [**Map&lt;String, AccountHolderCapability&gt;**](AccountHolderCapability.md) | Contains key-value pairs that specify the actions that an account holder can do in your platform. The key is a capability required for your integration. For example, **issueCard** for Issuing. The value is an object containing the settings for the capability. |  [optional] |
|**contactDetails** | [**ContactDetails**](ContactDetails.md) | Contact details of the account holder. |  [optional] |
|**description** | **String** | Your description for the account holder, maximum 300 characters. |  [optional] |
|**legalEntityId** | **String** | The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id) associated with the account holder. Adyen performs a verification process against the legal entity of the account holder. |  |
|**reference** | **String** | Your reference for the account holder, maximum 150 characters. |  [optional] |
|**timeZone** | **String** | The [time zone](https://www.iana.org/time-zones) of the account holder. For example, **Europe/Amsterdam**. Defaults to the time zone of the balance platform if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). |  [optional] |



