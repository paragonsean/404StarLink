# FilterContents


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budget_codes** | **List[str]** |  | [optional] 
**categories** | **List[str]** |  | [optional] 
**clients** | [**List[SimpleModel]**](SimpleModel.md) |  | [optional] 
**documents** | [**List[SimpleModel]**](SimpleModel.md) |  | [optional] 
**projects** | [**List[SimpleModel]**](SimpleModel.md) |  | [optional] 
**severities** | **List[str]** |  | [optional] 
**source_languages** | **List[str]** |  | [optional] 
**subjects** | **List[str]** |  | [optional] 
**target_languages** | **List[str]** |  | [optional] 
**vendors** | [**List[SimpleModel]**](SimpleModel.md) |  | [optional] 

## Example

```python
from openapi_client.models.filter_contents import FilterContents

# TODO update the JSON string below
json = "{}"
# create an instance of FilterContents from a JSON string
filter_contents_instance = FilterContents.from_json(json)
# print the JSON string representation of the object
print(FilterContents.to_json())

# convert the object into a dict
filter_contents_dict = filter_contents_instance.to_dict()
# create an instance of FilterContents from a dict
filter_contents_from_dict = FilterContents.from_dict(filter_contents_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


