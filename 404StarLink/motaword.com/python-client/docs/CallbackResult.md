# CallbackResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**Project**](Project.md) |  | [optional] 
**result** | **str** | Callback response returned from &#x60;url&#x60;. | [optional] 
**type** | [**ProjectStatus**](ProjectStatus.md) |  | [optional] 
**url** | **str** | The URL that received the callback. | [optional] 

## Example

```python
from openapi_client.models.callback_result import CallbackResult

# TODO update the JSON string below
json = "{}"
# create an instance of CallbackResult from a JSON string
callback_result_instance = CallbackResult.from_json(json)
# print the JSON string representation of the object
print(CallbackResult.to_json())

# convert the object into a dict
callback_result_dict = callback_result_instance.to_dict()
# create an instance of CallbackResult from a dict
callback_result_from_dict = CallbackResult.from_dict(callback_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


