# GetAppsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applications_response** | [**ApplicationsResponse**](ApplicationsResponse.md) |  | 

## Example

```python
from openapi_client.models.get_apps_response import GetAppsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetAppsResponse from a JSON string
get_apps_response_instance = GetAppsResponse.from_json(json)
# print the JSON string representation of the object
print(GetAppsResponse.to_json())

# convert the object into a dict
get_apps_response_dict = get_apps_response_instance.to_dict()
# create an instance of GetAppsResponse from a dict
get_apps_response_from_dict = GetAppsResponse.from_dict(get_apps_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


