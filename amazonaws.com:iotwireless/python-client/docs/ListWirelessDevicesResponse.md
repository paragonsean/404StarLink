# ListWirelessDevicesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_token** | **str** |  | [optional] 
**wireless_device_list** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.list_wireless_devices_response import ListWirelessDevicesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListWirelessDevicesResponse from a JSON string
list_wireless_devices_response_instance = ListWirelessDevicesResponse.from_json(json)
# print the JSON string representation of the object
print(ListWirelessDevicesResponse.to_json())

# convert the object into a dict
list_wireless_devices_response_dict = list_wireless_devices_response_instance.to_dict()
# create an instance of ListWirelessDevicesResponse from a dict
list_wireless_devices_response_from_dict = ListWirelessDevicesResponse.from_dict(list_wireless_devices_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


