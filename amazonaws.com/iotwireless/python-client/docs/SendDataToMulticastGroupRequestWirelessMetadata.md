# SendDataToMulticastGroupRequestWirelessMetadata

Wireless metadata that is to be sent to multicast group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**LoRaWANMulticastMetadata**](LoRaWANMulticastMetadata.md) |  | [optional] 

## Example

```python
from openapi_client.models.send_data_to_multicast_group_request_wireless_metadata import SendDataToMulticastGroupRequestWirelessMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of SendDataToMulticastGroupRequestWirelessMetadata from a JSON string
send_data_to_multicast_group_request_wireless_metadata_instance = SendDataToMulticastGroupRequestWirelessMetadata.from_json(json)
# print the JSON string representation of the object
print(SendDataToMulticastGroupRequestWirelessMetadata.to_json())

# convert the object into a dict
send_data_to_multicast_group_request_wireless_metadata_dict = send_data_to_multicast_group_request_wireless_metadata_instance.to_dict()
# create an instance of SendDataToMulticastGroupRequestWirelessMetadata from a dict
send_data_to_multicast_group_request_wireless_metadata_from_dict = SendDataToMulticastGroupRequestWirelessMetadata.from_dict(send_data_to_multicast_group_request_wireless_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


