# ListServiceProfilesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_token** | **str** |  | [optional] 
**service_profile_list** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.list_service_profiles_response import ListServiceProfilesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListServiceProfilesResponse from a JSON string
list_service_profiles_response_instance = ListServiceProfilesResponse.from_json(json)
# print the JSON string representation of the object
print(ListServiceProfilesResponse.to_json())

# convert the object into a dict
list_service_profiles_response_dict = list_service_profiles_response_instance.to_dict()
# create an instance of ListServiceProfilesResponse from a dict
list_service_profiles_response_from_dict = ListServiceProfilesResponse.from_dict(list_service_profiles_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


