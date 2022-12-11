# AsyncOperationStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration** | **int** | operation duration in milliseconds | [optional] 
**key** | **str** |  | [optional] 
**message** | **object** |  | [optional] 
**status** | [**AsyncOperationStatusEnum**](AsyncOperationStatusEnum.md) |  | [optional] [default to AsyncOperationStatusEnum.SENT]

## Example

```python
from openapi_client.models.async_operation_status import AsyncOperationStatus

# TODO update the JSON string below
json = "{}"
# create an instance of AsyncOperationStatus from a JSON string
async_operation_status_instance = AsyncOperationStatus.from_json(json)
# print the JSON string representation of the object
print(AsyncOperationStatus.to_json())

# convert the object into a dict
async_operation_status_dict = async_operation_status_instance.to_dict()
# create an instance of AsyncOperationStatus from a dict
async_operation_status_from_dict = AsyncOperationStatus.from_dict(async_operation_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


