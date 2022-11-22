# LoRaWANMulticastMetadata

The metadata information of the LoRaWAN multicast group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**f_port** | **int** | The Fport value. | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_multicast_metadata import LoRaWANMulticastMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANMulticastMetadata from a JSON string
lo_ra_wan_multicast_metadata_instance = LoRaWANMulticastMetadata.from_json(json)
# print the JSON string representation of the object
print(LoRaWANMulticastMetadata.to_json())

# convert the object into a dict
lo_ra_wan_multicast_metadata_dict = lo_ra_wan_multicast_metadata_instance.to_dict()
# create an instance of LoRaWANMulticastMetadata from a dict
lo_ra_wan_multicast_metadata_from_dict = LoRaWANMulticastMetadata.from_dict(lo_ra_wan_multicast_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


