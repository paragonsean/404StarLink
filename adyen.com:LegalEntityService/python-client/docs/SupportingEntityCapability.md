# SupportingEntityCapability


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowed** | **bool** | Indicates whether the supporting entity capability is allowed.  If a supporting entity is allowed but its parent legal entity is not, it means there are other supporting entities that failed validation.  **The allowed supporting entity can still be used** | [optional] [readonly] 
**id** | **str** | Supporting entity reference  | [optional] [readonly] 
**requested** | **bool** | Indicates whether the supporting entity capability is requested.  | [optional] [readonly] 
**verification_status** | **str** | The status of the verification checks for the supporting entity capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the &#x60;errors&#x60; array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability.  | [optional] [readonly] 

## Example

```python
from openapi_client.models.supporting_entity_capability import SupportingEntityCapability

# TODO update the JSON string below
json = "{}"
# create an instance of SupportingEntityCapability from a JSON string
supporting_entity_capability_instance = SupportingEntityCapability.from_json(json)
# print the JSON string representation of the object
print(SupportingEntityCapability.to_json())

# convert the object into a dict
supporting_entity_capability_dict = supporting_entity_capability_instance.to_dict()
# create an instance of SupportingEntityCapability from a dict
supporting_entity_capability_from_dict = SupportingEntityCapability.from_dict(supporting_entity_capability_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


