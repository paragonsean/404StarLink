# MulticastWirelessMetadata

Wireless metadata that is to be sent to multicast group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**LoRaWANMulticastMetadata**](LoRaWANMulticastMetadata.md) |  | [optional] 

## Example

```python
from openapi_client.models.multicast_wireless_metadata import MulticastWirelessMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of MulticastWirelessMetadata from a JSON string
multicast_wireless_metadata_instance = MulticastWirelessMetadata.from_json(json)
# print the JSON string representation of the object
print(MulticastWirelessMetadata.to_json())

# convert the object into a dict
multicast_wireless_metadata_dict = multicast_wireless_metadata_instance.to_dict()
# create an instance of MulticastWirelessMetadata from a dict
multicast_wireless_metadata_from_dict = MulticastWirelessMetadata.from_dict(multicast_wireless_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


