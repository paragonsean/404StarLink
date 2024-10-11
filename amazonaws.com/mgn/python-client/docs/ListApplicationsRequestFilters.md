# ListApplicationsRequestFilters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_ids** | **List** |  | [optional] 
**is_archived** | **bool** |  | [optional] 
**wave_ids** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.list_applications_request_filters import ListApplicationsRequestFilters

# TODO update the JSON string below
json = "{}"
# create an instance of ListApplicationsRequestFilters from a JSON string
list_applications_request_filters_instance = ListApplicationsRequestFilters.from_json(json)
# print the JSON string representation of the object
print(ListApplicationsRequestFilters.to_json())

# convert the object into a dict
list_applications_request_filters_dict = list_applications_request_filters_instance.to_dict()
# create an instance of ListApplicationsRequestFilters from a dict
list_applications_request_filters_from_dict = ListApplicationsRequestFilters.from_dict(list_applications_request_filters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


