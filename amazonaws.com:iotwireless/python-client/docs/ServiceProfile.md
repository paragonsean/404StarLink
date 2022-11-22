# ServiceProfile

Information about a service profile.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.service_profile import ServiceProfile

# TODO update the JSON string below
json = "{}"
# create an instance of ServiceProfile from a JSON string
service_profile_instance = ServiceProfile.from_json(json)
# print the JSON string representation of the object
print(ServiceProfile.to_json())

# convert the object into a dict
service_profile_dict = service_profile_instance.to_dict()
# create an instance of ServiceProfile from a dict
service_profile_from_dict = ServiceProfile.from_dict(service_profile_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


