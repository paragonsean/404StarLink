# CreateServiceProfileRequestLoRaWAN


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**add_gw_metadata** | **bool** |  | [optional] 
**dr_min** | **int** |  | [optional] 
**dr_max** | **int** |  | [optional] 
**pr_allowed** | **bool** |  | [optional] 
**ra_allowed** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.create_service_profile_request_lo_ra_wan import CreateServiceProfileRequestLoRaWAN

# TODO update the JSON string below
json = "{}"
# create an instance of CreateServiceProfileRequestLoRaWAN from a JSON string
create_service_profile_request_lo_ra_wan_instance = CreateServiceProfileRequestLoRaWAN.from_json(json)
# print the JSON string representation of the object
print(CreateServiceProfileRequestLoRaWAN.to_json())

# convert the object into a dict
create_service_profile_request_lo_ra_wan_dict = create_service_profile_request_lo_ra_wan_instance.to_dict()
# create an instance of CreateServiceProfileRequestLoRaWAN from a dict
create_service_profile_request_lo_ra_wan_from_dict = CreateServiceProfileRequestLoRaWAN.from_dict(create_service_profile_request_lo_ra_wan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


