# MessageResult

Provides information about the results of sending a message directly to an endpoint address.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_status** | [**DeliveryStatus**](DeliveryStatus.md) |  | 
**message_id** | **str** |  | [optional] 
**status_code** | **int** |  | 
**status_message** | **str** |  | [optional] 
**updated_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.message_result import MessageResult

# TODO update the JSON string below
json = "{}"
# create an instance of MessageResult from a JSON string
message_result_instance = MessageResult.from_json(json)
# print the JSON string representation of the object
print(MessageResult.to_json())

# convert the object into a dict
message_result_dict = message_result_instance.to_dict()
# create an instance of MessageResult from a dict
message_result_from_dict = MessageResult.from_dict(message_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


