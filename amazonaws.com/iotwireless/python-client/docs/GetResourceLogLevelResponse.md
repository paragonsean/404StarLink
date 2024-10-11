# GetResourceLogLevelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**log_level** | [**LogLevel**](LogLevel.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_resource_log_level_response import GetResourceLogLevelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetResourceLogLevelResponse from a JSON string
get_resource_log_level_response_instance = GetResourceLogLevelResponse.from_json(json)
# print the JSON string representation of the object
print(GetResourceLogLevelResponse.to_json())

# convert the object into a dict
get_resource_log_level_response_dict = get_resource_log_level_response_instance.to_dict()
# create an instance of GetResourceLogLevelResponse from a dict
get_resource_log_level_response_from_dict = GetResourceLogLevelResponse.from_dict(get_resource_log_level_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


