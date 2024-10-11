# Execute

Executes the Javascript passes as 'script' parameter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**script** | **str** | The JavaScript snippet to run | [optional] 

## Example

```python
from openapi_client.models.execute import Execute

# TODO update the JSON string below
json = "{}"
# create an instance of Execute from a JSON string
execute_instance = Execute.from_json(json)
# print the JSON string representation of the object
print(Execute.to_json())

# convert the object into a dict
execute_dict = execute_instance.to_dict()
# create an instance of Execute from a dict
execute_from_dict = Execute.from_dict(execute_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


