# StringInSearch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | **int** |  | [optional] 
**internal_project_id** | **int** |  | [optional] 
**last_updated** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**project_id** | **int** |  | [optional] 
**search_score** | **float** |  | [optional] 
**source** | **str** |  | [optional] 
**status** | [**StringTranslationState**](StringTranslationState.md) |  | [optional] 
**string_id** | **int** |  | [optional] 
**target** | **str** |  | [optional] 
**targets** | **List[str]** |  | [optional] 
**tm_name** | **str** |  | [optional] 
**type** | **str** | String search result typ from ZNT. Options are LOCAL_PROJECT, IMPORTED_TM. Imported TM results should probably not be visible to end users. | [optional] 

## Example

```python
from openapi_client.models.string_in_search import StringInSearch

# TODO update the JSON string below
json = "{}"
# create an instance of StringInSearch from a JSON string
string_in_search_instance = StringInSearch.from_json(json)
# print the JSON string representation of the object
print(StringInSearch.to_json())

# convert the object into a dict
string_in_search_dict = string_in_search_instance.to_dict()
# create an instance of StringInSearch from a dict
string_in_search_from_dict = StringInSearch.from_dict(string_in_search_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


