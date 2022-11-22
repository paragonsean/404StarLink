# StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query_string** | **str** | Query string used to search for wireless devices as part of the bulk associate and disassociate process. | [optional] 
**tags** | [**List[Tag]**](Tag.md) | The tag to attach to the specified resource. Tags are metadata that you can use to manage a resource. | [optional] 

## Example

```python
from openapi_client.models.start_bulk_disassociate_wireless_device_from_multicast_group_request import StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest

# TODO update the JSON string below
json = "{}"
# create an instance of StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest from a JSON string
start_bulk_disassociate_wireless_device_from_multicast_group_request_instance = StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest.from_json(json)
# print the JSON string representation of the object
print(StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest.to_json())

# convert the object into a dict
start_bulk_disassociate_wireless_device_from_multicast_group_request_dict = start_bulk_disassociate_wireless_device_from_multicast_group_request_instance.to_dict()
# create an instance of StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest from a dict
start_bulk_disassociate_wireless_device_from_multicast_group_request_from_dict = StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest.from_dict(start_bulk_disassociate_wireless_device_from_multicast_group_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


