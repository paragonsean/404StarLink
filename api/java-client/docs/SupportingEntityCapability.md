

# SupportingEntityCapability


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowed** | **Boolean** | Indicates whether the supporting entity capability is allowed.  If a supporting entity is allowed but its parent legal entity is not, it means there are other supporting entities that failed validation.  **The allowed supporting entity can still be used** |  [optional] [readonly] |
|**id** | **String** | Supporting entity reference  |  [optional] [readonly] |
|**requested** | **Boolean** | Indicates whether the supporting entity capability is requested.  |  [optional] [readonly] |
|**verificationStatus** | **String** | The status of the verification checks for the supporting entity capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the &#x60;errors&#x60; array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability.  |  [optional] [readonly] |



