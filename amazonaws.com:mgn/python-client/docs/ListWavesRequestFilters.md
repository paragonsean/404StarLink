# ListWavesRequestFilters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_archived** | **bool** |  | [optional] 
**wave_ids** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.list_waves_request_filters import ListWavesRequestFilters

# TODO update the JSON string below
json = "{}"
# create an instance of ListWavesRequestFilters from a JSON string
list_waves_request_filters_instance = ListWavesRequestFilters.from_json(json)
# print the JSON string representation of the object
print(ListWavesRequestFilters.to_json())

# convert the object into a dict
list_waves_request_filters_dict = list_waves_request_filters_instance.to_dict()
# create an instance of ListWavesRequestFilters from a dict
list_waves_request_filters_from_dict = ListWavesRequestFilters.from_dict(list_waves_request_filters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


