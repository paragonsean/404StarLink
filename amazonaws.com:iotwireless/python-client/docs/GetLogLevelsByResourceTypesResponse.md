# GetLogLevelsByResourceTypesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_log_level** | [**LogLevel**](LogLevel.md) |  | [optional] 
**wireless_gateway_log_options** | [**List[WirelessGatewayLogOption]**](WirelessGatewayLogOption.md) | The list of wireless gateway log options. | [optional] 
**wireless_device_log_options** | [**List[WirelessDeviceLogOption]**](WirelessDeviceLogOption.md) | The list of wireless device log options. | [optional] 

## Example

```python
from openapi_client.models.get_log_levels_by_resource_types_response import GetLogLevelsByResourceTypesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetLogLevelsByResourceTypesResponse from a JSON string
get_log_levels_by_resource_types_response_instance = GetLogLevelsByResourceTypesResponse.from_json(json)
# print the JSON string representation of the object
print(GetLogLevelsByResourceTypesResponse.to_json())

# convert the object into a dict
get_log_levels_by_resource_types_response_dict = get_log_levels_by_resource_types_response_instance.to_dict()
# create an instance of GetLogLevelsByResourceTypesResponse from a dict
get_log_levels_by_resource_types_response_from_dict = GetLogLevelsByResourceTypesResponse.from_dict(get_log_levels_by_resource_types_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


