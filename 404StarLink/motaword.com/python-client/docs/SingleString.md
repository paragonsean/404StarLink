# SingleString


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | source string content | [optional] 
**file_id** | **int** |  | [optional] 
**id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.single_string import SingleString

# TODO update the JSON string below
json = "{}"
# create an instance of SingleString from a JSON string
single_string_instance = SingleString.from_json(json)
# print the JSON string representation of the object
print(SingleString.to_json())

# convert the object into a dict
single_string_dict = single_string_instance.to_dict()
# create an instance of SingleString from a dict
single_string_from_dict = SingleString.from_dict(single_string_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


