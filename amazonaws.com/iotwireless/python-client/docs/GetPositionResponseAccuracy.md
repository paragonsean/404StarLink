# GetPositionResponseAccuracy


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**horizontal_accuracy** | **float** |  | [optional] 
**vertical_accuracy** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.get_position_response_accuracy import GetPositionResponseAccuracy

# TODO update the JSON string below
json = "{}"
# create an instance of GetPositionResponseAccuracy from a JSON string
get_position_response_accuracy_instance = GetPositionResponseAccuracy.from_json(json)
# print the JSON string representation of the object
print(GetPositionResponseAccuracy.to_json())

# convert the object into a dict
get_position_response_accuracy_dict = get_position_response_accuracy_instance.to_dict()
# create an instance of GetPositionResponseAccuracy from a dict
get_position_response_accuracy_from_dict = GetPositionResponseAccuracy.from_dict(get_position_response_accuracy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


