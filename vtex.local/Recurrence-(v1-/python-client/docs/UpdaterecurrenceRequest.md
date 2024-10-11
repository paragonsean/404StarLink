# UpdaterecurrenceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_day** | **int** |  | 
**delivery_weekday** | **str** |  | 
**email** | **str** |  | 
**items** | [**List[Item]**](Item.md) |  | 
**payment_account_id** | **str** |  | 

## Example

```python
from openapi_client.models.updaterecurrence_request import UpdaterecurrenceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdaterecurrenceRequest from a JSON string
updaterecurrence_request_instance = UpdaterecurrenceRequest.from_json(json)
# print the JSON string representation of the object
print(UpdaterecurrenceRequest.to_json())

# convert the object into a dict
updaterecurrence_request_dict = updaterecurrence_request_instance.to_dict()
# create an instance of UpdaterecurrenceRequest from a dict
updaterecurrence_request_from_dict = UpdaterecurrenceRequest.from_dict(updaterecurrence_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


