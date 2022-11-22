# GetServiceProfileResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**lo_ra_wan** | [**GetServiceProfileResponseLoRaWAN**](GetServiceProfileResponseLoRaWAN.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_service_profile_response import GetServiceProfileResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetServiceProfileResponse from a JSON string
get_service_profile_response_instance = GetServiceProfileResponse.from_json(json)
# print the JSON string representation of the object
print(GetServiceProfileResponse.to_json())

# convert the object into a dict
get_service_profile_response_dict = get_service_profile_response_instance.to_dict()
# create an instance of GetServiceProfileResponse from a dict
get_service_profile_response_from_dict = GetServiceProfileResponse.from_dict(get_service_profile_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


