# ListDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**color_count** | **int** |  | [optional] 
**description** | **str** |  | [optional] 
**key** | **str** |  | [optional] 
**license** | **str** |  | [optional] 
**source** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_description import ListDescription

# TODO update the JSON string below
json = "{}"
# create an instance of ListDescription from a JSON string
list_description_instance = ListDescription.from_json(json)
# print the JSON string representation of the object
print(ListDescription.to_json())

# convert the object into a dict
list_description_dict = list_description_instance.to_dict()
# create an instance of ListDescription from a dict
list_description_from_dict = ListDescription.from_dict(list_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


