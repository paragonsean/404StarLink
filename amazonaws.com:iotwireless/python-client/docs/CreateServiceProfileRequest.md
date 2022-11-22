# CreateServiceProfileRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the new resource. | [optional] 
**lo_ra_wan** | [**CreateServiceProfileRequestLoRaWAN**](CreateServiceProfileRequestLoRaWAN.md) |  | [optional] 
**tags** | [**List[Tag]**](Tag.md) | The tag to attach to the specified resource. Tags are metadata that you can use to manage a resource. | [optional] 
**client_request_token** | **str** | Each resource must have a unique client request token. If you try to create a new resource with the same token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request. | [optional] 

## Example

```python
from openapi_client.models.create_service_profile_request import CreateServiceProfileRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateServiceProfileRequest from a JSON string
create_service_profile_request_instance = CreateServiceProfileRequest.from_json(json)
# print the JSON string representation of the object
print(CreateServiceProfileRequest.to_json())

# convert the object into a dict
create_service_profile_request_dict = create_service_profile_request_instance.to_dict()
# create an instance of CreateServiceProfileRequest from a dict
create_service_profile_request_from_dict = CreateServiceProfileRequest.from_dict(create_service_profile_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


