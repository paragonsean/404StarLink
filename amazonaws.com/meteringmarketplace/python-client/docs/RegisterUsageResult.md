# RegisterUsageResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**public_key_rotation_timestamp** | **datetime** |  | [optional] 
**signature** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.register_usage_result import RegisterUsageResult

# TODO update the JSON string below
json = "{}"
# create an instance of RegisterUsageResult from a JSON string
register_usage_result_instance = RegisterUsageResult.from_json(json)
# print the JSON string representation of the object
print(RegisterUsageResult.to_json())

# convert the object into a dict
register_usage_result_dict = register_usage_result_instance.to_dict()
# create an instance of RegisterUsageResult from a dict
register_usage_result_from_dict = RegisterUsageResult.from_dict(register_usage_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


