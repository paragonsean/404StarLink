# UpdatePaymentInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **str** |  | [optional] 
**country** | **str** |  | [optional] 
**phone** | **str** |  | [optional] 
**state** | **str** |  | [optional] 
**street** | **str** |  | [optional] 
**zip** | **str** |  | [optional] 
**bin** | **str** |  | [optional] 
**save_as_corporate_primary** | **bool** |  | [optional] 
**share_with_corporate_users** | **bool** |  | [optional] 
**stripe_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.update_payment_info import UpdatePaymentInfo

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePaymentInfo from a JSON string
update_payment_info_instance = UpdatePaymentInfo.from_json(json)
# print the JSON string representation of the object
print(UpdatePaymentInfo.to_json())

# convert the object into a dict
update_payment_info_dict = update_payment_info_instance.to_dict()
# create an instance of UpdatePaymentInfo from a dict
update_payment_info_from_dict = UpdatePaymentInfo.from_dict(update_payment_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


