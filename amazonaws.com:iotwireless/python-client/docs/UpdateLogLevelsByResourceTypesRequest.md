# UpdateLogLevelsByResourceTypesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_log_level** | **str** | The log level for a log message. The log levels can be disabled, or set to &lt;code&gt;ERROR&lt;/code&gt; to display less verbose logs containing only error information, or to &lt;code&gt;INFO&lt;/code&gt; for more detailed logs. | [optional] 
**wireless_device_log_options** | [**List[WirelessDeviceLogOption]**](WirelessDeviceLogOption.md) | The list of wireless device log options. | [optional] 
**wireless_gateway_log_options** | [**List[WirelessGatewayLogOption]**](WirelessGatewayLogOption.md) | The list of wireless gateway log options. | [optional] 

## Example

```python
from openapi_client.models.update_log_levels_by_resource_types_request import UpdateLogLevelsByResourceTypesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateLogLevelsByResourceTypesRequest from a JSON string
update_log_levels_by_resource_types_request_instance = UpdateLogLevelsByResourceTypesRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateLogLevelsByResourceTypesRequest.to_json())

# convert the object into a dict
update_log_levels_by_resource_types_request_dict = update_log_levels_by_resource_types_request_instance.to_dict()
# create an instance of UpdateLogLevelsByResourceTypesRequest from a dict
update_log_levels_by_resource_types_request_from_dict = UpdateLogLevelsByResourceTypesRequest.from_dict(update_log_levels_by_resource_types_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


